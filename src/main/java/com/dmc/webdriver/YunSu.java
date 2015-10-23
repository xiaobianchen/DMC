package com.dmc.webdriver;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Date;

import javax.imageio.ImageIO;

public class YunSu {
	
	/**
	 * ×Ö·û´®MD5¼ÓÃÜ
	 * @param s Ô­Ê¼×Ö·û´®
	 * @return  ¼ÓÃÜºó×Ö·û´®
	 */
	public final static String MD5(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] btInput = s.getBytes();
			MessageDigest mdInst = MessageDigest.getInstance("MD5");
			mdInst.update(btInput);
			byte[] md = mdInst.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Í¨ÓÃURLÇëÇó·½·¨
	 * @param url 		ÇëÇóURL£¬²»´ø²ÎÊý Èç£ºhttp://api.ysdm.net/register.xml
	 * @param param 	ÇëÇó²ÎÊý£¬Èç£ºusername=test&password=1
	 * @return 			Æ½Ì¨·µ»Ø½á¹ûXMLÑùÊ½ 
	 * @throws IOException
	 */
	public static String httpRequestData(String url, String param)
			throws IOException {
		URL u;
		HttpURLConnection con = null;
		OutputStreamWriter osw;
		StringBuffer buffer = new StringBuffer();

		u = new URL(url);
		con = (HttpURLConnection) u.openConnection();
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		con.setDoInput(true);
		con.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");

		osw = new OutputStreamWriter(con.getOutputStream(), "UTF-8");
		osw.write(param);
		osw.flush();
		osw.close();

		BufferedReader br = new BufferedReader(new InputStreamReader(con
				.getInputStream(), "UTF-8"));
		String temp;
		while ((temp = br.readLine()) != null) {
			buffer.append(temp);
			buffer.append("\n");
		}

		return buffer.toString();
	}

	/**
	 * ´ðÌâ
	 * @param url 			ÇëÇóURL£¬²»´ø²ÎÊý Èç£ºhttp://api.ysdm.net/register.xml
	 * @param param			ÇëÇó²ÎÊý£¬Èç£ºusername=test&password=1
	 * @param data			Í¼Æ¬¶þ½øÖÆÁ÷
	 * @return				Æ½Ì¨·µ»Ø½á¹ûXMLÑùÊ½ 
	 * @throws IOException
	 */
	public static String httpPostImage(String url, String param,
			byte[] data) throws IOException {
		long time = (new Date()).getTime();
		URL u = null;
		HttpURLConnection con = null;
		String boundary = "----------" + MD5(String.valueOf(time));
		String boundarybytesString = "\r\n--" + boundary + "\r\n";
		OutputStream out = null;
		
		u = new URL(url);
		
		con = (HttpURLConnection) u.openConnection();
		con.setRequestMethod("POST");
		//con.setReadTimeout(95000);   
		con.setConnectTimeout(95000); //´ËÖµÓëtimeout²ÎÊýÏà¹Ø£¬Èç¹ûtimeout²ÎÊýÊÇ90Ãë£¬ÕâÀï¾ÍÊÇ95000£¬½¨Òé¶à5Ãë
		con.setDoOutput(true);
		con.setDoInput(true);
		con.setUseCaches(true);
		con.setRequestProperty("Content-Type",
				"multipart/form-data; boundary=" + boundary);
		
		out = con.getOutputStream();
			
		for (String paramValue : param.split("[&]")) {
			out.write(boundarybytesString.getBytes("UTF-8"));
			String paramString = "Content-Disposition: form-data; name=\""
					+ paramValue.split("[=]")[0] + "\"\r\n\r\n" + paramValue.split("[=]")[1];
			out.write(paramString.getBytes("UTF-8"));
		}
		out.write(boundarybytesString.getBytes("UTF-8"));

		String paramString = "Content-Disposition: form-data; name=\"image\"; filename=\""
				+ "sample.gif" + "\"\r\nContent-Type: image/gif\r\n\r\n";
		out.write(paramString.getBytes("UTF-8"));
		
		out.write(data);
		
		String tailer = "\r\n--" + boundary + "--\r\n";
		out.write(tailer.getBytes("UTF-8"));

		out.flush();
		out.close();

		StringBuffer buffer = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(con
					.getInputStream(), "UTF-8"));
		String temp;
		while ((temp = br.readLine()) != null) {
			buffer.append(temp);
			buffer.append("\n");
		}

