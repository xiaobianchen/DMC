package com.dmc.utils.spider;

import java.util.List;

/**
 * 
 * Created by Xiaobian Chen on 2015年7月21日
 *
 *
 */
public class Test {
	
	public static void main(String[] args) {
		System.out.println("后台正在抓取数据中.......................................");
		//getDatas();
		getDatasByBaiduNews();
	}
	
	/**
	 * get data from site
	 */
	public static void getDatas(){
		 Rule rule = new Rule("http://www1.sxcredit.gov.cn/public/infocomquery.do?method=publicIndexQuery",    
	        new String[] { "query.enterprisename","query.registationnumber" }, new String[] { "华县何军西户食府","" },  
	                "cont_right", Rule.CLASS, Rule.POST);  
		  
		  List<LinkTypeData> datas = ExtractService.extract(rule);
		  System.out.println("后台共抓取" + datas.size() + "条记录");
		  for(LinkTypeData data : datas){
			  System.out.println(data.getLinkText());
			  System.out.println(data.getLinkHref());
			  System.out.print("");
		  }
	}
	
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
}
