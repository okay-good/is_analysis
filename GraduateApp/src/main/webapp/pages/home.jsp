<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<script type="text/javascript" src="../js/jquery-3.1.1.min.js"></script>
<link rel="stylesheet" href="../layui/css/layui.css" media="all">
<script type="text/javascript" src="../layui/layui.all.js"></script>
<title>首页</title>
<style type="text/css">
	div#content{
	}
</style>
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">考勤系统后台</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="">控制台</a></li>
      <li class="layui-nav-item"><a href="">商品管理</a></li>
      <li class="layui-nav-item"><a href="">用户</a></li>
      <li class="layui-nav-item">
        <a href="javascript:;">其它系统</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
          <dd><a href="">消息管理</a></dd>
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          	蒋春林
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">密码修改</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">登出</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="menu" lay-shrink="all" id="menu">
        <!-- <li class="layui-nav-item layui-nav-itemed">
          <a class="parentItem" href="javascript:void(0);">学生信息管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:void(0);" name="studentInfoQuery" class="url">上课学生信息查询</a></dd>
            <dd><a href="javascript:void(0);" name="studentScoreQueryInput" class="url">学生成绩查询/录入</a></dd>
            <dd><a href="javascript:void(0);" name="studentAttenceQuery" class="url">学生考勤查询</a></dd>
          </dl>
        </li> -->
        <li class="layui-nav-item"><a href="javascript:void(0);" name="studentInfoQuery" class="url">上课学生信息查询</a></li>
        <li class="layui-nav-item"><a href="javascript:void(0);" name="studentScoreQueryInput" class="url">学生成绩查询/录入</a></li>
        <li class="layui-nav-item"><a href="javascript:void(0);" name="studentAttenceQuery" class="url">学生考勤查询</a></li>
        <!-- <li class="layui-nav-item">
          <a href="javascript:;" class="parentItem">文件管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:void(0);" name="fileUpload" class="url">文件上传</a></dd>
            <dd><a href="javascript:void(0);" name="fileInfoQuery" class="url">文件查看</a></dd>
          </dl>
        </li> -->
        <li class="layui-nav-item"><a href="javascript:void(0);" name="fileUpload" class="url">文件上传</a></li>
        <li class="layui-nav-item"><a href="javascript:void(0);" name="fileInfoQuery" class="url">文件查看</a></li>
        <li class="layui-nav-item"><a href="javascript:void(0);" name="courseTableQuery" class="url">课表查询</a></li>
        <li class="layui-nav-item"><a href="javascript:void(0);" name="anwserModel" class="url">答疑板块</a></li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;" id="content"></div>
  </div>
  
  <div class="layui-footer" style="text-align: center;">
    <!-- 底部固定区域 -->
    考勤管理系统后台 copyright © jcl
  </div>
</div>
<!-- JS代码部分 -->
<script type="text/javascript">
layui.use('element', function(){
	  element = layui.element;
	  /* $("a.parentItem").closest("li.layui-nav-item").eq(0).addClass("layui-nav-itemed");
		
		$("li.layui-nav-item").on("click",function(){
			$(this).toggleClass("layui-nav-itemed");
			//$(this).addClass("layui-nav-itemed")
		}) */
		
		//$("#content").css("height",window.innerHeight);
		
		$("#content").load("./pages/studentScoreQueryInput.jsp")
		$("li a.url").on("click",function(){
			if($(this).attr("name")!='anwserModel'){
				$("ul.layui-fixbar").css("display","none")//隐藏
			}else{
				$("ul.layui-fixbar").css("display","block")//显示
			}
			$("#content").load("./"+"pages/"+$(this).attr("name")+".jsp");
		})
	});
	
</script>

</body>
</html>