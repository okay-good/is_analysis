package com.graduate.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @Discription: 问题的回复类   
 * @Author: JiangChunLin  
 * @ClassName: QuestionResponse  
 * @Date: 2019年3月23日 下午3:20:34  
 * @Version: 1.0.0 Graduate
 */
public class QuestionResponse implements Serializable{
	private static final long serialVersionUID = 1L;
	private String pkey;
	private String content;
	private String peopleNo;//发表评论或者回复的人员的no
	private Date responseTime=new Date();
	private String questionKey;
	private String parentKey;
	public String getPkey() {
		return pkey;
	}
	public void setPkey(String pkey) {
		this.pkey = pkey;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPeopleNo() {
		return peopleNo;
	}
	public void setPeopleNo(String peopleNo) {
		this.peopleNo = peopleNo;
	}
	public Date getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}
	public String getQuestionKey() {
		return questionKey;
	}
	public void setQuestionKey(String questionKey) {
		this.questionKey = questionKey;
	}
	public String getParentKey() {
		return parentKey;
	}
	public void setParentKey(String parentKey) {
		this.parentKey = parentKey;
	}
	@Override
	public String toString() {
		return "{pkey : " + pkey + ", content : " + content + ", peopleNo : " + peopleNo + ", responseTime : "
				+ responseTime + ", questionKey : " + questionKey + ", parentKey : " + parentKey + "}";
	}
	

}
