package com.dmc.utils.spider;
/**
 * @author xiaobianchen
 * @version 1.0 2015/7/21
 * @link https://github.com/xiaobianchen/DMC
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
