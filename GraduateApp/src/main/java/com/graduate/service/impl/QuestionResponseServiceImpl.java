package com.graduate.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduate.dao.QuestionResponseDao;
import com.graduate.entity.QuestionResponse;
import com.graduate.service.QuestionResponseService;
import com.graduate.utils.JSONResult;
import com.graduate.utils.StringUtils;
/**
 * 
 * @Discription: Service 
 * @Author: JiangChunLin  
 * @ClassName: QuestionResponseServiceImpl  
 * @Date: 2019年3月23日 上午11:09:31  
 * @Version: 1.0.0 Graduate
 */
@Service 
public class QuestionResponseServiceImpl implements QuestionResponseService {
	@Autowired
	private QuestionResponseDao questionResponseDao; 
	@Override
	public JSONResult findResponseByUUID(String uuid) {
		List<Map<String,Object>> result=questionResponseDao.findQuestionResponseByUUID(uuid);
		return JSONResult.success(result);
	}
	@Override
	public JSONResult addResponse(QuestionResponse questionResponse) {
		String uuid=StringUtils.uuid(32);
		questionResponse.setPkey(uuid);
		JSONResult result =questionResponseDao.addResponse(questionResponse);
		return result;
	}

}
