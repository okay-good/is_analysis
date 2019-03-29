package com.graduate.file;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * 
 * @Discription: 保存文件上传进度的状态信息 
 * @Author: JiangChunLin  
 * @ClassName: FileUploadStatus  
 * @Date: 2019年2月15日 上午10:18:00  
 * @Version: 1.0.0 Graduate
 */
@Component
public class FileUploadStatus implements Serializable{
	/** 
	 *  @Discription: TODO
	 *  serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private long readedBytes=0;//当前文件已上传的字节数
	private long totalBytes;//当前文件总的字节数
	private int fileItems;//上传文件个数
	public long getReadedBytes() {
		return readedBytes;
	}
	public void setReadedBytes(long readedBytes) {
		this.readedBytes = readedBytes;
	}
	public long getTotalBytes() {
		return totalBytes;
	}
	public void setTotalBytes(long totalBytes) {
		this.totalBytes = totalBytes;
	}
	public int getFileItems() {
		return fileItems;
	}
	public void setFileItems(int fileItems) {
		this.fileItems = fileItems;
	}
	
	@Override
	public String toString() {
		return "{readedBytes : " + readedBytes + ", totalBytes : " + totalBytes + ", fileItems : " + fileItems + "}";
	}
	public FileUploadStatus(long readedBytes, long totalBytes, int fileItems) {
		super();
		this.readedBytes = readedBytes;
		this.totalBytes = totalBytes;
		this.fileItems = fileItems;
	}
	public FileUploadStatus() {
		super();
	}
	
}
