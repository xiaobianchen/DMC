package com.dmc.utils.spider;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaobianchen
 * @version 1.0 2015/7/21
 * @link https://github.com/xiaobianchen/DMC
 * This class is used to query data
 *
 */
public class ExtractService {
	
	public static List<LinkTypeData> extract(Rule rule){
		validateRule(rule);
		
		List<LinkTypeData> datas = new ArrayList<LinkTypeData>();
		
		try{
			//parser rule
			String url = rule.getUrl();
			String[] parms = rule.getParams();
			String[] values = rule.getValues();
			String resultTagName = rule.getResultTagName();
			int type = rule.getType();
			int requestType = rule.getRequestMethod();
			
			Connection connection = Jsoup.connect(url);
			
			//设置查询参数
			if(parms != null){
				for(int i = 0; i < parms.length; i++){
					connection.data(parms[i],values[i]);
				}
			}
			
			//设置请求参数
			Document document = null;
			switch(requestType){
			case Rule.GET:
				document = connection.timeout(100000).get();
			    break;
			case Rule.POST:
				document = connection.timeout(100000).post();
				break;
			}
			
			//处理返回的数据
			Elements results = new Elements();
			switch(type){
			case Rule.CLASS:
				results = document.getElementsByClass(resultTagName);
				break;
			case Rule.ID:
				Element result = document.getElementById(resultTagName);
				results.add(result);
				break;
			case Rule.SELECTION:
				results = document.select(resultTagName);
				break;
				
			default:
				if(resultTagName.isEmpty()){
					results = document.getElementsByTag("body");
				}
			}
			
			for(Element result:results){
				Elements links = result.getElementsByTag("a");
				
				for(Element link:links){
					String linkHref = link.attr("href");
					String linkText = link.text();
					
					LinkTypeData data = new LinkTypeData();
					data.setLinkHref(linkHref);
					data.setLinkText(linkText);
					
					datas.add(data);
				}
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		return datas;
	}

	/**
	 * validate rule
	 * @param rule
	 */
	public static void validateRule(Rule rule) {
		String url = rule.getUrl();
		if(url.isEmpty()){
			throw new RuleException("url 不能为空");
		}
		
//		if(!url.startsWith("http://")){
//			throw new RuleException("url 格式不正确");
//		}
//		
//		if(!url.startsWith("https://")){
//			throw new RuleException("url 格式不正确");
//		}
		
		if(rule.getParams().length != rule.getValues().length){
			throw new RuleException("参数的键值对个数不匹配");
		}
	}
}
