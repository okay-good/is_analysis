package com.graduate.file;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
/**
 * 
 * @Discription: 读取文件上传进度的信息以便前台获取该值    
 * @Author: JiangChunLin  
 * @ClassName: GraduateFileMultipartResolver  
 * @Date: 2019年2月15日 上午10:38:45  
 * @Version: 1.0.0 Graduate
 */
@Component
public class GraduateFileMultipartResolver extends CommonsMultipartResolver{
	@Autowired
	FileUploadProgressListener fileUploadProgressListener;
	
	/**
	 * 
	 *  @Description: 解析请求并返回文件上传进度
	 *  @Author: JiangChunLin
	 *  @see org.springframework.web.multipart.commons.CommonsMultipartResolver#parseRequest(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	protected MultipartParsingResult parseRequest(HttpServletRequest request) throws MultipartException {
		String encoding = super.determineEncoding(request);
		fileUploadProgressListener.setSession(request.getSession());
        FileUpload fileUpload = prepareFileUpload(encoding);
        fileUpload.setProgressListener(fileUploadProgressListener);
        try {
            List<FileItem> fileItemList =  ((ServletFileUpload)fileUpload).parseRequest(request);
            return super.parseFileItems(fileItemList, encoding);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        return null;
	}
	
}
