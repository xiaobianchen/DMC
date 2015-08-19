package com.dmc.utils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * 
 * Created by Xiaobian Chen on 2015年7月8日
 *
 *
 */
public class JsoupExample {
	
	public static void main(String[] args) throws Exception {
		
//		  String html = "<html><head><title> 开源中国社区 </title></head>"+ "<body><p> 这里是 jsoup 项目的相关文章 </p></body></html>";
//        Document document = Jsoup.parse(html);
//        String title = document.title();
//        System.out.println("title: " + title);
		
//		  Document doc = Jsoup.connect("http://www.oschina.net/").get();
//		  String title = doc.title();
//		  System.out.println("title: " + title);
		  
		  Document document = Jsoup.connect("http://login.tmall.com/") 
				  .data("query", "Java")   // 请求参数
				  .userAgent("I ’ m jsoup") // 设置 User-Agent 
				  .cookie("auth", "token") // 设置 cookie 
				  .timeout(3000)           // 设置连接超时时间
				  .post();                 // 使用 POST 方法访问 URL 
		  
		  String titles= document.title();
		  System.out.println("title: " + titles);
		  String errorMessage =  document.select(".error").text();
		  System.out.println(errorMessage);
//		  String body = doc.body().text();
//		  System.out.println("body: " + body);
		
	}

}
