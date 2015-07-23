package com.dmc.utils.spider;
/**
 * 
 * Created by Xiaobian Chen on 2015年7月21日
 *
 *
 */
public class RuleException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public RuleException(){
		
	}
	
	public RuleException(String message,Throwable cause){
		super(message,cause);
	}
	
	public RuleException(String message){
		super(message);
	}
	
	public RuleException(Throwable cause){
		super(cause);
	}
}
