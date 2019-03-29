<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./commonHeader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
<style type="text/css">
	body{
		background:  url(./image/loginBgp.jpg) no-repeat fixed top;
	}
	div.layui-container{
		width: 700px;
		height: 400px;
		margin-right: 100px;
		margin-top: 170px;
		background-color: #FCFCFC;
		opacity: 1;
		padding: 20px;
	}
	img{
		width: 300px;
		height: 300px;
		margin-top: 30px;
	}
	div#form{
		margin-top: 20px;
	}
</style>
</head>
<body>
 <div class="layui-container">  
	  <div class="layui-row layui-col-space30">
	    <div class="layui-col-md6">
	    	<img alt="mini" src="./image/mini.jpg"/>
	    </div>
	    <div class="layui-col-md6" id="form">
	      <div class="layui-card">
			  <div class="layui-card-header" style="color: #8968CD;font-weight: bolder;">用户登录</div>
			  <div class="layui-card-body">
			  	<form class="layui-form" action="">
				  <div class="layui-form-item">
				    <div class="layui-input-block" style="margin-left:0px;">
				      <i class="layui-icon layui-icon-username" style="font-size: 20px;"></i>
				      <input type="text" name="account" required  lay-verify="required" placeholder="请输入账号" autocomplete="off" class="layui-input">
				    </div>
				  </div>
				  <div class="layui-form-item ">
				  	<i class="layui-icon layui-icon-find-fill" style="font-size: 20px;"></i>
				    <div class="layui-input-block" style="margin-left:0px;">
				      <input type="password" name="password" required  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
				    </div>
				  </div>
				  <div class="layui-form-item">
				    <div class="layui-input-block" style="margin-left: 0;">
				    	<input type="radio" name="role" value="0" title="教师" >
      					<input type="radio" name="role" value="1" title="学生" checked>
				    </div>
				  </div>
				  <!-- 隐藏域 -->
				  <input type="hidden" name="type" value="0">
				  <div class="layui-form-item">
				    <div class="layui-input-block" style="margin-left:70px;">
				      <button class="layui-btn" lay-submit lay-filter="login">登录</button>
				      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
				    </div>
				  </div>
				</form>
			  </div>
			</div>
	   </div>
 </div>



	
<!-- layjs部分 -->
<script type="text/javascript">
$(function(){
	form.render();
	//表单提交
		form.on('submit(login)', function(data){
			  $.ajax({
				  url:baseUrl+"/login",
				  type:"post",
				  data:data.field,
				  dataType:'json',
				  success:function(result){
					  
					  window.location.href="${pageContext.request.contextPath}/toHome";
				  },
				  error:function(result){
					  layer.open({content: '登录信息错误!'
						});
				  }
			  })
			  return false;
			});
})
</script>
</body>
</html>