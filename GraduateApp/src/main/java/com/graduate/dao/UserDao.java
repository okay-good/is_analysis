package com.graduate.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * 
 * @Discription: 处理用户的信息   
 * @Author: JiangChunLin  
 * @ClassName: UserDao  
 * @Date: 2019年3月17日 下午3:44:00  
 * @Version: 1.0.0 Graduate
 */
@Component
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<Map<String,Object>> findStudentUserInfo(String sno){
		String sql="SELECT a.account,a.`name`,sex,b.majorName,b.academicName,b.grade,"
				+ "b.tel FROM attence_account a LEFT JOIN attence_student b on a.account=b.sno\r\n" + 
				"WHERE a.role=1 and a.enabled=1 AND a.account='"+sno+"' ";
		try {
			List<Map<String,Object>> result=jdbcTemplate.queryForList(sql);
			return result;
		} catch (DataAccessException e) {			
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @param tel
	 *  @Date: 2019年3月17日下午4:20:09
	 */
	public void updateUserInfo(String sno, String tel) {
		String sql="UPDATE attence_student set tel='"+tel+"' where sno='"+sno+"'";
		jdbcTemplate.update(sql);		
	}
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @param originPwd
	 *  @param newPwd
	 *  @return
	 *  @Date: 2019年3月17日下午5:13:09
	 */
	public boolean validatePwd(String sno, String originPwd) {
		String sql="SELECT count(*) num from attence_account WHERE `password` =MD5('"+originPwd+"') "
				+ "and  account='"+sno+"' ";
		int num=jdbcTemplate.queryForObject(sql, int.class);
		System.out.println(num);
		return num==1?true:false;
	}
	/**
	 * 
	 */
	public boolean updatePwd(String sno, String originPwd, String newPwd){
		String sql="UPDATE attence_account set `password`=MD5(\""+newPwd+"\") "
				+ "WHERE account='"+sno+"' AND `password`=MD5('"+originPwd+"')";
		int num=jdbcTemplate.update(sql);
		return num==1?true:false;
	}
	
	/**
	 * 通过学号查询学生的入学年份即为那一级
	 */
	public int findGrade(String sno){
		String sql="SELECT grade FROM attence_student WHERE sno='"+sno+"'";
		try {
			int grade=jdbcTemplate.queryForObject(sql, int.class);
			return grade;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return -1;
		}
	}
	
	
}
