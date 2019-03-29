package com.graduate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graduate.entity.Question;
import com.graduate.service.QuestionServiceImpl;
import com.graduate.utils.JSONResult;
@RestController
@RequestMapping(value="question")
public class QuestionOpenController {
	@Autowired
	private QuestionServiceImpl questionService;
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param question
	 *  @return
	 *  @Date: 2019年3月20日下午10:44:36
	 */
	@RequestMapping(value="addOneQuestion")
	public JSONResult openQuestion(Question question){
		System.out.println(question);	
		return questionService.addOneQuestion(question);
	}
	
	/**
	 * 
	 */
	@RequestMapping(value="/findQuestionsByStudent")
	public JSONResult findQuestionsByStudent(String tehCouKey){
		System.out.println("参数: "+tehCouKey);
		return questionService.findQuestionsByStudent(tehCouKey);
	}
}
