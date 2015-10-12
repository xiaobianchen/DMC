package com.dmc.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * Created by Xiaobian Chen on 2015年10月10日
 *
 *
 */
public class AutoDownLoadFilesScript {
	public static final String END_POINT = "http://beta.sycm.taobao.com/login.htm?_target=http%3A%2F%2Fbeta.sycm.taobao.com%2Findex.htm";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/jchen19/Desktop/personal/git/QE-MAUI-PLATFORM/mauiplatform/src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(END_POINT);
		
		
		
	}

}
