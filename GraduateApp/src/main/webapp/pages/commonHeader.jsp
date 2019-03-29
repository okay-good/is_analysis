<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
<link rel="stylesheet" href="../layui/css/layui.css" media="all">
<script type="text/javascript" src="../layui/layui.all.js"></script>
<script type="text/javascript" src="../js/echarts.min.js"></script>
<title></title>
</head>
<body>

<script type="text/javascript">
	/* $(function(){
		layui.use(['layer', 'form','element','upload'], function(){
			  var layer = layui.layer;
			  var form = layui.form;
			  var element = layui.element;
			  var upload=layui.upload;
			});
	}) */
	;!function(){
		  //无需再执行layui.use()方法加载模块，直接使用即可
		  form = layui.form ,
		  layer = layui.layer ,
		  element = layui.element ,
		  table=layui.table ,
		  laydate = layui.laydate,
		  layedit = layui.layedit,
		  util = layui.util,
		  upload=layui.upload;
		  //全局地址前缀
		  baseUrl="http://www.cassso.com";
		  
		}();
	
</script>
</body>
</html>