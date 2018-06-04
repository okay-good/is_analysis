# 接口:teacherSelectCourse <a href="https://github.com/FateBerserker/is_analysis/tree/master/test6">返回</a>
### 用例:<a href="../用例/教师选课.md">教师选课</a>

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;功能:登录进该系统
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;权限:访问者
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;API请求地址:http://entomb/testmanagersystem/login
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求方式:POST
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求实例:
	    {
			"account":"201510414406",
			"courseId":"1646465",
			"grade":2015,
			"academyId":154616
	    }	
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求参数说明:
<table cellspacing="0" style="width:600px;">
<tr>
	<td>参数名称</td>
	<td>说明</td>
</tr>
<tr>
	<td>account</td>
	<td>教师编号</td>
</tr>
<tr>
	<td>courseId</td>
	<td>课程的Id值</td>
</tr>
<tr>
	<td>grade</td>
	<td>授课学生的年级</td>
</tr>
<tr>
	<td>academyId</td>
	<td>授课的学院Id值</td>
</tr>
</table>

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;返回实例:

	    {
			"data":null,
			"status":"success",
			"msg":"选课成功!"
		}

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;返回参数说明:

<table cellspacing="0" style="width:600px;">
<tr>
	<td>参数名称</td>
	<td>说明</td>
</tr>
<tr>
	<td>data</td>
	<td>执行后返回的数据</td>
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