package com.dmc.utils.spider;
/**
 * 
 * Created by Xiaobian Chen on 2015年7月21日
 *
 * This class defines all the required information in our query in order to extension and code restructure
 * we need provide one code for different cases
 */
public class Rule {
	
	//链接
	private String url;
	//参数集合
	private String[] params;
	//参数对应的值
	private String[] values;
	//对返回的HTML，第一次过滤所用的标签，请先设置type 
	private String resultTagName;
	private int type= ID;
	private int requestMethod = GET; 
    public final static int GET = 0 ;  
    public final static int POST = 1 ;
    
    public final static int CLASS = 0;  
    public final static int ID = 1;  
    public final static int SELECTION = 2;
    
	public Rule() {
		
	}

	public Rule(String url, String[] params, String[] values,
			String resultTagName, int type, int requestMethod) {
		this.url = url;
		this.params = params;
		this.values = values;
		this.resultTagName = resultTagName;
		this.type = type;
		this.requestMethod = requestMethod;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String[] getParams() {
		return params;
	}

	public void setParams(String[] params) {
		this.params = params;
	}

	public String[] getValues() {
		return values;
	}

	public void setValues(String[] values) {
		this.values = values;
	}

	public String getResultTagName() {
		return resultTagName;
	}

	public void setResultTagName(String resultTagName) {
		this.resultTagName = resultTagName;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(int requestMethod) {
		this.requestMethod = requestMethod;
	}
}
