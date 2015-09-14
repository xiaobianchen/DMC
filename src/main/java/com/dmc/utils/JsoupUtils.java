package com.dmc.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeVisitor;
/**
 * 
 * Created by Xiaobian Chen on 2015年7月30日
 *
 *
 */
public class JsoupUtils {
	private static final Logger log = Logger.getLogger(JsoupUtils.class);
	
    public static void makeAbs(Document doc,String url){
        if(url!=null){
            doc.setBaseUri(url);
        }
        doc.traverse(new NodeVisitor() {

            @Override
            public void head(Node node, int i) {
                if(node instanceof Element){
                    Element tag=(Element) node;
                    if(tag.hasAttr("href")){
                        String absHref=tag.attr("abs:href");
                        tag.attr("href",absHref);
                    }
                    if(tag.hasAttr("src")){
                        String absSrc=tag.attr("abs:src");
                        tag.attr("src",absSrc);
                    }
                }
            }
            @Override
            public void tail(Node node, int i) {
            }
        });
    }
	
	public static void read(String path){
		Document document = Jsoup.parse(path);
		Elements elements = document.select("div[style]");
		
		List<String> ukList = new ArrayList<String>();
		List<String> usList = new ArrayList<String>();
		
		for(Element ele:elements){
			String attrs = ele.attr("style");
			if(attrs.equals("color:red")){
				String ownText = ele.ownText();
				String content = ownText.trim().replace("(P) ", "");
				int index =content.indexOf("-");
				String token  = "";
				if(content.contains("US")){
				    token = content.substring(0,index);
				    usList.add(token);
				}else if(content.contains("UK")){
					token = content.substring(0, index);
					ukList.add(token);
				}
			}
		}
		
		log.info("UK Orders:");
		log.info(ukList);
		
		log.info("US Orders:");
		log.info(usList);
	}
}
