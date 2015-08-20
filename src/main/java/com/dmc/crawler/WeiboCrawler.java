package com.dmc.crawler;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.dmc.model.Links;
import com.dmc.model.Page;
import com.dmc.net.HttpRequesterImpl;

/**
 * 
 * Created by Xiaobian Chen on 2015年8月5日
 *
 *
 */
public class WeiboCrawler extends DeepCrawler {

	public WeiboCrawler(String crawlPath) throws Exception {
		super(crawlPath);
		String cookie = WeiboCN.getSinaCookie("chenxiaobian89@163.com", "ch4890467");
		HttpRequesterImpl requester = (HttpRequesterImpl) this.getHttpRequester();
		requester.setCookie(cookie);
	}

	@Override
	public Links visitAndGetNextLinks(Page page) {
		//抽取微博
		Elements weibos = page.getDoc().select("div.c");
		for(Element weibo:weibos){
			System.out.println(weibo.text());
		}
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		WeiboCrawler crawler = new WeiboCrawler("crawler");
        crawler.setThreads(3);  
        /*对某人微博前5页进行爬取*/  
        for(int i=0;i<5;i++){  
            crawler.addSeed("http://weibo.cn/vipgcu?vt=4&page="+i);  
        }  
        crawler.start(1);  
	}
}
