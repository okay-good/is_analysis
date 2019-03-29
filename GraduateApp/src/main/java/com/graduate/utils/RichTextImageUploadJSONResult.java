package com.graduate.utils;

import java.io.Serializable;

/**
 * 
 * @Discription: 富文本上传图片后返回的json值   
 * @Author: JiangChunLin  
 * @ClassName: RichTextImageUploadJSONResult  
 * @Date: 2019年2月23日 下午4:01:49  
 * @Version: 1.0.0 Graduate
 */
class Data implements Serializable{
	private static final long serialVersionUID = 1L;
	private String src;
	private String title;
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Data(String src, String title) {
		super();
		this.src = src;
		this.title = title;
	}
	public Data() {
		super();
	}
	
}


public class RichTextImageUploadJSONResult implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer code;
	private String msg;
	private Data data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	
	public static RichTextImageUploadJSONResult success(String src,String title){
		RichTextImageUploadJSONResult result=new RichTextImageUploadJSONResult();
		result.setCode(0);
		result.setMsg("图片上传成功!");
		result.setData(new Data(src,title));
		return result;
	}
	
	public static RichTextImageUploadJSONResult failure(){
		RichTextImageUploadJSONResult result=new RichTextImageUploadJSONResult();
		result.setCode(-1);
		result.setMsg("图片上传失败!");
		result.setData(new Data(null,null));
		return result;
	}
	
	
}
