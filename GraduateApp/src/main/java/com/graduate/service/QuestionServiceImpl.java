package com.graduate.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.graduate.dao.QuestionOpenDao;
import com.graduate.entity.Question;
import com.graduate.utils.JSONResult;

/**
 * 
 * @Discription: TODO    
 * @Author: JiangChunLin  
 * @ClassName: QuestionServiceImpl  
 * @Date: 2019年3月20日 下午3:39:07  
 * @Version: 1.0.0 Graduate
 */
@Service
@Transactional
public class QuestionServiceImpl {
	@Autowired
	private QuestionOpenDao questionOpenDao;
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param question
	 *  @return
	 *  @Date: 2019年3月20日下午10:41:48
	 */
	public JSONResult addOneQuestion(Question question){
		String sno=question.getSno();
		String title=question.getTitle();
		String tehCouKey=question.getTehCouKey();
		if(!StringUtils.hasLength(sno)||!StringUtils.hasLength(title)||!StringUtils.hasLength(tehCouKey)){
			return JSONResult.failure("数据存在空值");
		}
		boolean flag=questionOpenDao.addOneQuestion(question);
		if(flag){
			return JSONResult.success();
		}else{
			return JSONResult.failure("插入异常");
		}
	}
	
	/**
	 * 
	 */
	public JSONResult findQuestionsByStudent(String tehCouKey){
		if(!StringUtils.hasLength(tehCouKey)){
			return JSONResult.failure("参数不能为空");
		}
		String[] array=tehCouKey.split(",");
		List<Map<String,Object>> result=questionOpenDao.findQuestionsByStudent(array);
		if(result!=null&&result.size()>0){
			return JSONResult.success(result);
		}else{
			return JSONResult.success();
		}
	}
}
