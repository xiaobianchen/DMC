package com.dmc.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


/**
 * 
 * Created by Xiaobian Chen on 2015年9月7日
 *
 *
 */
public class HttpClientUtils {
    
	private List<String> cookies;
	private HttpsURLConnection conn; 
	private final String USER_AGENT = "Mozilla/5.0";
	
//	public static void main(String[] args) throws Exception {
//		
//		String url = "https://accounts.google.com/ServiceLoginAuth";
//		String gmail = "https://mail.google.com/mail/";
//
//		HttpClientUtils http = new HttpClientUtils();
//		
//		// make sure cookies is turn on
//		CookieHandler.setDefault(new CookieManager());
//		
//		//1.sent a get request
//		String page = http.getPageContent(url);
//		String postParms = http.getFormParms(page,"chenxiaobian89@163.com","ch4890467");
//		
//		//2.construct post's content and sent a post request
//		http.sentPost(url,postParms);
//		
//		//3.success go to gmail
//		String result = http.getPageContent(gmail);
//		System.out.println(result);
//	}

	
	public String getPageContent(String url) throws Exception {
		URL obj = new URL(url);
		conn = (HttpsURLConnection) obj.openConnection();

		// default is GET
		conn.setRequestMethod("GET");
		conn.setUseCaches(false);

		// act like a browser
		conn.setRequestProperty("User-Agent", USER_AGENT);
		conn.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		
		if (cookies != null) {
			for (String cookie : this.cookies) {
				conn.addRequestProperty("Cookie", cookie.split(";", 1)[0]);
			}
		}
		int responseCode = conn.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in =   new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// Get the response cookies
		setCookies(conn.getHeaderFields().get("Set-Cookie"));

		return response.toString();
	}

	public void sentPost(String url, String postParms) throws Exception {
		URL obj = new URL(url);
		conn = (HttpsURLConnection) obj.openConnection();

		// Acts like a browser
		conn.setUseCaches(false);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Host", "accounts.google.com");
		conn.setRequestProperty("User-Agent", USER_AGENT);
		conn.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		conn.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
		for (String cookie : this.cookies) {
			conn.addRequestProperty("Cookie", cookie.split(";", 1)[0]);
		}
		conn.setRequestProperty("Connection", "keep-alive");
		conn.setRequestProperty("Referer", "https://accounts.google.com/ServiceLoginAuth");
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		conn.setRequestProperty("Content-Length", Integer.toString(postParms.length()));

		conn.setDoOutput(true);
		conn.setDoInput(true);

		// Send post request
		DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
		wr.writeBytes(postParms);
		wr.flush();
		wr.close();

		int responseCode = conn.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + postParms);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = 
	             new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		
		in.close();

	}

	public List<String> getCookies() {
		return cookies;
	}

	public void setCookies(List<String> cookies) {
		this.cookies = cookies;
	}

	public String getFormParms(String html, String username, String password) throws Exception {
		System.out.println("Extracting form's data...");
		
		Document document = Jsoup.parse(html);
		Element loginform = document.getElementById("gaia_loginform");
		Elements inputElements = loginform.getElementsByTag("input");
		
		List<String> paramList = new ArrayList<String>();
		for (Element inputElement : inputElements) {
			String key = inputElement.attr("name");
			String value = inputElement.attr("value");

			if (key.equals("Email"))
				value = username;
			else if (key.equals("Passwd"))
				value = password;
			paramList.add(key + "=" + URLEncoder.encode(value, "UTF-8"));
		}

		// build parameters list
		StringBuilder result = new StringBuilder();
		for (String param : paramList) {
			if (result.length() == 0) {
				result.append(param);
			} else {
				result.append("&" + param);
			}
		}
		
		return result.toString();
	}
	
	public static String getRequest(String url) throws Exception{
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		
		request.addHeader("User-Agent", "Mozilla/5.0");
		HttpResponse response = client.execute(request);
		
		System.out.println("Response Code:" + response.getStatusLine().getStatusCode());
		BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		
		StringBuffer sb = new StringBuffer();
		String line = "";
		while((line = br.readLine())!=null){
			sb.append(line);
		}
		
		return sb.toString();
	}
}