		return buffer.toString();
	}

	/**
	 * »ñÈ¡ÓÃ»§ÐÅÏ¢
	 * @param username	ÓÃ»§Ãû
	 * @param password	ÃÜÂë
	 * @return			Æ½Ì¨·µ»Ø½á¹ûXMLÑùÊ½ 
	 * @throws IOException
	 */
	public static String getInfo(String username, String password) {
		String param = String.format("username=%s&password=%s", username, password);
		String result;
		try {
			result = YunSu.httpRequestData(
					"http://api.ysdm.net/info.xml", param);
		} catch (IOException e) {
			result = "Î´ÖªÎÊÌâ";
		}
		return result;
	}
	
	/**
	 * ×¢²áÓÃ»§
	 * @param username	ÓÃ»§Ãû
	 * @param password	ÃÜÂë
	 * @param email		ÓÊÏä
	 * @return			Æ½Ì¨·µ»Ø½á¹ûXMLÑùÊ½ 
	 * @throws IOException
	 */
	public static String register(String username, String password, String email) {
		String param = String.format("username=%s&password=%s&email=%s", username, password, email);
		String result;
		try {
			result = YunSu.httpRequestData(
					"http://api.ysdm.net/register.xml", param);
		} catch (IOException e) {
			result = "Î´ÖªÎÊÌâ";
		}
		return result;
	}

	/**
	 * ³äÖµ
	 * @param username	ÓÃ»§Ãû
	 * @param id		¿¨ºÅ
	 * @param password	ÃÜÂë
	 * @return			Æ½Ì¨·µ»Ø½á¹ûXMLÑùÊ½ 
	 * @throws IOException
	 */
	public static String recharge(String username, String id, String password) {

		String param = String.format("username=%s&password=%s&id=%s", username,
				password, id);
		String result;
		try {
			result = YunSu.httpRequestData(
					"http://api.ysdm.net/recharge.xml", param);
		} catch (IOException e) {
			result = "Î´ÖªÎÊÌâ";
		}
		return result;
	}
	
	/**
	 * ´ðÌâ(URL) 
	 * @param username	ÓÃ»§Ãû
	 * @param password	ÓÃ»§ÃÜÂë¡£(Ö§³Ö32Î»MD5)
	 * @param typeid	ÌâÄ¿ÀàÐÍ
	 * @param timeout	ÈÎÎñ³¬Ê±Ê±¼ä£¬Ä¬ÈÏÓë×îÐ¡ÖµÎª60Ãë¡£
	 * @param softid	Èí¼þID£¬¿ª·¢Õß¿É×ÔÐÐÉêÇë¡£
	 * @param softkey	Èí¼þKEY£¬¿ª·¢Õß¿É×ÔÐÐÉêÇë¡£
	 * @param imageurl	Ô¶³ÌÍ¼Æ¬URL
	 * @return			Æ½Ì¨·µ»Ø½á¹ûXMLÑùÊ½ 
	 * @throws IOException
	 */
	public static String createByUrl(String username, String password,
			String typeid, String timeout, String softid, String softkey,
			String imageurl) {

		String param = String
				.format(
						"username=%s&password=%s&typeid=%s&timeout=%s&softid=%s&softkey=%s",
						username, password, typeid, timeout, softid, softkey);
		ByteArrayOutputStream baos = null;
		String result;
		try {
			URL u = new URL(imageurl);
			BufferedImage image = ImageIO.read(u);
			   
			baos = new ByteArrayOutputStream();
			ImageIO.write( image, "jpg", baos);
			baos.flush();
			byte[] data = baos.toByteArray();
			baos.close();
			
			result = YunSu.httpPostImage(
					"http://api.ysdm.net/create.xml", param, data);
	
			
		} catch(Exception e) {
			result = "Î´ÖªÎÊÌâ";
		}
		return result;
	}
	
	/**
	 * ÉÏ±¨´íÌâ
	 * @param username	ÓÃ»§Ãû
	 * @param password	ÓÃ»§ÃÜÂë
	 * @param softid	Èí¼þID
	 * @param softkey	Èí¼þKEY
	 * @param id		±¨´íÌâÄ¿µÄID
	 * @return
	 * @throws IOException
	 */
	public static String report(String username, String password, String softid, String softkey, String id) {
		
		String param = String
		.format(
				"username=%s&password=%s&softid=%s&softkey=%s&id=%s",
				username, password, softid, softkey, id);
		String result;
		try {
			result = YunSu.httpRequestData("http://api.ysdm.net/reporterror.xml",
					param);
		} catch (IOException e) {
			result = "Î´ÖªÎÊÌâ";
		}
		
		return result;
	}
	
	/**
	 * ÉÏ´«ÌâÄ¿Í¼Æ¬·µ»Ø½á¹û	
	 * @param username		ÓÃ»§Ãû
	 * @param password		ÃÜÂë
	 * @param typeid		ÌâÄ¿ÀàÐÍ
	 * @param timeout		ÈÎÎñ³¬Ê±Ê±¼ä
	 * @param softid		Èí¼þID
	 * @param softkey		Èí¼þKEY
	 * @param filePath		ÌâÄ¿½ØÍ¼»òÔ­Ê¼Í¼¶þ½øÖÆÊý¾ÝÂ·¾¶
	 * @return
	 * @throws IOException
	 */
	public static String createByPost(String username, String password,
			String typeid, String timeout, String softid, String softkey,
			String filePath) {
		String result = "";
		String param = String
		.format(
				"username=%s&password=%s&typeid=%s&timeout=%s&softid=%s&softkey=%s",
				username, password, typeid, timeout, softid, softkey);
		try {
			File f = new File(filePath);
			if (null != f) {
				int size = (int) f.length();
				byte[] data = new byte[size];
				FileInputStream fis = new FileInputStream(f);
				fis.read(data, 0, size);
				if(null != fis) fis.close();
				
				if (data.length > 0)	result = YunSu.httpPostImage("http://api.ysdm.net/create.xml", param, data);
			}
		} catch(Exception e) {
			result = "Î´ÖªÎÊÌâ";
		}
		
		
		return result;
	}
	
	public static String createByPost(String username, String password,
			String typeid, String timeout, String softid, String softkey,
			byte[] byteArr) {
		String result = "";
		String param = String
		.format(
				"username=%s&password=%s&typeid=%s&timeout=%s&softid=%s&softkey=%s",
				username, password, typeid, timeout, softid, softkey);
		try {
			result = YunSu.httpPostImage("http://api.ysdm.net/create.xml", param, byteArr);
		} catch(Exception e) {
			result = "Î´ÖªÎÊÌâ";
		}
		
		
		return result;
	}

}
