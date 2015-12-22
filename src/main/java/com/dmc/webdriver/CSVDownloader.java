package com.dmc.webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.*;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import java.net.URLConnection;
import org.apache.commons.io.FileUtils;
/**
 * Created by kyxiong on 10/19/2015.
 */
public class CSVDownloader {
    public static void download() throws Exception {
        FirefoxProfile profile = new FirefoxProfile();

        String path = System.getProperty("user.dir") + "\\csv";
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
        driver.manage().window().maximize();
        driver.switchTo().frame(0);

        WebElement userNameInput = driver.findElement(By.id("TPL_username_1"));
        WebElement passwordInput = driver.findElement(By.id("TPL_password_1"));

        userNameInput.sendKeys("奥派阿西官方旗舰店:花无缺");
        passwordInput.sendKeys("hua18826824918");
        //Thread.sleep(10000);


//        String codeUrl = driver.findElement(By.id("J_StandardCode_m")).getAttribute("src");
//        System.out.print(codeUrl);
//        downloadFile(codeUrl, "testtest.jpg", "D:\\");
//        String code = YunSu.createByPost("xiongjiaji", "1234QWER", "3040", "60", "33483", "11ed548479f04bbdb2b1a377203d9f3c", "D:\\testtest.jpg");
//        System.out.print(code);
//        code = code.substring(code.indexOf("<Result>")+8, code.indexOf("<Result>") + 12);
//        System.out.print(code);
        captureScreen(driver, path, "src", ".png");
        String srcname = path + "\\src.png";
        String subname = path + "\\sub.png";
        OperateImage o = new OperateImage(1238, 278, 150, 46);
        o.setSrcpath(srcname);
        o.setSubpath(subname);
        o.cut();
        
        String code = YunSu.createByPost("xiongjiaji", "1234QWER", "3040", "60", "33483", "11ed548479f04bbdb2b1a377203d9f3c", subname);
        System.out.print(code);
        code = code.substring(code.indexOf("<Result>")+8, code.indexOf("<Result>") + 12);
        System.out.print(code);

        driver.findElement(By.id("J_CodeInput_i")).sendKeys(code);

        Thread.sleep(15000);
        driver.findElement(By.id("J_SubmitStatic")).click();

        driver.findElement(By.linkText("经营分析")).click();
        driver.findElement(By.xpath("//span/span[.='流量地图']")).click();

        driver.findElement(By.xpath("//div[@class='mod-source']//span[.='下载']")).click();
        driver.findElement(By.xpath("//div[@class='mod-source']//p[@class='ui-download-btns clearfix']/a[@class='btn btn-primary btn-sm']")).click();

        Thread.sleep(10000);
        //Close the browser
        driver.quit();
    }


    public static void main(String[] args) throws Exception {
        download();
    }

    public static void captureScreen(WebDriver dr, String directory,String captureName, String format) {
        File screenShotFile = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShotFile, new File(directory + captureName + format));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void downloadFile(String urlString, String filename,String savePath) throws Exception {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        //设置请求超时为5s
        con.setConnectTimeout(5*1000);
        // 输入流
        InputStream is = con.getInputStream();

        // 1K的数据缓冲
        byte[] bs = new byte[1024];
        // 读取到的数据长度
        int len;
        // 输出的文件流
        File sf=new File(savePath);
        if(!sf.exists()){
            sf.mkdirs();
        }
        OutputStream os = new FileOutputStream(sf.getPath()+"\\"+filename);
        // 开始读取
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        // 完毕，关闭所有链接
        os.close();
        is.close();
    }

}