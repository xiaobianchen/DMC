package com.dmc.crawler;


import java.util.regex.Pattern;

import org.jsoup.nodes.Document;

import com.dmc.crawler.BreadthCrawler;
import com.dmc.model.Links;
import com.dmc.model.Page;

/**
 * 
 * Created by Xiaobian Chen on 2015年7月30日
 *
 *
 */
public class YahooCrawler extends BreadthCrawler {

	public YahooCrawler(String crawlPath, boolean autoParse) {
		super(crawlPath, autoParse);
		this.addSeed("http://news.yahoo.com/");
		this.addRegex("http://news.yahoo.com/.*");
		
		//do not fetch url like http://news.yahoo.com/xxxx/xxx
		this.addRegex("-http://news.yahoo.com/.+/.*");
		//do not fetch jpg|png|gif
		this.addRegex("-.*\\.(jpg|png|gif).*");
		//do not fetch url contains #
		this.addRegex("-.*#.*");
	}

	@Override
	public void visit(Page page, Links nextLinks) {
		String url = page.getUrl();
		if(Pattern.matches("http://news.yahoo.com/.+html",url)){
			Document doc = page.getDoc();
			
			 /*extract title and content of news by css selector*/  
            String title = doc.select("h1[class=headline]").first().text();  
            String content = doc.select("div[class=body yom-art-content clearfix]").first().text();  
            
            System.out.println("URL:\n" + url);  
            System.out.println("title:\n" + title);  
            System.out.println("content:\n" + content); 
		}
	}
	
	public static void main(String[] args) throws Exception {
		YahooCrawler crawler = new YahooCrawler("crawl", true);
		crawler.setThreads(50);
		crawler.setTopN(100);
		crawler.start(4);
	}
}
