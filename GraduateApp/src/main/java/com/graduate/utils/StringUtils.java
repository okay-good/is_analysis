package com.graduate.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 
 * @Discription: 字符串处理工具类    
 * @Author: JiangChunLin  
 * @ClassName: StringUtils  
 * @Date: 2019年2月15日 上午10:16:43  
 * @Version: 1.0.0 Graduate
 */
public class StringUtils {
	/**
	 * 
	 *  @Discription: 产生指定长度的随机字符串
	 *  @Author: JiangChunLin
	 *  @param len
	 *  @return
	 *  @Date: 2019年3月24日下午5:13:27
	 */
	public static  String uuid(int len){
		String uuid=UUID.randomUUID().toString().replaceAll("-", "");
		if(len<=0){
			return uuid.substring(0, 32);
		}else{
			return uuid.substring(0, len);
		}
	}
	/**
	 * 
	 *  @Discription: 将时间值转化为对应格式的字符串值
	 *  @Author: JiangChunLin
	 *  @param date
	 *  @return
	 *  @Date: 2019年3月24日下午5:13:47
	 */
	public static String dateToYMDHMS(Date date){
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result=simpleDateFormat.format(date);
		return result;
	}
	
	/**
	 * 
	 *  @Discription: 通过大几和学期查询对应的年份值
	 *  @Author: JiangChunLin
	 *  @param grade
	 *  @param univerth
	 *  @param term
	 *  @return
	 *  @Date: 2019年3月24日下午5:15:42
	 */
	public static int findYearFromUniverth(int grade,int univerth,int term){
		if(term==1){
			return grade+(univerth-1);
		}else{
			return grade+(univerth);
		}
	}
	
	
}
