package com.graduate.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graduate.dao.ScoreApplication;
import com.graduate.dao.UserDao;
import com.graduate.service.ScoreService;
import com.graduate.utils.JSONResult;
import com.graduate.utils.StringUtils;
/**
 * 
 * @Discription: Score的Service层
 * @Author: JiangChunLin  
 * @ClassName: ScoreServiceImpl  
 * @Date: 2019年3月24日 下午5:06:27  
 * @Version: 1.0.0 Graduate
 */
@Service
public class ScoreServiceImpl implements ScoreService {
	@Autowired
	private ScoreApplication scoreApplication;
	@Autowired
	private UserDao userDao;
	/**
	 * 
	 *  @Description: 查询成绩
	 *  @Author: JiangChunLin
	 *  @see com.graduate.service.ScoreService#findStudentScoreByTerm(java.lang.String, int, int)
	 */
	@Override
	public JSONResult findStudentScoreByTerm(String sno, int univerth, int term) {
		int grade=userDao.findGrade(sno);
		int year=StringUtils.findYearFromUniverth(grade, univerth, term);
		int terms=term==1?2:1;//第一学期则为一年中的下半学期
		List<Map<String,Object>> result=scoreApplication.findStudentScoreByTerm(sno, year, terms);
		if(result!=null&&result.size()>0){
			return JSONResult.success(result);
		}else{
			return JSONResult.success();
		}
	}

}
