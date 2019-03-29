package com.graduate.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.graduate.dao.ScoreApplication;
/**
 * 
 * @Discription: 实现层    
 * @Author: JiangChunLin  
 * @ClassName: ScoreApplicationImpl  
 * @Date: 2019年3月24日 下午4:58:56  
 * @Version: 1.0.0 Graduate
 */
@Component
public class ScoreApplicationImpl implements ScoreApplication {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	/**
	 * 
	 *  @Description: 通过对的年和学期来查询对应的成绩值
	 *  @Author: JiangChunLin
	 *  @see com.graduate.dao.ScoreApplication#findStudentScoreByTerm(int, int)
	 */
	@Override
	public List<Map<String, Object>> findStudentScoreByTerm(String sno,int year, int term) {
		String sql="SELECT \r\n" + 
				"	c.courseName,d.`name`,c.learnCredit,\r\n" + 
				"	c.learnHour,a.plainScore,a.testScore,a.totalScore \r\n" + 
				"FROM \r\n" + 
				"	attence_score a \r\n" + 
				"LEFT JOIN attence_teacher_course b ON a.courseCode=b.courseCode AND a.tehCouKey=b.tehCouKey\r\n" + 
				"LEFT JOIN attence_course c on a.courseCode=c.courseCode\r\n" + 
				"LEFT JOIN attence_teacher d on d.tno=b.tno\r\n" + 
				"WHERE \r\n" + 
				"	a.sno='"+sno+"' \r\n" + 
				"	AND b.`year`='"+year+"' \r\n" + 
				"	AND b.term='"+term+"'\r\n" + 
				"";
		try {
			List<Map<String, Object>> result=jdbcTemplate.queryForList(sql);
			return result;
		} catch (DataAccessException e) {			
			e.printStackTrace();
			return null;
		}
	}

}
