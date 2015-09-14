//package com.dmc.crawler;
//
//import java.util.regex.Pattern;
//
//import cn.edu.hfut.dmic.webcollector.crawler.BreadthCrawler;
//import cn.edu.hfut.dmic.webcollector.model.Links;
//import cn.edu.hfut.dmic.webcollector.model.Page;
///**
// *
// * Created by Xiaobian Chen on 2015年8月20日
// *
// *
// */
//public class TmallCrawler extends BreadthCrawler{
//
//	public TmallCrawler(String crawlPath, boolean autoParse) {
//		super(crawlPath, autoParse);
//		addSeed("https://www.tmall.com/");
//	}
//
//	@Override
//	public void visit(Page page, Links nextLinks) {
//		if(Pattern.matches("https://www.tmall.com/", page.getUrl())){
//
//		}
//	}
//
//	public static void main(String[] args) throws Exception {
//		TmallCrawler crawler = new TmallCrawler("crawler", false);
//		crawler.start(2);
//	}
//}
