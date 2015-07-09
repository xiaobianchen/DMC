package com.dmc.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

/**
 * 
 * Created by Xiaobian Chen on 2015年7月9日
 * This class is used to handle with file operation
 *
 *
 */
public class FileUtil {

	private static final String path = "C:/Users/jchen19/Desktop/personal/git/CoreJava/src/main/java/com/ebay/java";
	public static int count = 0;
	public static int folderCount = 0;

	public static void main(String[] args) throws Exception {
//		System.out.println("Please Input Vender Name:");
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String line = br.readLine();
		
//		int count = countFiles(path);
//		int folderCount =countFolder(path);
//		System.out.println("扫描后的文件夹个数为：" + folderCount + " 扫描后的文件个数为：" + count );
		countLines(path, "java");
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
		if(file.isFile()){
			if(file.getName().endsWith(from)){
				file.renameTo(new File(file.getParent() + "/" + file.getName().substring(0, file.getName().indexOf(from)) + to));
				System.out.println("changed file name successfully!");
			}
		}else{
			String[] strs = file.list();
			for(String s: strs){
				File f = new File(file,s);
				rname(f.getAbsolutePath(), from, to);
			}
		}
	}

	/**
	 * 
	 * @param file
	 */
	public static void deleteFiles(String path, String str) {
		File file = new File(path);
		if (file.isFile()) {
			if (file.getName().endsWith(str)){
				file.delete();
				System.out.println("delete file successfully!");
			}
		} else {
			String[] stoken = file.list();
			for (String token : stoken) {
				File f = new File(file, token);
				deleteFiles(f.getAbsolutePath(),str);
			}
		}
	}
	
	/**
	 * 
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
			if(fi.isDirectory()&& !fi.isHidden()){
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
	 * count lines of specify folder
	 * @param path  file path
	 * @param type  file type
	 * @throws IOException 
	 */
	public static void countLines(String path,String type) throws IOException{
		File file = new File(path);
		if(file.isFile()){
			if(file.getName().endsWith(type)){
				System.out.println(file.getName() + "------total lines: " + FileUtils.readLines(file).size());
			}
		}else{
			String[] strs = file.list();
			for(String str : strs){
				File f = new File(file,str);
				countLines(f.getAbsolutePath(), type);
			}
		}
	}
}
