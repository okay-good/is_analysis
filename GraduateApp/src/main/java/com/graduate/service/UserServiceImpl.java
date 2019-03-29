package com.graduate.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.graduate.dao.UserDao;
import com.graduate.utils.JSONResult;

/**
 * 
 * @Discription: TODO    
 * @Author: JiangChunLin  
 * @ClassName: UserServiceImpl  
 * @Date: 2019年3月17日 下午3:54:40  
 * @Version: 1.0.0 Graduate
 */
@Service
public class UserServiceImpl {
	@Autowired
	private UserDao userDao;
	/**
	 * 
	 *  @Discription: 查询学生用户的信息
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @return
	 *  @Date: 2019年3月17日下午3:57:51
	 */
	public JSONResult findStudentUserInfo(String sno){
		if(sno==null||sno.trim().length()==0){
			return JSONResult.failure("账号值为空");
		}else{
			List<Map<String,Object>> result=userDao.findStudentUserInfo(sno);
			if(result!=null&&result.size()!=0){
				return JSONResult.success(result);
			}else{
				return JSONResult.failure("不存在此用户信息");
			}
		}
	}
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @param tel
	 *  @return
	 *  @Date: 2019年3月17日下午4:19:54
	 */
	public JSONResult updateUserInfo(String sno, String tel) {
		if(StringUtils.hasLength(sno)&&StringUtils.hasLength(tel)){
			userDao.updateUserInfo(sno,tel);
			return JSONResult.success();
		}
		return JSONResult.failure("信息为空");
	}
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @param originPwd
	 *  @return
	 *  @Date: 2019年3月17日下午5:17:26
	 */
	public boolean validatePwd(String sno, String originPwd) {
		if(StringUtils.hasLength(sno)&&StringUtils.hasLength(originPwd)){
			boolean flag=userDao.validatePwd(sno,  originPwd);
			return flag;
		}
		return false;
	}
	
	/**
	 * 更新密码
	 */
	public JSONResult updatePwd(String sno,String originPwd,String newPwd){
		boolean flag=userDao.updatePwd(sno, originPwd, newPwd);
		if(flag){
			return JSONResult.success();
		}else{
			return JSONResult.failure("更新失败");
		}
	}
	
	/**
	 * 
	 *  @Discription: 通过学号找寻入学年份
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @return
	 *  @Date: 2019年3月24日下午10:19:47
	 */
	public int  findGrade(String sno){
		int grade=userDao.findGrade(sno);
		return grade;
	}
	
	
}
