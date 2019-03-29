package com.graduate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graduate.service.ScoreService;
import com.graduate.utils.JSONResult;

/**
 * 
 * @Discription: 成绩的Controll 
 * @Author: JiangChunLin  
 * @ClassName: ScoreController  
 * @Date: 2019年3月24日 下午5:23:04  
 * @Version: 1.0.0 Graduate
 */
@RestController
@RequestMapping(value="score")
public class ScoreController {
	@Autowired
	private ScoreService scoreService;
	@RequestMapping(value="findStudentScoreByTerm")
	public JSONResult findStudentScoreByTerm(String sno,int univerth,int terms){
		System.out.println(sno+"   "+univerth+"   "+terms);
		return scoreService.findStudentScoreByTerm(sno, univerth, terms);
	}
	
}
