# 接口:queryStudentList <a href="https://github.com/FateBerserker/is_analysis/tree/master/test6">返回</a>
### 用例:<a href="../用例/学生信息列表查询.md">学生信息列表查询</a>

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;功能:查询学生信息列表
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;权限:教师
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;API请求地址:http://entomb/testmanagersystem/queryStudentList
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求方式:POST
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求实例:
	    {
			"courseId":"201510414406",
			"teacherId":"1005",
			"startTime":"2015-02-12"
	    }	
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求参数说明:
<table cellspacing="0" style="width:600px;">
<tr>
	<td>参数名称</td>
	<td>说明</td>
</tr>
<tr>
	<td>courseId</td>
	<td>课程的Id值</td>
</tr>
<tr>
	<td>teacherId</td>
	<td>教师的Id值</td>
</tr>
<tr>
	<td>startTime</td>
	<td>开始上课时间</td>
</tr>
</table>
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;返回实例:
    {
		"data":[
				{
				"studentNo":"201510414406",
				 "courseName":"JavaEE高级开发",
				 "name":"张三"
				},
				{
				 "studentNo":"201510414400",
				 "courseName":"JavaEE高级开发",
				 "name":"鹿鹿"
				},
				...
			   ],
		"status":"success",
		"msg":"学生信息列表查询成功!"
	}
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;返回参数说明:
<table cellspacing="0" style="width:600px;">
<tr>
	<td>参数名称</td>
	<td>说明</td>
</tr>
<tr>
	<td>studentNo</td>
	<td>学生的学号</td>
</tr>
<tr>
	<td>courseName</td>
	<td>课程的名字</td>
</tr>
<tr>
	<td>name</td>
	<td>学生的名字</td>
</tr>
<tr>
	<td>status</td>
	<td>操作的成功与否,<br>
	success表示操作正常执行没有发生异常错误，<br>
	fail则表示有错误发生</td>
</tr>
<tr>
	<td>msg</td>
	<td>提示信息，以便与用户更好的交互</td>
</tr>
</table>