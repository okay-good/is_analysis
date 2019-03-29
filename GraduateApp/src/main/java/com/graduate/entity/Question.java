package com.graduate.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;
/**
 * 
 * @Discription:问题对应类   
 * @Author: JiangChunLin  
 * @ClassName: Question  
 * @Date: 2019年3月19日 下午5:20:30  
 * @Version: 1.0.0 Graduate
 */
public class Question implements Serializable{
	/** 
	 *  @Discription: TODO
	 *  serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private String uuid;
	private String title;
	private String content;
	private Date openTime;
	private String sno;
	private int markNumber;
	private String imageUrls;
	private String tehCouKey;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getOpenTime() {
		return openTime;
	}
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public int getMarkNumber() {
		return markNumber;
	}
	public void setMarkNumber(int markNumber) {
		this.markNumber = markNumber;
	}
	public String getImageUrls() {
		return imageUrls;
	}
	public void setImageUrls(String imageUrls) {
		this.imageUrls = imageUrls;
	}
	public String getTehCouKey() {
		return tehCouKey;
	}
	public void setTehCouKey(String tehCouKey) {
		this.tehCouKey = tehCouKey;
	}
	@Override
	public String toString() {
		return "{uuid : " + uuid + ", title : " + title + ", content : " + content + ", openTime : " + openTime
				+ ", sno : " + sno + ", markNumber : " + markNumber + ", imageUrls : " + imageUrls + ", tehCouKey : "
				+ tehCouKey + "}";
	}
	
	
}
