package com.graduate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graduate.service.UserServiceImpl;
import com.graduate.utils.JSONResult;

/**
 * 
 * @Discription: TODO    
 * @Author: JiangChunLin  
 * @ClassName: UserController  
 * @Date: 2019年3月17日 下午3:58:30  
 * @Version: 1.0.0 Graduate
 */
@RestController
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @return
	 *  @Date: 2019年3月17日下午4:15:55
	 */
	@RequestMapping(value="/findStudentUserInfo")
	public JSONResult findStudentUserInfo(String sno){
		return userServiceImpl.findStudentUserInfo(sno);
	}
	
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @param tel
	 *  @return
	 *  @Date: 2019年3月17日下午5:05:42
	 */
	@RequestMapping(value="/updateUserInfo")
	public JSONResult updateUserInfo(String sno,String tel){
		System.out.println(sno+"   "+tel);
		return userServiceImpl.updateUserInfo(sno,tel);
	}
	
	/**
	 * 
	 */
	@RequestMapping(value="/validatePwd")
	public boolean validatePwd(String sno,String originPwd){
		System.out.println(sno+"   "+originPwd);
		boolean flag=userServiceImpl.validatePwd( sno, originPwd);
		return flag;
	}
	/**
	 * 
	 *  @Discription: TODO
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @param originPwd
	 *  @param newPwd
	 *  @return
	 *  @Date: 2019年3月24日下午10:20:37
	 */
	@RequestMapping(value="/updatePwd")
	public JSONResult updatePwd(String sno,String originPwd,String newPwd){
		return userServiceImpl.updatePwd(sno, originPwd, newPwd);
	}
	
	
	/**
	 * 
	 *  @Discription: 通过学号查找入学年份
	 *  @Author: JiangChunLin
	 *  @param sno
	 *  @return
	 *  @Date: 2019年3月24日下午10:22:46
	 */
	@RequestMapping(value="findGrade")
	public JSONResult findGrade(String sno){
		int grade=userServiceImpl.findGrade(sno);
		if(grade!=-1){
			return JSONResult.success(grade);
		}else{
			return JSONResult.failure("数据查询异常");
		}
	}
	
}
