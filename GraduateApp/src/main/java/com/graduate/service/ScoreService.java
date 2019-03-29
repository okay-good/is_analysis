package com.graduate.service;
/**
 * 
 * @Discription: Score的Service层   
 * @Author: JiangChunLin  
 * @ClassName: ScoreService  
 * @Date: 2019年3月24日 下午5:03:29  
 * @Version: 1.0.0 Graduate
 */

import com.graduate.utils.JSONResult;

public interface ScoreService {
	/**
	 * 
	 *  @Discription: 查询成绩
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @param univerth 大几
	 *  @param term 第几学期
	 *  @return
	 *  @Date: 2019年3月24日下午5:05:42
	 */
	JSONResult findStudentScoreByTerm(String sno,int univerth,int term);
}
