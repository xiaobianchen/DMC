package com.dmc.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author xiaobianchen
 * @version 1.0 2015/7/8
 * @link https://github.com/xiaobianchen/DMC
 * Jsoup Example
 */
public class JsoupExample {
	
	public static void test() throws IOException {
		  String html = "<html><head><title> 开源中国社区 </title></head>"+ "<body><p> 这里是 jsoup 项目的相关文章 </p></body></html>";
	      Document document = Jsoup.parse(html);
	      String title = document.title();
	      System.out.println("title: " + title);

		  Document doc = Jsoup.connect("http://www.oschina.net/").get();
		  String title2 = doc.title();
		  System.out.println("title: " + title2);

		  Document document2 = Jsoup.connect("http://login.tmall.com/")
				  .data("query", "Java")   // 请求参数
				  .userAgent("I ’ m jsoup") // 设置 User-Agent
				  .cookie("auth", "token") // 设置 cookie
				  .timeout(3000)           // 设置连接超时时间
				  .post();                 // 使用 POST 方法访问 URL

		  String titles= document.title();
		  System.out.println("title: " + titles);
		  String errorMessage =  document2.select(".error").text();
		  System.out.println(errorMessage);
		  String body = doc.body().text();
		  System.out.println("body: " + body);
	}
}
