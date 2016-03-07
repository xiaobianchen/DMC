package com.dmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author xiaobianchen
 * @version 1.0 2016/3/6
 *
 * 文件上传工具类
 */
@Controller
public class FileUploadController {

    @RequestMapping(value = "/upload.action", method = RequestMethod.GET)
    public String uploadFile() {
        return "fileUpload";
    }

    /**
     * 上传单个文件
     */
    @RequestMapping(value = "/upload.action",method = RequestMethod.POST)
    public String uploadFiles(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String path = request.getSession().getServletContext().getRealPath("upload");
        String fileName = file.getOriginalFilename();

        File targetFile = new File(path, fileName);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }

        try {
            file.transferTo(targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * 同时上传多个文件
     */
    @RequestMapping(value = "/uploadMultipartFile.action",method = RequestMethod.POST)
    public String uploadMultipartFiles(@RequestParam("files") MultipartFile[] files, HttpServletRequest request) {
        if (files != null && files.length > 0) {
            for (int i = 0; i < files.length; i++) {
                MultipartFile file = files[i];
                uploadFiles(file, request);
            }
        }
        return "success";
    }

}
