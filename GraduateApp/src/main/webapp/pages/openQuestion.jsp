<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./commonHeader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布问题表单布局</title>
</head>
<body>
	<div class="layui-container" style="width: 500px;">
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 5px;">
		  <legend>问题发布表单信息</legend>
		</fieldset>
		<form class="layui-form layui-form-pane" action="">
		  <input type="hidden" name="account"   value="201510414406" readonly="readonly">
		  <div class="layui-form-item">
		    <label class="layui-form-label">发布用户:</label>
		    <div class="layui-input-block">
		      <input type="text" name="username" autocomplete="off" placeholder="请输入标题" class="layui-input" value="苏落" readonly="readonly">
		    </div>
		  </div>
		  <div class="layui-form-item">

		    <label class="layui-form-label">分类</label>
		    <div class="layui-input-inline">
		      <select name="questionType">
		        <option value="">请选择类别</option>
		        <option value="0" selected="">作业问题</option>
		        <option value="1">知识点问题</option>
		        <option value="2">学习中的问题</option>
		        <option value="-1">其它</option>
		      </select>
		    </div>
		  </div>
		  <div class="layui-form-item">
		  	<label class="layui-form-label">标题</label>
		    <div class="layui-input-inline">
		      <input type="text" name="username" style="width:360px !important;"  lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
		    </div>
		  </div>
		  <div class="layui-form-item">
		    <label class="layui-form-label">具体内容:</label>
		    <div class="layui-row">
				<textarea id="questionContent" name="questionContent" 
				class="layui-textarea fly-editor"></textarea>
				<div class="layui-btn-group">
					<button class="layui-btn layui-btn-radius" style="background-color: grey;" id="clear">清除</button>
					<button class="layui-btn layui-btn-radius layui-btn-normal" id="submit">提交</button>
				</div>
			</div>
		  </div>
		  
		 </form>
	</div>
<script type="text/javascript">
	$(function(){
		//富文本编辑
		var richContent=null;
		var flag=0;
		var richTool =layedit.build('questionContent',{
			height:100,
			color:'grey'
		});
	})
</script>
</body>
</html>