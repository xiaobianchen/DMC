package com.dmc.utils.spider;

import java.util.List;

/**
 * 
 * Created by Xiaobian Chen on 2015年7月21日
 *
 *
 */
public class SpiderTest {
	
	public static void main(String[] args) {
		System.out.println("后台正在抓取数据中.......................................");
		getDatas();
//		getDatasByBaiduNews();
		//getDataFromTmall();
//		getIphone6DataFromTmall();
	}
	
	/**
	 * get data from site
	 */
	public static void getDatas(){
		 Rule rule = new Rule("http://www1.sxcredit.gov.cn/public/infocomquery.do?method=publicIndexQuery",    
	        new String[] { "query.enterprisename","query.registationnumber" }, new String[] { "","" },  
	                "cont_right", Rule.CLASS, Rule.POST);  
		  
		  List<LinkTypeData> datas = ExtractService.extract(rule);
		  System.out.println("后台共抓取" + datas.size() + "条记录");
		  for(LinkTypeData data : datas){
			  System.out.println(data.getLinkText());
			  System.out.println(data.getLinkHref());
			  System.out.print("");
		  }
	}

	/**
	 * get data from baidu news
	 */
	public static void getDatasByBaiduNews(){
		Rule rule = new Rule("http://news.baidu.com/ns",  
	            new String[] { "word" }, new String[] {"支付宝"},  
	            "", -1, Rule.GET);  
		 List<LinkTypeData> datas = ExtractService.extract(rule);
		 System.out.println("后台共抓取" + datas.size() + "条记录");
		 for(LinkTypeData data : datas){
			  System.out.println(data.getLinkText());
			  System.out.println(data.getLinkHref());
			  System.out.print("");
		  }
	}

	/**
	 * get data from tmall
	 */
	public static void getDataFromTmall(){
		 Rule rule = new Rule("https://vip.tmall.com/privilege/speedReturned?spm=3700.7045653.2.5.XJyiMj",    
			        new String[] { "spm"}, new String[] { "3700.7045653.2.5.XJyiMj"},  
			                "", -1, Rule.GET);  
		 
		 List<LinkTypeData> datas = ExtractService.extract(rule);
		 System.out.println("后台共抓取" + datas.size() + "条记录");
		 for(LinkTypeData data : datas){
			  System.out.println(data.getLinkText());
			  System.out.println(data.getLinkHref());
			  System.out.print("");
		  }
	}

	/**
	 * get iphone data from tmall
	 */
	public static void getIphone6DataFromTmall(){
		 Rule rule = new Rule("https://list.tmall.com/search_product.htm?q=iphone6&type=p&spm=a220m.1000858.a2227oh.d100&from=.list.pc_1_searchbutton",    
			        new String[] { "q"}, new String[] { "iphone6"},  
			                "", -1, Rule.GET);  
		 
		 List<LinkTypeData> datas = ExtractService.extract(rule);
		 System.out.println("后台共抓取" + datas.size() + "条记录");
		 for(LinkTypeData data : datas){
			  System.out.println(data.getLinkText());
			  System.out.println(data.getLinkHref());
			  System.out.print("");
		  }
	}
}
