package com.graduate.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.graduate.dao.QuestionOpenDao;
import com.graduate.dao.QuestionResponseDao;
import com.graduate.entity.QuestionResponse;
import com.graduate.utils.JSONResult;
import com.graduate.utils.StringUtils;
/**
 * 
 * @Discription: TODO    
 * @Author: JiangChunLin  
 * @ClassName: QuestionResponseImpl  
 * @Date: 2019年3月23日 上午10:46:42  
 * @Version: 1.0.0 Graduate
 */
@Component
public class QuestionResponseImpl implements QuestionResponseDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private QuestionOpenDao questionOpenDao;
	@Override
	public List<Map<String, Object>> findQuestionResponseByUUID(String uuid) {
		String sql="SELECT a.*,c.`name`,d.`name` as named FROM attence_question_response a LEFT JOIN attence_question  b on a.questionPKey=b.uuid\r\n" + 
				"LEFT JOIN attence_account c on c.account=a.peopleNo\r\n" + 
				"LEFT JOIN (select aqr.pkey,aqr.parentPKey,ac.`name`  from attence_question_response aqr LEFT join attence_account ac on aqr.peopleNo=ac.account   ) d on a.parentPKey=d.pkey \r\n" + 
				"WHERE b.uuid='"+uuid+"' ORDER BY a.responseTime DESC";
		List<Map<String, Object>> result=jdbcTemplate.queryForList(sql);
		return result;
	}

	@Override
	public List<Map<String, Object>> addQuestionResponseByPkey(String pkey) {
		
		return null;
	}
	/**
	 * 
	 *  @Description: TODO
	 *  @Author: JiangChunLin
	 *  @see com.graduate.dao.QuestionResponseDao#addResponse(com.graduate.entity.QuestionResponse)
	 */
	@Override
	public JSONResult addResponse(QuestionResponse questionResponse) {
		if(questionResponse.getParentKey()==null||questionResponse.getParentKey().length()<=0){
			questionResponse.setParentKey("");
			System.out.println("父节点为空");
		}
		String sql="INSERT INTO attence_question_response VALUES('"+questionResponse.getPkey()
		+"','"+questionResponse.getContent()+"','"+questionResponse.getPeopleNo()+
		"','"+StringUtils.dateToYMDHMS(questionResponse.getResponseTime())
		+"','"+questionResponse.getQuestionKey()+"','"+questionResponse.getParentKey()+"')";
		int num=jdbcTemplate.update(sql);
		questionOpenDao.addMarkNumber(questionResponse.getQuestionKey());
		return num==1?JSONResult.success():JSONResult.failure("插入数据失败");
	}

}
