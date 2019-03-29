<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./commonHeader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件信息</title>
<style type="text/css">
	div.video{
		border: 1px solid red;
	}
</style>
</head>
<body>
<div class="layui-container" style="margin: 0 !important">
	<div class="layui-tab layui-tab-brief layui-tab-card" style="width: 1250px !important;">
	  <ul class="layui-tab-title">
	    <li class="layui-this">课程文件</li>
	    <li>教学视频</li>
	  </ul>
	  <div class="layui-tab-content" style="height: 700px;">
	    <div class="layui-tab-item layui-show">
	    	<table id="fileInfo" lay-filter="fileInfo"></table>
	    </div>
	    <div class="layui-tab-item">
	    	<div class="layui-row layui-col-space22" style="padding-left: 10px;padding-top: 10px;">
	    		<div class="layui-col-md2" style="box-shadow: 3px 3px 1px 1px #474747;margin-top: 20px !important;">
	    			<div class="layui-row">
			    		<form class="layui-form" action="">
						  <div class="layui-form-item" >
						    <div class="layui-input-block" style="margin-left: auto;">
						      <input type="text" name="title" style="border-radius: 20px;" required  lay-verify="required" placeholder="搜索" autocomplete="off" class="layui-input">
						    </div>
						  </div>
						 </form>
			    	</div>
	    			<fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
					  <legend><i class="layui-icon layui-icon-app" style="font-weight: bold;font-size: 12px !important;"></i>&nbsp;&nbsp;视频播放列表</legend>
					</fieldset>
					<div class="layui-collapse" lay-filter="videMenu">
					  <div class="layui-colla-item">
					    <h2 class="layui-colla-title">为什么JS社区大量采用未发布或者未广泛支持的语言特性？</h2>
					    <div class="layui-colla-content">
					      <p>有不少其他答案说是因为JS太差。</p>
					    </div>
					  </div>
					  <div class="layui-colla-item">
					    <h2 class="layui-colla-title">为什么前端工程师多不愿意用 Bootstrap 框架？</h2>
					    <div class="layui-colla-content">
					      <p>因为不适合。如果希望开发长期的项目或者制作产品类网站</p>
					    </div>
					  </div>
					  <div class="layui-colla-item">
					    <h2 class="layui-colla-title">layui 更适合哪些开发者？</h2>
					    <div class="layui-colla-content">
					      <p>在前端技术快速变革的今天，layui 仍然坚持语义化的组织模式，甚至于模块理念都是采用类AMD组织形式，并非是有意与时代背道而驰。
					      <br><br>
					      因此准确地说，layui 更多是面向那些追求开发简单的前端工程师们，以及所有层次的服务端程序员。</p>
					    </div>
					  </div>
					  <div class="layui-colla-item">
					    <h2 class="layui-colla-title">贤心是男是女</h2>
					    <div class="layui-colla-content">
					      <p>man！ 所以这个问题不要再出现了。。。</p>
					    </div>
					  </div>
					</div>
	    		</div>
	    		<div class="layui-col-md10">
	    			<section class="layui-card">
		                <div class="layui-card-body">
		                    <div class="video" id="video" data-url="./file/video/爱笑的眼睛.mp4" style="width: 100%;height: 500px;"></div>
		                </div>
		            </section>
	    		</div>
	    	</div>
	    </div>
	    	
	  </div>
	</div>
</div>	


<script type="text/html" id="toolBar">
  <a class="layui-btn layui-btn-xs" lay-event="edit">修改</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del"><i class="layui-icon">&#xe640;</i></a>
  <a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="download">下载</a>
</script>
<script type="text/javascript">
layui.config({
    base: '../lib/'
}).extend({
    ckplayer: 'ckplayer/ckplayer'
}).use(['jquery', 'ckplayer'], function() {
    var $ = layui.$,
        ckplayer = layui.ckplayer;
    var vUrl = $('#video').data('url'),
    
    	videoObject = {
        container: '#video',
        loop: true,
        autoplay: false,
        video: [
            [vUrl, 'video/mp4']
        ]
    };
    console.log("视频地址: "+vUrl)
    var player = new ckplayer(videoObject);
    
  //动态切换播放的视频
	$("div.layui-colla-item").on("click",function(){
		vUrl="http://img.ksbbs.com/asset/Mon_1703/05cacb4e02f9d9e.mp4";
		videoObject = {
		        container: '#video',
		        loop: true,
		        autoplay: true,
		        video: [
		            [vUrl, 'video/mp4']
		        ]
		    };
		    player = new ckplayer(videoObject);
	});
    
});
	$(function(){
		let tableWidth=$("div.layui-tab-card").css("width");
		//第一个实例
		  var infoTable=table.render({
		    elem: '#fileInfo',
		    id:"fileInfo",
		    text:{
		    	none:"--暂无相关数据--"
		    },
		    height: 400,
		    url: baseUrl+'/fileInfoQuery', //数据接口
		    page: true, //开启分页
		    toolbar:true,
		    even:true,
		    limit:10,//必须在limits中存在
		    limits:[10,20,50,100],
		    loading:true,
		    title:"文件信息",
		    cols: [[ //表头
		      {field: 'id', title: '序号',  sort: true, fixed: 'left'}
		      ,{field: 'fileDesc', title: '文件', }
		      ,{field: 'belongCourse', title: '所属课程'}
		      ,{field: 'uploadAuthor', title: '作者', sort: true}
		      ,{field: 'uploadTime', title: '上传时间', sort: true}
		      ,{field: 'downloadNumber', title: '下载次数'} 
		      ,{fixed: 'right', title:'操作', toolbar: '#toolBar'}
		    ]],
		    request:{
		    	pageName:"pageNo",
		    	limitName:"size"
		    }
		  });
		
		
		
	})
</script>
</body>
</html>