package com.graduate.utils;
/**
 * 
 * @Discription: 返回结果类    
 * @Author: JiangChunLin  
 * @ClassName: JSONResult  
 * @Date: 2019年2月15日 下午4:39:53  
 * @Version: 1.0.0 Graduate
 */
public class JSONResult {
	private Object data;
	private int code;
	private String errorMessage;
	private int count;
	private boolean hasErrors;

	public int getCode() {
		return code;
	}

	public int getCount() {
		return count;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public void setHasErrors(boolean hasErrors) {
		this.hasErrors = hasErrors;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public static JSONResult success(Object data) {
		JSONResult result = new JSONResult();
		result.data = data;
		result.hasErrors = false;
		result.code=0;
		return result;
	}

	public static JSONResult success() {
		JSONResult result = new JSONResult();
		result.hasErrors = false;
		result.code=0;
		return result;
	}

	public static JSONResult failure(String message) {
		JSONResult result = new JSONResult();
		result.hasErrors = true;
		result.errorMessage = message;
		result.code=1;
		return result;
	}

	public Object getData() {
		return data;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public boolean isHasErrors() {
		return hasErrors;
	}

	public boolean isSuccess() {
		return !hasErrors;
	}
}
