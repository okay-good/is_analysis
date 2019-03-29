package com.graduate.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.graduate.dao.LessonTableDao;
import com.graduate.utils.JSONResult;

/**
 * 
 * @Discription: 课程表信息的service   
 * @Author: JiangChunLin  
 * @ClassName: LessonTableService  
 * @Date: 2019年3月16日 下午3:01:20  
 * @Version: 1.0.0 Graduate
 */
@Service
public class LessonTableService {
	@Autowired
	private LessonTableDao lessonTableDao;
	/**
	 * 
	 *  @Discription: 查询教师的课表信息
	 *  @Author: JiangChunLin
	 *  @param stno
	 *  @param sdate
	 *  @param edate
	 *  @return
	 *  @Date: 2019年3月16日下午3:03:55
	 */
	public JSONResult findOneWeekTeacherLessonInfo(String tno,String sdate,String edate){
		if(tno==null||sdate==null||edate==null){
			return JSONResult.failure("字段不能为空");
		}else{
			List<Map<String,Object>> result=lessonTableDao.findOneWeekTeacherLessonInfo(tno, sdate, edate);
			if(result==null||result.size()==0){
				return JSONResult.success();
			}else{
				return JSONResult.success(result);
			}
			
		}
	}
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @return
	 *  @Date: 2019年3月17日上午10:34:06
	 */
	public JSONResult startLessonDate() {
		try {
			String result=lessonTableDao.findMinStartLessonDate();
			return JSONResult.success(result);
		} catch (Exception e) {
			return JSONResult.failure("查询数据异常");
		}
	}
	
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @param sdate
	 *  @param edate
	 *  @return
	 *  @Date: 2019年3月17日下午3:54:13
	 */
	public JSONResult findOneWeekStudentCourseTableInfo(String sno,String sdate,String edate){
		try {
			List<Map<String,Object>> result=lessonTableDao.findOneWeekStudentCourseTableInfo(sno, sdate, edate);
			return JSONResult.success(result);
		} catch (Exception e) {
			return JSONResult.success();
		}
	}
	/**
	 * 
	 */
	public JSONResult findStudentAllLearnCourseType(String sno,int year,int term){
		if(StringUtils.hasLength(sno)&&year>2000&&term>0){
			try {
				List<Map<String,Object>> result=lessonTableDao.findStudentAllLearnCourseType(sno, year, term);
				if(result==null||result.size()==0){
					return JSONResult.success();
				}else{
					return JSONResult.success(result);
				}
			} catch (Exception e) {
				JSONResult.failure("数据库查询异常");
				e.printStackTrace();
			}
		}
		return JSONResult.failure("参数值存在空");
	}
	
	public JSONResult findTeacherAllLearnCourseType(String tno,int year,int term){
		if(StringUtils.hasLength(tno)&&year>2000&&term>0){
			try {
				List<Map<String,Object>> result=lessonTableDao.findTeacherAllLearnCourseType(tno, year, term);
				if(result==null||result.size()==0){
					return JSONResult.success();
				}else{
					return JSONResult.success(result);
				}
			} catch (Exception e) {
				JSONResult.failure("数据库查询异常");
				e.printStackTrace();
			}
		}
		return JSONResult.failure("参数值存在空");
	}
	
}
