package com.graduate.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.graduate.entity.Question;
import com.graduate.utils.StringUtils;

/**
 * 
 * @Discription: TODO    
 * @Author: JiangChunLin  
 * @ClassName: QuestionOpenDao  
 * @Date: 2019年3月19日 下午5:10:47  
 * @Version: 1.0.0 Graduate
 */
@Component
public class QuestionOpenDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param question
	 *  @return
	 *  @Date: 2019年3月20日下午10:25:55
	 */
	public boolean addOneQuestion(Question question){
		String uuid=StringUtils.uuid(32);
		Date date=new Date();
		String dateStr=StringUtils.dateToYMDHMS(date);
		String sql="insert into attence_question values('"+uuid+"','"+question.getTitle()+"','"+question.getContent()
				+"','"+dateStr+"','"+question.getSno()+"',0,'"+question.getImageUrls()+"','"+question.getTehCouKey()+"')";
		int num=jdbcTemplate.update(sql);
		return num==1?true:false;
	}
	
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @param courseNmaes
	 *  @return
	 *  @Date: 2019年3月20日下午10:27:15
	 */
	public List<Map<String,Object>> findQuestionsByStudent(String[] tehCouKey){
		String param=arrayToInParam(tehCouKey);
		String sql="SELECT \r\n" + 
				"	a.uuid,a.title,a.content,DATE_FORMAT(a.openTime,'%Y/%m/%d %H:%i:%S') openTime,a.markNumber,a.imagesUrl,c.sex,c.`name`,ac.courseName  \r\n" + 
				"FROM \r\n" + 
				"	attence_question a LEFT JOIN attence_teacher_course b on a.tehCouKey=b.tehCouKey"
				+" LEFT JOIN attence_course ac on ac.courseCode=b.courseCode "
				+ " LEFT JOIN attence_student c on c.sno=a.sno\r\n" + 
				"WHERE \r\n" + 
				"	a.tehCouKey in (\r\n" + param
				+ ") order by openTime desc";
		List<Map<String,Object>> result=jdbcTemplate.queryForList(sql);
		return result;
	}
	
	/**
	 * 
	 *  @Discription: 增加评论数
	 *  @Author: JiangChunLin
	 *  @param questionKey
	 *  @return
	 *  @Date: 2019年3月23日下午4:59:15
	 */
	public int addMarkNumber(String questionKey){
		String sql="UPDATE attence_question set markNumber=markNumber+1 WHERE uuid='"+questionKey+"'";
		int num=jdbcTemplate.update(sql);
		return num;
	}
	
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param arr
	 *  @return
	 *  @Date: 2019年3月21日下午9:56:21
	 */
	private String arrayToInParam(String[] arr){
		if(arr==null||arr.length==0){
			return "";
		}else{
			StringBuffer stringBuffer=new StringBuffer();
			int len=arr.length;
			for(int i=0;i<len;i+=1){
				stringBuffer.append("'"+arr[i]+"'");
				if(i<(len-1)){
					stringBuffer.append(",");
				}
			}
			return stringBuffer.toString();
		}
	}
	
	
}
