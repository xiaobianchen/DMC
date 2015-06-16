package com.dmc.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * 
 * Created by Xiaobian Chen on 2015年6月16日
 * This class is used to read site data from the specify url
 *
 */
public class GetUrlContentUtils {
	
	/**
	 * get html content from url
	 * @param htmlurl url address
	 * @return
	 */
	public static String getHtmlContent(String htmlurl) {
		BufferedReader br = null;
		URL url = null;
		String line = "";
		StringBuffer sb = new StringBuffer();

		try {
			url = new URL(htmlurl);
			br = new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
					

			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return sb.toString();
	}
	
	/**
	 * read content from local file
	 * override getHtmlContent method
	 * @param file
	 * @return
	 */
	public static String getHtmlContent(File file){
		BufferedReader br = null;
		String line = "";
		StringBuffer sb = new StringBuffer();
		
		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GB2312"));
			while((line=br.readLine())!=null){
				sb.append(line);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	    return sb.toString();
	}
	
	/**
	 * get title via regex expression from url site 
	 * @param htmlurl
	 * @return
	 */
	public static String getTitle(String htmlurl){
		String regex = "<title>.*?</title>";
		String title = "";
		List<String> titleList = new ArrayList<String>();
		
        Pattern pattern = Pattern.compile(regex,Pattern.CANON_EQ);
		Matcher match = pattern.matcher(htmlurl);
		while(match.find()){
			titleList.add(match.group());
		}
		
		for(int i = 0; i < titleList.size();i++){
			title = title + titleList.get(i);
		}
		
		return title.replaceAll("<.*?>", "");
	}
	
	/**
	 * get link from the url
	 * @param url
	 * @return
	 */
	public static List<String> getLink(String htmlurl){
		String regex = "<a[^>]*href=(\"([^\"]*)\"|\'([^\']*)\'|([^\\s>]*))[^>]*>(.*?)</a>";
		List<String> linkList = new ArrayList<String>();
		
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(htmlurl);
		
		while(match.find()){
			linkList.add(match.group());
		}
		
		return linkList;
	}
	
	/**
	 * get script
	 * @param content
	 * @return
	 */
	public static List<String> getScript(String htmlurl){
		String regex = "<SCRIPT.*?</SCRIPT>";
		List<String> scriptList = new ArrayList<String>();
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(htmlurl);
		
		while(matcher.find()){
			scriptList.add(matcher.group());
		}
		
		return scriptList;
	}
	
	/**
	 * get news
	 * @param content
	 * @return
	 */
	public static List<String> getNews(String htmlurl){
		 String regex = "<a.*?</a>";  
		 Pattern pattern = Pattern.compile(regex);
		 
		 List<String> list = new ArrayList<String>();
		 Matcher matcher = pattern.matcher(htmlurl);
		 while(matcher.find()){
			 list.add(matcher.group());
		 }
		 
		 return list;
	}
	
	/**
	 * get css
	 * @param content
	 * @return
	 */
	public static List<String> getCSS(String htmlurl){
		String regex = "<style.*?</style>";
		List<String> cssList = new ArrayList<String>();
		
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(htmlurl);
		
		while(match.find()){
			cssList.add(match.group());
		}
		return cssList;
	}
	
      public static void main(String[] args) throws Exception{
		
		/**
		 * step 1. get data from url by log in username and password
		 */
	    HttpClient client = new HttpClient(); 
	    PostMethod post = new PostMethod("https://login.taobao.com/member/login.jhtml");         
	    NameValuePair username = new NameValuePair("username", "test@email.com");     
	    NameValuePair password = new NameValuePair("password", "testpassword");     
	    post.setRequestBody(new NameValuePair[] { username, password });     
	    client.executeMethod(post);     
	    
	    String responseString = new String(post.getResponseBodyAsString().getBytes("gbk"));        
	    System.out.println("=========================登录页面===========================");          
	    System.out.println(responseString);  
	    
	    /**
	     * step2. you can invoke specify method by passed url
	     * for example:get link information from the url 
	     * System.out.println(getLink(responseString));
	     * 
	     */
	}
}
