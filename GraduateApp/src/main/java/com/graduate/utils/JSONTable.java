package com.graduate.utils;

import java.io.Serializable;

/**
 * 
 * @Discription: 针对数据表格的返回信息实体类   
 * @Author: JiangChunLin  
 * @ClassName: JSONTable  
 * @Date: 2019年2月21日 下午2:28:51  
 * @Version: 1.0.0 Graduate
 */
public class JSONTable implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private boolean hasError;
	private Integer code;//状态码0成功,1:异常
	private String msg;//信息
	private Integer count;//数量
	private Object data;//数据
	
	
	public boolean isHasErrors() {
		return hasError;
	}

	public boolean isSuccess() {
		return !hasError;
	}

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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	public static JSONTable success(Object data) {
		JSONTable result = new JSONTable();
		result.data = data;
		result.hasError = false;
		result.code=0;
		return result;
	}

	public static JSONTable success() {
		JSONTable result = new JSONTable();
		result.hasError = false;
		result.code=0;
		return result;
	}

	public static JSONTable failure(String message) {
		JSONTable result = new JSONTable();
		result.hasError = true;
		result.msg = message;
		result.code=1;
		return result;
	}
}
