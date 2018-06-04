# 接口:queryScore <a href="https://github.com/FateBerserker/is_analysis/tree/master/test6">返回</a>
### 用例:<a href="../用例/成绩查询.md">成绩查询</a>

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;功能:查询实验成绩
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;权限:教师或者学生
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;API请求地址:http://entomb/testmanagersystem/queryScore
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求方式:POST
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求实例:
	    {
			"account":"201510414406",
			"courseId":"1002"
	    }	
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;请求参数说明:
<table cellspacing="0" style="width:600px;">
<tr>
	<td>参数名称</td>
	<td>说明</td>
</tr>
<tr>
	<td>account</td>
	<td>学生的账号,<br>学生的话账号则为学号</td>
</tr>
<tr>
	<td>courseId</td>
	<td>课程的Id值</td>
</tr>
</table>
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;返回实例:

	    {
		"data":[
				{
				"number:1,
				"score":90,
				"mark":"格式有一定的问题",
				"time":"2018-06-12 12:14:25"
				},
				{
				"number:2,
				"score":95,
				"mark":"还可以",
				"time":"2018-06-21 12:14:25"},
				{.....}
			   ],
		"status":"success",
		"msg":"查询成功!"
		}

### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;返回参数说明:
<table cellspacing="0" style="width:600px;">
<tr>
	<td>参数名称</td>
	<td>说明</td>
</tr>
<tr>
	<td>number</td>
	<td>第几次实验</td>
</tr>
<tr>
	<td>score</td>
	<td>实验得分</td>
</tr>
<tr>
	<td>mark</td>
	<td>评语</td>
</tr>
<tr>
	<td>time</td>
	<td>评分时间</td>
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