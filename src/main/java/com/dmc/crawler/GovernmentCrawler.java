package com.dmc.crawler;

import java.util.regex.Pattern;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.jdbc.core.JdbcTemplate;

import cn.edu.hfut.dmic.webcollector.crawler.BreadthCrawler;
import cn.edu.hfut.dmic.webcollector.model.Links;
import cn.edu.hfut.dmic.webcollector.model.Page;

import com.dmc.utils.JDBCHelper;
/**
 * 
 * Created by Xiaobian Chen on 2015年8月5日
 * crawl example
 *
 */
public class GovernmentCrawler extends BreadthCrawler {
	
	JdbcTemplate jdbcTemplate = null;

	public GovernmentCrawler(String crawlPath, boolean autoParse) {
		super(crawlPath, autoParse);
		addSeed("http://www1.sxcredit.gov.cn/public/infocomquery.do?method=publicIndexQuery");
		
		try{
			jdbcTemplate = JDBCHelper.createMysqlTemplate("mysql1",
					"jdbc:mysql://localhost/dmc?useUnicode=true&characterEncoding=utf8",
					"root", "root", 5, 30);

			jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS tb_government ("
						+ "id int(11) NOT NULL AUTO_INCREMENT,"
						+ "companyName varchar(200), address varchar(200), registerNum int(20),"
						+ "PRIMARY KEY (id)"
						+ ") ENGINE=MyISAM DEFAULT CHARSET=utf8;");

            System.out.println("成功创建表tb_government");
		}catch(Exception e){
		    jdbcTemplate  = null;
		    System.out.println("数据库用户名或密码不正确");
		}
	}

	@Override
	public void visit(Page page, Links nextLinks) {
		//page is new page
		if(Pattern.matches("http://www1.sxcredit.gov.cn/public/infocomquery.do?method=publicIndexQuery", page.getUrl())){
			Document doc = page.getDoc();
			Elements elements = doc.select("a");
			
			for(Element e: elements){
				System.out.println(e.text());
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		GovernmentCrawler crawler = new GovernmentCrawler("crawl", false);
		crawler.start(1);
	}
}
