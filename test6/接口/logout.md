# 接口:logout <a href="https://github.com/FateBerserker/is_analysis/tree/master/test6">返回</a>
### 用例:<a href="../用例/登录.md">登出</a>

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;功能:登出该系统
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;权限:学生、教师
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;API请求地址:http://entomb/testmanagersystem/logout
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求方式:GET
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求实例:
	    {
			"account":"201510414406",
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
	<td>学生或者老师的账号,<br>学生的话账号则为学号，老师的话账号则为教师编号</td>
</tr>
<tr>
	<td>role</td>
	<td>用户的角色，老师或者学生</td>
</tr>
</table>

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;返回实例:

	    {
			"data":null,
			"status":"success",
			"msg":"登出成功!"
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