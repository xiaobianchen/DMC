package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/7
 */
@Controller
public class DownloadController {

    private static final int BUFFER_SIZE = 4096;
    private String filePath = "ProductCrawler.java";

    @RequestMapping(value="/download.action", method = RequestMethod.GET)
    public String downloadFiles() {
        return "download";
    }


    /**
     * 实现下载功能
     */
    @RequestMapping(value = "/downloadFiles.action", method = RequestMethod.GET)
    public void download(HttpServletRequest request, HttpServletResponse response)throws Exception{
        ServletContext context = request.getSession().getServletContext();
        String appPath = context.getRealPath("download");
        System.out.println(appPath);

        String fullPath = appPath + "/" +filePath;
        File downloadFile = new File(fullPath);
        FileInputStream inputStream = new FileInputStream(downloadFile);

        //get MIME type of the file
        String mimeType = context.getMimeType(fullPath);
        if (mimeType == null) {
            mimeType = "application/octet-stream";
        }

        response.setContentType(mimeType);
        response.setContentLength((int)downloadFile.length());

        // set headers for the response
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
        response.setHeader(headerKey, headerValue);

        // get output stream of the response
        OutputStream outStream = response.getOutputStream();
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead = -1;

        // write bytes read from the input stream into the output stream
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }

        inputStream.close();
        outStream.close();
    }

}
