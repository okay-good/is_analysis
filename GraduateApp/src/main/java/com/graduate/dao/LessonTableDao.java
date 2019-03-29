package com.graduate.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * 
 * @Discription: 课程表的DAO    
 * @Author: JiangChunLin  
 * @ClassName: LessonTableDao  
 * @Date: 2019年3月16日 下午3:10:33  
 * @Version: 1.0.0 Graduate
 */
@Component
public class LessonTableDao {
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	/**
	 * 
	 *  @Discription: 查询教师的课表信息
	 *  @Author: JiangChunLin
	 *  @param stno
	 *  @param sdate
	 *  @param edate
	 *  @return
	 *  @Date: 2019年3月16日下午3:12:39
	 */
	public List<Map<String,Object>> findOneWeekTeacherLessonInfo(String tno,String sdate,String edate){
		try {
			String sql="SELECT atl.location,ac.courseName,atl.lessonTime,atl.courseIndex\r\n" + 
					"FROM  attence_teacher_lesson atl LEFT JOIN  attence_course ac on ac.courseCode=atl.courseCode\r\n" + 
					"WHERE atl.tno='"+tno+"' AND DATE_FORMAT(atl.lessonTime,'%Y-%m-%d') BETWEEN '"+sdate+"' AND '"+edate+"'";
			List<Map<String,Object>> result=jdbcTemplate.queryForList(sql);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @return
	 *  @Date: 2019年3月17日下午2:30:57
	 */
	public String findMinStartLessonDate(){
		String sql="SELECT MIN(lessonTime) FROM attence_teacher_lesson";
		String minStartLessonDate=jdbcTemplate.queryForObject(sql, String.class);
		return minStartLessonDate;
	}
	
	public List<Map<String,Object>> findOneWeekStudentCourseTableInfo(String sno,String sdate,String edate){
		String sql="SELECT \r\n" + 
				"	c.location,d.courseName,c.lessonTime,c.courseIndex\r\n" + 
				"	\r\n" + 
				"FROM \r\n" + 
				"	attence_student_lesson a LEFT JOIN attence_teacher_course b on a.tehCouKey=b.tehCouKey\r\n" + 
				"LEFT JOIN attence_teacher_lesson c  on b.tno=c.tno and b.courseCode=c.courseCode\r\n" + 
				"LEFT JOIN attence_course d on c.courseCode=d.courseCode\r\n" + 
				"where\r\n" + 
				"DATE_FORMAT(c.lessonTime,'%Y-%m-%d') BETWEEN '"+sdate+"' and '"+edate+"' "
				+ "AND a.sno='"+sno+"' ORDER BY c.lessonTime,c.courseIndex";
		try {
			List<Map<String,Object>> result=jdbcTemplate.queryForList(sql);
			System.out.println(sno+"  "+sdate+"  "+edate);
			System.out.println(sql);
			System.out.println(result);
			return result;
		} catch (Exception e) {
			return null;
		}
	}
	
	
	/**
	 * 查询学生的所学课程
	 */
	public List<Map<String,Object>> findStudentAllLearnCourseType(String sno,int year,int term){
		String sql="SELECT DISTINCT a.tehCouKey, b.courseName FROM attence_teacher_course a LEFT JOIN attence_course b on a.courseCode=b.courseCode\r\n" + 
				"LEFT JOIN attence_student_lesson c on c.tehCouKey=a.tehCouKey \r\n" + 
				"WHERE c.sno='"+sno+"' AND a.year="+year+" AND a.term="+term;
		List<Map<String,Object>> result=jdbcTemplate.queryForList(sql);
		return result;
	}
	
	/**
	 * 查询教师教授的课程
	 */
	public List<Map<String,Object>> findTeacherAllLearnCourseType(String tno,int year,int term){
		String sql="SELECT DISTINCT b.courseCode,b.courseName,a.tno FROM attence_teacher_course a LEFT JOIN attence_course b on a.courseCode=b.courseCode\r\n" + 
				"WHERE a.year="+year+" and a.term="+term+" AND a.tno='"+tno+"'";
		List<Map<String,Object>> result=jdbcTemplate.queryForList(sql);
		return result;
	}
	
	
}
