package com.dmc;

import java.util.Random;


/**
 * @author xiaobianchen
 * @version 1.0 2015/10/13
 * @link https://github.com/xiaobianchen/DMC
 * This class is used to provide to generate number randomly
 *
 */
public class RandomUtils {
	public static final String token = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String number = "0123456789";
	public static final String stoken = "httpwww.dmc.com";
	
	
	/**
	 * returns a string include character and number
	 * @param length
	 * @return
	 */
	public static String generateString(int length){
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for(int i = 0 ; i < length; i++){
			sb.append(token.charAt(random.nextInt(token.length())));
		}
		
		return sb.toString();
	}
	
	/**
	 * returns a string only include character
	 * @param length
	 * @return
	 */
	public static String generateMixString(int length){
		StringBuffer sb = new StringBuffer();
		Random random = new Random();
		for(int i = 0; i < length; i++){
			sb.append(chars.charAt(random.nextInt(chars.length())));
		}
		
		return sb.toString();
	}
	
	/**
	 * returns characters are lowercase
	 * @param length
	 * @return
	 */
	public static String generateLowerString(int length){
		return generateMixString(length).toLowerCase();
	}
	
	/**
	 * returns character are uppercase
	 * @param length
	 * @return
	 */
	public static String generateUpperString(int length){
		return generateMixString(length).toUpperCase();
	}
	
	/**
	 * http%3A%2F%2Fwww.dmc.com%2F
	 * @param token
	 * @param length
	 * @return
	 */
	public static String generateString(String stoken,int length){
		StringBuffer sb = new StringBuffer();
		int index = stoken.indexOf("p");
		String token = stoken.substring(0, index+1);
		sb.append(token);
		
		String head_tokens = "%" + RandomUtils.generateString(2) + "%" + RandomUtils.generateString(2) + "%" + RandomUtils.generateString(2);
		sb.append(head_tokens);
		
		String tsToken = stoken.substring(4);
		sb.append(tsToken);
		String tail_tokens = "%" + RandomUtils.generateString(2);
		sb.append(tail_tokens);
		
		return sb.toString();
	}
}
