package com.graduate.file;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

import com.graduate.utils.StringUtils;


/**
 * 
 * @Discription: 文件上传工具类    
 * @Author: JiangChunLin  
 * @ClassName: FileUploadUtils  
 * @Date: 2019年2月17日 下午2:02:38  
 * @Version: 1.0.0 Graduate
 */
public class FileUploadUtils {
	private final static String fileUrlPrefix="http://127.0.0.1/uploadFile/";
	/**
	 * 
	 *  @Discription: 成功上传后则返回文件的路径
	 *  @Author: JiangChunLin
	 *  @param file
	 *  @param destDir
	 *  @return
	 *  @Date: 2019年3月12日下午5:46:09
	 */
	public static String fileUploadTo(MultipartFile file,String destDir){
		boolean flag=hasFileDir(destDir);
		if(!flag){
			creatDir(destDir);
		}
		String uuid=StringUtils.uuid(16);
		String suffixName=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);
		String fileDir=destDir+"/"+uuid+"."+suffixName;
		File dest=new File(fileDir);
		try {
			System.out.println("执行上传一次");
			file.transferTo(dest);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
//		return fileDir.replaceAll("\\\\", "/");
		return fileUrlPrefix+uuid+"."+suffixName;
	}
	
	/**
	 * 
	 *  @Discription: 判断文件夹是否存在
	 *  @Author: JiangChunLin
	 *  @param fileDir
	 *  @return
	 *  @Date: 2019年2月17日下午2:12:28
	 */
	public static boolean hasFileDir(String fileDir){
		File tempDir=new File(fileDir);
		if(tempDir.exists()){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 
	 *  @Discription: 创建对应的文件夹
	 *  @Author: JiangChunLin
	 *  @param fileDir
	 *  @return
	 *  @Date: 2019年2月17日下午2:14:54
	 */
	public static File creatDir(String fileDir){
		File file=new File(fileDir);
		if(file.exists()){
			return file;
		}else{
			file.mkdirs();
			return file;
		}
	}
	
}
