package com.dmc.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dmc.domain.entity.Picture;
import com.dmc.services.PictureService;

/**
 * 
 * Created by Xiaobian Chen on 2015年7月3日
 * Upload and Download Picture Page
 *
 */
@Controller
public class PictureController {
	
	@Autowired
	private PictureService pictureService;
	
	/**
	 * upload file
	 * @return
	 * @throws IOException 
	 */
	@RequestMapping(value="/fileUpload", method=RequestMethod.POST)
	public @ResponseBody String uploadFile(@RequestParam(value="file") final MultipartFile file) throws IOException{
		//save in folder
		/*String fileName = null;
		if(!file.isEmpty()){
			try{
				fileName = file.getOriginalFilename();
				byte[] bytes = file.getBytes();
				String filePath = "C:/Users/jchen19/Desktop/personal/git/DMC/src/main/webapp/WEB-INF/resources/upload/";
				String path = filePath + fileName;
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(path)));
				bos.write(bytes);
				bos.close();
				return "You have successfully uploaded " + fileName;
			}catch(Exception e){
				return "You failed to upload " + fileName + ":" + e.getMessage();
			}
		}else{
			return "Unable to upload. File is empty.";
		}*/
		
		//save in database
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("fileName", file.getOriginalFilename());
		map.put("fileStream", file.getBytes());
	    pictureService.insert(map);
		return "success";
		
	}
	
	@RequestMapping(value="/fileUpload", method=RequestMethod.GET)
	public String upload(){
		return "fileUpload";
	}

	/**
	 * returns donwload files
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value="/fileDownload", method=RequestMethod.GET)
	public @ResponseBody String download(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fileId = request.getParameter("fileId");
		int id = Integer.parseInt(fileId);
		Picture picture = pictureService.getPictureById(id);
		
		String fileName = picture.getFileName();
		
		//download by stream
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");  
		
		BufferedInputStream bis = null;
		BufferedOutputStream  bos = null;
		
		String ctxPath = "C:/Users/jchen19/Desktop/catalog/";    
        String downLoadPath = ctxPath;  
        System.out.println(downLoadPath);  
		
		try{
			long fileLength = new File(downLoadPath).length();
			response.setContentType("application/x-msdownload;");  
		    response.setHeader("Content-disposition", "attachment; filename="+ new String(fileName.getBytes("utf-8"), "ISO8859-1"));    
		    response.setHeader("Content-Length", String.valueOf(fileLength));
		    
		    bis = new BufferedInputStream(new FileInputStream(downLoadPath));
		    bos = new BufferedOutputStream(response.getOutputStream());
		    
		    byte[] buffer = new byte[2048];
		    int line;
		    while(-1 != (line = bis.read(buffer, 0, buffer.length))){
		    	bos.write(buffer, 0, line);
		    }
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(bos!=null){
				bos.close();
			}
			if(bis!=null){
				bis.close();
			}
		}
		
		return "File has been uploaded successfully " + fileName;
	}
}
