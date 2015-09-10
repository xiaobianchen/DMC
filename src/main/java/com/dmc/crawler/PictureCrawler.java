//package com.dmc.crawler;
//
//import java.io.IOException;
//import java.util.concurrent.atomic.AtomicInteger;
//import java.util.regex.Pattern;
//
//import cn.edu.hfut.dmic.webcollector.crawler.BreadthCrawler;
//import cn.edu.hfut.dmic.webcollector.model.Links;
//import cn.edu.hfut.dmic.webcollector.model.Page;
//import cn.edu.hfut.dmic.webcollector.util.FileUtils;
//
///**
// *
// * Created by Xiaobian Chen on 2015年8月6日
// * 爬虫下载美食网站的所有图片
// */
//public class PictureCrawler extends BreadthCrawler {
//
//	public PictureCrawler(String crawlPath, boolean autoParse) {
//		super(crawlPath, autoParse);
//	}
//
//	 AtomicInteger id=new AtomicInteger(0);
//
//
//	 public static void main(String[] args) throws Exception {
//		 PictureCrawler crawler=new PictureCrawler("crawler",true);
//		crawler.addSeed("http://www.meishij.net/");
//		crawler.addRegex("http://.*meishij.net/.*");
//		crawler.setThreads(50);
//		crawler.start(10);
//	}
//
//	@Override
//	public void visit(Page page, Links nextLinks) {
//		if(!Pattern.matches(".*jpg$",page.getUrl())){
//			return;
//		}
//
//		try {
//			FileUtils.writeFileWithParent("C:/Users/jchen19/Desktop/personal/git/DMC/src/main/resources/download" +id.incrementAndGet()+".jpg",page.getContent());
//			System.out.println("download:"+page.getUrl());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}
