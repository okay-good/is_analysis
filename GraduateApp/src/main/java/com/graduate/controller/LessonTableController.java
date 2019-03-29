package com.graduate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graduate.service.LessonTableService;
import com.graduate.utils.JSONResult;

/**
 * 
 * @Discription: 课程表信息类   
 * @Author: JiangChunLin  
 * @ClassName: LessonTableController  
 * @Date: 2019年3月16日 下午3:06:27  
 * @Version: 1.0.0 Graduate
 */
@RestController
@RequestMapping(value="lesson")
public class LessonTableController {
	@Autowired
	private LessonTableService lessonTableService;
	/**
	 * 
	 *  @Discription: 查询教师课表信息
	 *  @Author: JiangChunLin
	 *  @param stno
	 *  @param sdate
	 *  @param edate
	 *  @return
	 *  @Date: 2019年3月17日上午10:31:47
	 */
	@RequestMapping(value="/findOneWeekTeacherLessonInfo")
	public JSONResult findOneWeekTeacherLessonInfo(String stno,String sdate,String edate){
		System.out.println(stno+sdate+ edate);
		return lessonTableService.findOneWeekTeacherLessonInfo(stno, sdate, edate);
	}
	
	@RequestMapping(value="/findOneWeekStudentCourseTableInfo")
	public JSONResult findOneWeekStudentCourseTableInfo(String sno,String sdate,String edate){
		return lessonTableService.findOneWeekStudentCourseTableInfo(sno, sdate, edate);
	}
	
	/**
	 * 
	 *  @Discription: 查询开始上课时间
	 *  @Author: JiangChunLin
	 *  @return
	 *  @Date: 2019年3月17日上午10:34:18
	 */
	@RequestMapping(value="/startLessonDate")
	public JSONResult startLessonDate(){
		return lessonTableService.startLessonDate();
	}
	
	
	/**
	 * 查询所学、教授课程
	 */
	@RequestMapping(value="findAllCourseType")
	public JSONResult findAllCourseType(String no,int year,int term,int role){
		if(role==1){
			return lessonTableService.findStudentAllLearnCourseType(no, year, term);
		}else{
			return lessonTableService.findTeacherAllLearnCourseType(no, year, term);
		}
	}
}
