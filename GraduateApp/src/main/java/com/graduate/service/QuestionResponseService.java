package com.graduate.service;

import com.graduate.entity.QuestionResponse;
import com.graduate.utils.JSONResult;

/**
 * 
 * @Discription:  
 * @Author: JiangChunLin  
 * @ClassName: IQuestionResponseService  
 * @Date: 2019年3月23日 上午11:08:21  
 * @Version: 1.0.0 Graduate
 */
public interface QuestionResponseService {
	JSONResult findResponseByUUID(String uuid);

	JSONResult addResponse(QuestionResponse questionResponse);	
}
