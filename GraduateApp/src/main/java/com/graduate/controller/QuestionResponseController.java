package com.graduate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graduate.entity.QuestionResponse;
import com.graduate.service.QuestionResponseService;
import com.graduate.utils.JSONResult;

/**
 * 
 * @Discription: TODO    
 * @Author: JiangChunLin  
 * @ClassName: QuestionResponseController  
 * @Date: 2019年3月23日 上午11:12:50  
 * @Version: 1.0.0 Graduate
 */
@RestController
public class QuestionResponseController {
	@Autowired
	private QuestionResponseService questionResponseService;
	/**
	 * 
	 *  @Discription:查询问题的所有回复
	 *  @Author: JiangChunLin
	 *  @param uuid
	 *  @return
	 *  @Date: 2019年3月23日下午3:18:25
	 */
	@RequestMapping(value="findResponse")
	public JSONResult findResponse(String uuid){
		System.out.println(uuid);
		return questionResponseService.findResponseByUUID(uuid);
	}
	
	/**
	 * 
	 */
	@RequestMapping(value="addResponse")
	public JSONResult addResponse(QuestionResponse questionResponse){
		System.out.println(questionResponse);
		return questionResponseService.addResponse(questionResponse);
	}
	
	
}
