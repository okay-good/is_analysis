package com.graduate.dao;

import java.util.List;
import java.util.Map;

/**
 * 
 * @Discription: 分数查询的类   
 * @Author: JiangChunLin  
 * @ClassName: ScoreApplication  
 * @Date: 2019年3月24日 下午4:56:13  
 * @Version: 1.0.0 Graduate
 */
public interface ScoreApplication {
	/**
	 * 
	 *  @Discription: 通过大几的第几学期来查询,需要将对应的大几转为年值和第几学期
	 *  @Author: JiangChunLin
	 *  @param grade
	 *  @param term
	 *  @param sno
	 *  @Date: 2019年3月24日下午4:56:58
	 */
	List<Map<String,Object>> findStudentScoreByTerm(String sno,int year,int term);
}
