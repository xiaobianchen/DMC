package com.dmc.test.usecase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author xiaobianchen
 * @version 1.0 2015/12/23
 * @link https://github.com/xiaobianchen/DMC
 *
 */
public class LoginChinaUnicomTestPlan {

    public static final String URL = "http://www.stubhub.com/";
    public static final String USERNAME = "";
    public static final String PASSWORD = "";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jchen19\\Desktop\\personal\\git\\DMC\\src\\main\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        driver.findElement(By.id("pleaseLogin")).click();
        driver.findElement(By.id("header-sign-in")).findElement(By.id("myhub")).click();

//        WebElement username = driver.findElement(By.id("userName"));
//        username.sendKeys(USERNAME);
//
//        WebElement password = driver.findElement(By.id("userPwd"));
//        password.sendKeys(PASSWORD);
//
//
//        WebElement btnLogin = driver.findElement(By.id("login1"));
//        btnLogin.click();


    }
}
