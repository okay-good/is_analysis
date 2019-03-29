package com.graduate.entity;

import java.io.Serializable;

/**
 * 
 * @Discription: 查询参数类    
 * @Author: JiangChunLin  
 * @ClassName: QueryVo  
 * @Date: 2019年3月16日 下午2:48:37  
 * @Version: 1.0.0 Graduate
 */
public class QueryVo implements Serializable{
	/** 
	 *  @Discription: TODO
	 *  serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	private String stno;
	private String sdate;
	private String edate;
	public String getStno() {
		return stno;
	}
	public void setStno(String stno) {
		this.stno = stno;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	
}
