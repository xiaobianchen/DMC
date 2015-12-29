package com.dmc.utils;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.*;


/**
 * @author xiaobianchen
 * @version 1.0 2015/9/6
 * @link https://github.com/xiaobianchen/DMC
 *
 * This class is used to handle File operations
 *
 */
public class FileUtil {
	
	public static int count = 0;
	public static int folderCount = 0;

    public static void main(String[] args) throws Exception{
//        System.out.println("请输入路径:");
//        Scanner scanner = new Scanner(System.in);
//        String path = scanner.next();
//
//        int count =  FileUtil.countFiles(path);
//        System.out.println("您已经为DMC写了:" + count + "个文件啦,继续加油喔！");

        FileUtil fileUtil = new FileUtil();
        fileUtil.countFileLine();
    }

	/**
	 * list all files of the specific folder
	 * @param file
	 */
	public static void getFiles(File file) {
		if (file.isDirectory()) {
			String[] sts = file.list();
			for (String s : sts) {
				File f = new File(file, s);
				getFiles(f);
			}
		} else {
			System.out.println(file.getName() + ": " + file.getAbsolutePath());
		}
	}
	
	/**
	 * 
	 * @param path
	 * @param from
	 * @param to
	 */
	public static void rname(String path, String from, String to){
		File file = new File(path);
		if (file.isFile()) {
			if (file.getName().endsWith(from)) {
				file.renameTo(new File(file.getParent() + "/" + file.getName().substring(0, file.getName().indexOf(from)) + to));
				System.out.println("changed file name successfully!");
			}
		} else {
			String[] strs = file.list();
			for(String s: strs){
				File f = new File(file,s);
				rname(f.getAbsolutePath(), from, to);
			}
		}
	}

	/**
	 * delete files
	 */
	public static void deleteFiles(String path, String str) {
		File file = new File(path);
		if (file.isFile()) {
			if (file.getName().endsWith(str)) {
				file.delete();
				System.out.println("delete " + file.getAbsolutePath());
			}
		} else {
			String[] stoken = file.list();
			for (String token : stoken) {
				File f = new File(file, token);
				deleteFiles(f.getAbsolutePath(), str);
			}
		}
	}
	
	/**
	 * delete all files
	 * @param path
	 */
	public static void deleteAll(String path){
		File file = new File(path);
		
		if(file.isDirectory()){
			if(file.list().length == 0){
				file.delete();
				System.out.println("Directory is deleted:" + file.getAbsolutePath());
			}else{
				String[] files = file.list();
				for(String str:files){
					File f = new File(file,str);
					deleteAll(f.getAbsolutePath());
				}
				
				if(file.list().length == 0){
					file.delete();
					System.out.println("Directory is deleted:" + file.getAbsolutePath());
				}
			}
		}else{
			file.delete();
			System.out.println("Directory is deleted:" + file.getAbsolutePath());
		}
	}
	
	/**
	 * count files
	 * @param path
	 * @return
	 */
	public static int countFiles(String path){
		File file = new File(path);
		String[] files = file.list();
		
		for(String f:files){
			File fi = new File(file,f);
			if(fi.isDirectory() && !fi.isHidden()) {
				countFiles(fi.getAbsolutePath());
			}else{
				count++;
				System.out.println("扫描文件中......" + fi.getAbsolutePath());
			}
		}
		
		return count;
	}
	
	/**
	 * count folder
	 * @param path
	 * @return
	 */
	public static int countFolder(String path){
		File file = new File(path);
		String[] files = file.list();
		for(String f:files){
			File fi = new File(file,f);
			if(fi.isDirectory()&&!fi.isHidden()){
				folderCount++;
				countFolder(fi.getAbsolutePath());
			}
		}
		return folderCount;
	}
	
    /**
     * 该方法返回含有某个关键字的所有文件
     * @param fileName
     */
    public static void searchFiles(String fileName,String keyword){
		File file = new File(fileName);
	    if(file.isFile()){
	    	getFileName(fileName, keyword);
	    }else{
	    	String[] tokens = file.list();
	    	for(String token:tokens){
	    		File f = new File(file,token);
	    		if(f.isFile()){
	    			getFileName(f.getAbsolutePath(), keyword);
	    		}else{
	    			searchFiles(f.getAbsolutePath(), keyword);
	    		}
	    		
	    	}
	    }
	}
    
    /**
     * find out filename by keyword
     * @param file
     * @param keyword
     * @return
     */
    public static void getFileName(String path,String keyword){
    	BufferedReader br = null;
    	String line = null;
    	
    	try {
			br = new BufferedReader(new FileReader(path));
			File file = new File(path);
			while((line=br.readLine())!=null){
				if(line.contains(keyword)){
					System.out.println(file.getName() + ":" + file.getAbsolutePath());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    }
    
    /**
	 * copy file from src to dest
	 * @param sourceFile
	 * @param destFile
	 */
	public static void copyFile(File sourceFile,File destFile) {
		InputStream is = null;
		OutputStream out = null;
		
		byte[] buffer = new byte[1024];
		int length;
		
		try {
			is = new FileInputStream(sourceFile);
			out = new FileOutputStream(destFile);
			
			while((length = is.read(buffer))>0){
				out.write(buffer, 0, length);
			}
			
			is.close();
			out.close();
			
			System.out.println("File Copied Successfully!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void copyFolder(File src,File dest) throws Exception{
		if(src.isDirectory()){
			if(!dest.exists()){
				dest.mkdir();
				System.out.println("Copied from " + src + " to  " + dest );
			}
			
			//recursive
			String[] strs = src.list();
			for(String str:strs){
				File srcFile = new File(src, str);
				File destFile = new File(dest, str);
				copyFolder(srcFile, destFile);
			}
		}else{
			InputStream is = new FileInputStream(src);
			OutputStream os = new FileOutputStream(dest);
			
			byte[] buffer = new byte[1024];
			int length;
			
			while((length=is.read(buffer))>0){
				os.write(buffer, 0, length);
			}
			
			is.close();
			os.close();
		}
	}
	
	/**
	 * This class is used to count the currently file lines
	 * @param filePath source file path
	 * @param type  file type
	 * @throws IOException
	 */
	public static void readFile(String filePath,String type) throws IOException{
		File file = new File(filePath);
		
		if(file.isFile()){
			    if(file.getName().endsWith(type)){
			    	System.out.println(file.getName() + ", Total lines:" + FileUtils.readLines(file).size() + ":" + file.getAbsolutePath());
			    }
		}else{
				String[] str = file.list();
				for(String s:str){
					File f = new File(file,s);
					readFile(f.getAbsolutePath(),type);
				}
			}
		}



    public void countFileLine() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        File dir = new File(path);
        showFileLine(dir);
        System.out.println("您一共为DMC写了:" + this.sum + "行代码");
    }

    public static int sum = 0;
    public void showFileLine(File dir) throws Exception {
        File[] fs = dir.listFiles();
        for (int i = 0; i < fs.length; i++) {
            //System.out.println(fs[i].getAbsolutePath());
            if(fs[i].isFile()){
                FileReader fr = new FileReader(fs[i]);
                BufferedReader br = new BufferedReader(fr);
                int fileLine = 0;
                while(br.readLine()!=null){
                    fileLine++;
                }
                System.out.println(fs[i]+"文件您一共写了"+fileLine + "行代码");
                this.sum +=fileLine;
            }
            if (fs[i].isDirectory()) {
                try {
                    showFileLine(fs[i]);
                } catch (Exception e) {
                }
            }
        }
    }


}
