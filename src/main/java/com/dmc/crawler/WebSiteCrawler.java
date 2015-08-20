package com.dmc.crawler;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.jdbc.core.JdbcTemplate;

import com.dmc.crawler.BreadthCrawler;
import com.dmc.model.Links;
import com.dmc.model.Page;
import com.dmc.utils.JDBCHelper;

/**
 * 
 * Created by Xiaobian Chen on 2015年8月4日
 *
 *
 */
public class WebSiteCrawler extends BreadthCrawler{
	
	JdbcTemplate jdbcTemplate = null;

	public WebSiteCrawler(String crawlPath, boolean autoParse) {
		super(crawlPath, autoParse);
		this.addSeed("http://lubimyczytac.pl/gfk");
		
		try{
			jdbcTemplate = JDBCHelper.createMysqlTemplate("mysql1",
					"jdbc:mysql://localhost/dmc?useUnicode=true&characterEncoding=utf8",
					"root", "root", 5, 30);

			jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS tb_news ("
						+ "id int(11) NOT NULL AUTO_INCREMENT,"
						+ "title varchar(500), content varchar(2000), imageUrl varchar(200),"
						+ "PRIMARY KEY (id)"
						+ ") ENGINE=MyISAM DEFAULT CHARSET=utf8;");

            System.out.println("成功创建表tb_news");
		}catch(Exception e){
		    jdbcTemplate  = null;
		    System.out.println("数据库用户名或密码不正确");
		}
	}

	@Override
	public void visit(Page page, Links nextLinks) {
		String url = page.getUrl();
		
		/*if page is new page*/
		if(Pattern.matches("http://lubimyczytac.pl/gfk", url)){
			/*we use jsoup to parse page*/
			Document doc = page.getDoc();
			List<String> titles = new ArrayList<String>();
			List<String> contents = new ArrayList<String>();
			List<String> images = new ArrayList<String>();
			
			Elements elements = doc.select("a[class=bookTitle]");
			for(Element e: elements){
				titles.add(e.text());
			}
			
			for(Element e: doc.select("div[class=book-description space-10-t]")){
				contents.add(e.text());
			}
			
			for(Element e :doc.select("img[src$=.jpg]")){
				images.add(e.absUrl("src"));
			}
			
			for(int i = 0; i < titles.size();i++){
				String title = titles.get(i);
				String content = contents.get(i);
				String imageUrl = images.get(i);
				
				if(jdbcTemplate != null){
					int updates = jdbcTemplate.update("insert into tb_news(title,content,imageUrl) values(?,?,?)", title,content,imageUrl);
					if(updates == 1){
						System.out.println("插入数据成功!");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		WebSiteCrawler crawler = new WebSiteCrawler("crawl", false);
		crawler.start(1);
	}
}
