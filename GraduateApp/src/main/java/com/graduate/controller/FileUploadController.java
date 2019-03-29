package com.graduate.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.graduate.file.FileUploadStatus;
import com.graduate.file.FileUploadUtils;
import com.graduate.utils.JSONResult;
import com.graduate.utils.RichTextImageUploadJSONResult;

/**
 * 
 * @Discription: 文件上传控制器 
 * @Author: JiangChunLin  
 * @ClassName: FileUploadController  
 * @Date: 2019年2月17日 下午1:59:25  
 * @Version: 1.0.0 Graduate
 */
@RequestMapping(value="file")
@RestController
public class FileUploadController {
	/**
	 * 
	 *  @Discription: 文件上传
	 *  @Author: JiangChunLin
	 *  @param file
	 *  @param request
	 *  @param response
	 *  @return
	 *  @Date: 2019年2月17日下午2:39:19
	 */
	@RequestMapping(value="/fileUpload")
	public JSONResult fileUpload(MultipartFile file,HttpServletRequest request,HttpServletResponse response){
		String destFile=request.getSession().getServletContext().getRealPath
				("uploadFile");
		String fileDestDir=FileUploadUtils.fileUploadTo(file, destFile);
		return JSONResult.success(fileDestDir);
	}
	
	@RequestMapping(value="/fileUploadProgress")
	public FileUploadStatus fileUploadProgress(HttpSession session){
		FileUploadStatus fileUploadStatus=(FileUploadStatus) session.getAttribute("fileUploadStatus");
		if(fileUploadStatus==null){
			return new FileUploadStatus();
		}else{
			return fileUploadStatus;
		}
		
	}
	
	@ResponseBody
	@RequestMapping(value="richTextImageUpload")
	public RichTextImageUploadJSONResult richTextImageUpload(MultipartFile file){
		System.out.println("+++++++++++++++++++++++++++++ "+file);
		return RichTextImageUploadJSONResult.success("../image/mini.jpg","描述");
	}
	
}
