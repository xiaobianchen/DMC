package com.dmc.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import java.util.concurrent.TimeUnit;

/**
 * Created by kyxiong on 10/19/2015.
 */
public class CSVDownloader {
    public static void download() throws Exception {
        FirefoxProfile profile = new FirefoxProfile();

        String path = "C:\\Test\\";
        profile.setPreference("browser.download.folderList", 2);
        profile.setPreference("browser.download.dir", path);
        profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword, application/msexcel, application/vnd.ms-excel, application/ms-excel, application/csv, application/ris, text/csv, image/png, application/pdf, text/html, text/plain, application/zip, application/x-zip, application/x-zip-compressed, application/download, application/octet-stream");
        profile.setPreference("browser.download.manager.showWhenStarting", false);
        profile.setPreference("browser.download.manager.focusWhenStarting", false);
        profile.setPreference("browser.download.useDownloadDir", true);
        profile.setPreference("browser.helperApps.alwaysAsk.force", false);
        profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
        profile.setPreference("browser.download.manager.closeWhenDone", true);
        profile.setPreference("browser.download.manager.showAlertOnComplete", false);
        profile.setPreference("browser.download.manager.useWindow", false);
        profile.setPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
        profile.setPreference("pdfjs.disabled", true);

        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        WebDriver driver = new FirefoxDriver(profile);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://beta.sycm.taobao.com/login.htm?_target=http%3A%2F%2Fbeta.sycm.taobao.com%2Findex.htm");
        driver.switchTo().frame(0);

        WebElement userNameInput = driver.findElement(By.id("TPL_username_1"));
        WebElement passwordInput = driver.findElement(By.id("TPL_password_1"));
        userNameInput.sendKeys("奥派阿西官方旗舰店:花无缺");
        passwordInput.sendKeys("hua18826824918");
        Thread.sleep(20000);

        driver.findElement(By.id("J_SubmitStatic")).click();
        Thread.sleep(10000);

        driver.findElement(By.linkText("经营分析")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span/span[.='流量地图']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//div[@class='mod-source']//span[.='下载']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='mod-source']//p[@class='ui-download-btns clearfix']/a[@class='btn btn-primary btn-sm']")).click();

        Thread.sleep(30000);
        //Close the browser
        driver.quit();
    }


    public static void main(String[] args) throws Exception {
        download();
    }
}