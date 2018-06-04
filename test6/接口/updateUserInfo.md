# 接口:updateUserInfo <a href="https://github.com/FateBerserker/is_analysis/tree/master/test6">返回</a>
### 用例:<a href="../用例/个人信息修改.md">个人信息修改</a>

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;功能:修改个人的基本用户信息
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;权限:学生、教师
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;API请求地址:http://entomb/testmanagersystem/updateUserInfo
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求方式:POST
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求实例:
	    {
			"account":"201510414406",
			"name":"李建军",
			"sex":"女",
			"age":22,
			"role":"学生"
	    }	
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求参数说明:
<table cellspacing="0" style="width:600px;">
<tr>
	<td>参数名称</td>
	<td>说明</td>
</tr>
<tr>
	<td>account</td>
	<td>学生的账号</td>
</tr>
<tr>
	<td>name</td>
	<td>新名字</td>
</tr>
<tr>
	<td>sex</td>
	<td>新性别</td>
</tr>
<tr>
	<td>age</td>
	<td>新年龄</td>
</tr>
<tr>
	<td>role</td>
	<td>用户的角色，老师或者学生</td>
</tr>
</table>
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;返回实例:

	    {
		"data":{
			"account":"201510414406",
			"name":"李建军",
			"sex":"女",
			"age":22,
			"role":"学生"
				},
		"status":"success",
		"msg":"个人信息修改成功!"
		}

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;返回参数说明:
<table cellspacing="0" style="width:600px;">
<tr>
	<td>参数名称</td>
	<td>说明</td>
</tr>
<tr>
	<td>account</td>
	<td>账号</td>
</tr>
<tr>
	<td>name</td>
	<td>姓名</td>
</tr>
<tr>
	<td>sex</td>
	<td>性别</td>
</tr>
<tr>
	<td>age</td>
	<td>年龄</td>
</tr>
<tr>
	<td>role</td>
	<td>学生</td>
</tr>
<tr>
	<td>status</td>
	<td>操作的成功与否,<br>
	success表示操作正常执行没有发生异常错误</td>
</tr>
<tr>
	<td>msg</td>
	<td>提示个人信息修改成功</td>
</tr>
</table>