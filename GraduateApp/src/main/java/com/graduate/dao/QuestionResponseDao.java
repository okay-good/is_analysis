package com.graduate.dao;

import java.util.List;
import java.util.Map;

import com.graduate.entity.QuestionResponse;
import com.graduate.utils.JSONResult;

/**
 * 
 * @Discription: 问题回复接口   
 * @Author: JiangChunLin  
 * @ClassName: IQuestionResponse  
 * @Date: 2019年3月23日 上午10:46:03  
 * @Version: 1.0.0 Graduate
 */
public interface QuestionResponseDao {
	/**
	 * 
	 *  @Discription: 通过UUID查询该问题的所有回复
	 *  @Author: JiangChunLin
	 *  @param uuid
	 *  @return
	 *  @Date: 2019年3月23日上午10:47:52
	 */
	List<Map<String,Object>> findQuestionResponseByUUID(String uuid);
	
	/**
	 * 
	 *  @Discription: 对已有的回复进行回复
	 *  @Author: JiangChunLin
	 *  @param pkey
	 *  @return
	 *  @Date: 2019年3月23日上午10:49:03
	 */
	List<Map<String,Object>> addQuestionResponseByPkey(String pkey);

	JSONResult addResponse(QuestionResponse questionResponse);
}
