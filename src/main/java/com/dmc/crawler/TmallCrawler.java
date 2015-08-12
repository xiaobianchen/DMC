package com.dmc.crawler;

import java.util.regex.Pattern;
import com.dmc.model.Links;
import com.dmc.model.Page;

public class TmallCrawler extends BreadthCrawler{

	public TmallCrawler(String crawlPath, boolean autoParse) {
		super(crawlPath, autoParse);
		addSeed("https://www.tmall.com/");
	}

	@Override
	public void visit(Page page, Links nextLinks) {
		if(Pattern.matches("https://www.tmall.com/", page.getUrl())){
			
		}
	}
	
	public static void main(String[] args) throws Exception {
		TmallCrawler crawler = new TmallCrawler("crawler", false);
		crawler.start(2);
	}
}
