package com.dmc.test.usecase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by xiaobianchen on 2015/12/23.
 */
public class LoginChinaUnicomTestPlan {

    public static final String URL = "http://www.stubhub.com/";
    public static final String USERNAME = "18601705642";
    public static final String PASSWORD = "489046";

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
