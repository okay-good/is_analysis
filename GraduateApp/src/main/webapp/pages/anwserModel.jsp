<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./commonHeader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>问题答疑</title>
<style type="text/css">
	.overBgc{
		background-color: #68838B;
	}
	.default-show{
		display: block !important;
	}
	.default-hide{
		display: none !important;
	}
	span.anwser-title-datetime,span.anwser-title-marksize{
		margin-left: 30px;
	}
</style>
</head>
<body>
<div class="layui-container default-show">
	<ul class="layui-timeline">
	  <li class="layui-timeline-item">
	    <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
	    <div class="layui-timeline-content layui-text">
	      <h3 class="layui-timeline-title">
	      	<span class="anwser-title anwser-title-name">苏落</span>
	      	<span class="anwser-title anwser-title-datetime">2019-02-21 21:31:52</span>
	      	<span class="anwser-title anwser-title-marksize"><i class="layui-icon layui-icon-notice" style="font-size: 20px;color:#8968CD;"></i>32</span>
	      </h3>
	      <div class="content">
	      	<p>
		        layui 2.0 的一切准备工作似乎都已到位。发布之弦，一触即发。
		        <br>不枉近百个日日夜夜与之为伴。因小而大，因弱而强。
		        <br>无论它能走多远，抑或如何支撑？至少我曾倾注全心，无怨无悔 <i class="layui-icon layui-icon-dialogue" style="font-size: 25px;color:#8968CD;"></i>
		      </p>
	      </div>
	      
	    </div>
	  </li>
	  <li class="layui-timeline-item">
	    <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
	    <div class="layui-timeline-content layui-text">
	      <h3 class="layui-timeline-title">2019-02-11 21:41:52</h3>
	      <p>
	        layui 2.0 的一切准备工作似乎都已到位。发布之弦，一触即发。
	        <br>不枉近百个日日夜夜与之为伴。因小而大，因弱而强。
	        <br>无论它能走多远，抑或如何支撑？至少我曾倾注全心，无怨无悔 <i class="layui-icon layui-icon-dialogue" style="font-size: 25px;color:#8968CD;"></i>
	      </p>
	    </div>
	  </li>
	  <li class="layui-timeline-item">
	    <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
	    <div class="layui-timeline-content layui-text">
	      <h3 class="layui-timeline-title">2019-02-01 11:41:52</h3>
	      <p>
	        layui 2.0 的一切准备工作似乎都已到位。发布之弦，一触即发。
	        <br>不枉近百个日日夜夜与之为伴。因小而大，因弱而强。
	        <br>无论它能走多远，抑或如何支撑？至少我曾倾注全心，无怨无悔 <i class="layui-icon layui-icon-dialogue" style="font-size: 25px;color:#8968CD;"></i>
	      </p>
	    </div>
	  </li>
	  <li class="layui-timeline-item">
	    <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
	    <div class="layui-timeline-content layui-text">
	      <h3 class="layui-timeline-title">2019-02-21 21:31:52</h3>
	      <p>杜甫的思想核心是儒家的仁政思想，他有“<em>致君尧舜上，再使风俗淳</em>”的宏伟抱负。个人最爱的名篇有：</p>
	      <ul>
	        <li>《登高》</li>
	        <li>《茅屋为秋风所破歌》</li>
	      </ul><i class="layui-icon layui-icon-dialogue" style="font-size: 25px;color:#8968CD;"></i>
	    </div>
	  </li>
	  <li class="layui-timeline-item">
	    <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
	    <div class="layui-timeline-content layui-text">
	      <h3 class="layui-timeline-title">2019-02-14 21:31:52</h3>
	      <p>
	        中国人民抗日战争胜利72周年
	        <br>常常在想，尽管对这个国家有这样那样的抱怨，但我们的确生在了最好的时代
	        <br>铭记、感恩
	        <br>所有为中华民族浴血奋战的英雄将士
	        <br>永垂不朽
	      </p><i class="layui-icon layui-icon-dialogue" style="font-size: 25px;color:#8968CD;"></i>
	    </div>
	  </li>
	  <li class="layui-timeline-item">
	    <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
	    <div class="layui-timeline-content layui-text">
	      <div class="layui-timeline-title">2019-02-21 21:31:52</div>
	    </div>
	  </li>
	</ul>
</div>



<div class="layui-container default-hide">
	<!--  回退部分-->
	<div class="layui-row" style="background-color: #2B2B2B;cursor:pointer;" id="back">
		&nbsp;&nbsp;&nbsp;&nbsp;<i class="layui-icon-prev layui-icon" style="color:#87CEFA; font-size: 30px;"></i>
	</div>
	<!-- 问题主题内容 -->
	<div class="layui-row">
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 50px;">
		  <legend>手风琴折叠</legend>
		</fieldset>
		<div class="layui-collapse" lay-accordion="">
		  <div class="layui-colla-item">
		    <h2 class="layui-colla-title">layui 更适合哪些开发者？</h2>
		    <div class="layui-colla-content layui-show">
		      <p>在前端技术快速变革的今天，layui 仍然坚持语义化的组织模式，甚至于模块理念都是采用类AMD组织形式，并非是有意与时代背道而驰。layui 认为以jQuery为核心的开发方式还没有到完全消亡的时候，而早期市面上基于jQuery的UI都普通做得差强人意，所以需要有一个新的UI去重新为这一领域注入活力，并采用一些更科学的架构方式。
		      <br>
		      因此准确地说，layui 更多是面向那些追求开发简单的前端工程师们，以及所有层次的服务端程序员。</p>
		    </div>
		  </div>
		</div>
	</div>
	<!-- 评论信息列表 -->
	<div class="infos" id="anwserInfo-list">
		<!-- 某一个的评论信息和评论的评论信息 -->
		<div class="layui-row" style="margin-top: 5px;">
			<!--直接评论的信息  -->
			<div class="layui-row layui-elem-field" style="background-color: #EEE9BF;margin-bottom: 0px !important;">
				<div style="margin-top: 5px;"><!-- 头部信息 -->
					<span style="font-weight: bolder; font-size: 14px;margin-left: 20px;">欢沁</span>
					<span style="color: grey;margin-left: 60px;">2019-03-01 12:25:36</span>
					<span style="margin-left: 700px;" name="苏薇薇" class="reply">
						<i class="layui-icon-edit layui-icon " 
						style="color:#87CEFA; font-size: 20px;" ></i>
					</span>
				</div>
				<hr class="layui-bg-gray">
				<div  style="padding: 7px;">所以需要有一个新的UI去重新为这一领域注入活力，并采用一些更科学的架构方式。 
因此准确地说，layui 更多是面向那些追求开发简单的前端工程师们，以及所有层次的服务端程序员</div>				
			</div>
			<!-- 该评论下的评论信息 -->
			<div class="childrens-infos">
				<div class="layui-row layui-elem-field" style=" background-color: #CDAA7D;padding-left: 20px;margin-bottom: 0px !important;">
					<div><!-- 头部信息 -->
						<span style="font-weight: bolder; font-size: 14px;margin-left: 20px;">苏薇薇->欢沁</span>
						<span style="color: grey;margin-left: 60px;">2019-03-01 12:25:36</span>
						<span style="margin-left: 700px;" name="苏薇薇" class="reply">
							<i class="layui-icon-edit layui-icon " 
							style="color:#87CEFA; font-size: 20px;" ></i>
						</span>
					</div>
					<hr class="layui-bg-gray">
					<div  style="padding: 7px;">所以需要有一个新的UI去重新为这一领域注入活力，并采用一些更科学的架构方式。 
	因此准确地说，layui 更多是面向那些追求开发简单的前端工程师们，以及所有层次的服务端程序员</div>				
				</div>
			</div>
		</div>
		
		
		
	</div>
		
	<!-- 回复表单 -->
	<div class="layui-row" style="width: 1140px;">
		<form class="layui-form layui-form-pane" action="">
		  <div class="layui-form-item" style="margin-bottom: 0px !important;">

		    <label class="layui-form-label">被回复人:</label>
		    <div class="layui-input-inline">
		      <input type="text" name="replyedUsername" readonly="readonly" style="width:400px !important;"  lay-verify="required" placeholder="待选择" autocomplete="off" class="layui-input">
		    </div>
		    
		    <!-- <label class="layui-form-label" style="margin-left: 10px;">回复人:</label>
		    <div class="layui-input-inline">
		      <input type="text" name="username" readonly="readonly" style="width:400px !important;"  lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
		    </div> -->
		    
		  </div>
		  
		<textarea id="markAndReply" name="markAndReply" 
		class="layui-textarea fly-editor"></textarea>
		<div class="layui-btn-group">
			<button class="layui-btn layui-btn-radius" style="background-color: grey;" id="clear">清除</button>
			<button class="layui-btn layui-btn-radius layui-btn-normal" id="submit">提交</button>
		</div>
	</div>
	</div>
	



<!-- js -->
<script type="text/javascript">
/**
 * 判断是否有值
 */
function hasLength(value){
	if(value&&value!=null&&$.trim(value).length>0){
		let flag=false;
		let arr=value.split('&nbsp;')
		for(let obj of arr){
			if(obj.trim().length>0){
				flag=true;
			}
		}
		return flag;
	}else{
		return false;
	}
}

$(function(){
	
	/**
	右下角固定
*/
var bottomBar=util.fixbar({
    bar1: '&#xe608;',
    bgcolor:"#C9C9C9",
    css: {right: 40, bottom: 100},
    click: function(type){
      if(type === 'bar1'){
        $.post("http://www.cassso.com/openQuestion",{},function(htmlStr){
        	var openQuestionIndex=layer.open({
	        	id:"questionOpenId",
	        	type:1,
	        	title:"问题发布",
	        	content:htmlStr,
	        	skin:"layui-layer-molv",
	        	area: ['700px', '500px'],
	        	offset: 'auto',//垂直水平居中
	        	btn:["取消","确定"],
	        	yes:function(){//按钮一的回调函数
	        		layer.close(openQuestionIndex);
	        	},
	        	btn2:function(){//按钮二的回调函数
	        	},
	        	anim: 6
	        });
        })
      }
    }
  });
	
	$("li.layui-timeline-item").on("mouseover",function(){
		$("li.layui-timeline-item").removeClass("overBgc")
		$(this).addClass("overBgc");
	})
	
	$("li.layui-timeline-item").on("click",function(){
		$("ul.layui-fixbar").css("display","none")//隐藏
		$("div.layui-container").eq(0).removeClass("default-show").addClass("default-hide");
		$("div.layui-container").eq(1).removeClass("default-hide").addClass("default-show");
	})
	
	$("#back").on("click",function(){
		$("ul.layui-fixbar").css("display","block")//显示
		$("div.layui-container").eq(1).removeClass("default-show").addClass("default-hide");
		$("div.layui-container").eq(0).removeClass("default-hide").addClass("default-show");
	})
	
	
	//富文本编辑
	var richContent=null;
	var flag=0;
	var richTool =layedit.build('markAndReply',{
		tool: [
			  'strong' //加粗
			  ,'italic' //斜体
			  ,'underline' //下划线
			  ,'del' //删除线
			  
			  ,'|' //分割线
			  
			  ,'left' //左对齐
			  ,'center' //居中对齐
			  ,'right' //右对齐
			  ,'|' //分割线
			  ,'link' //超链接
			  ,'unlink' //清除链接
			  ,'face' //表情
			],
		height:200,
		uploadImage: {url: baseUrl+'/file/richTextImageUpload', type: 'post'}
	});
	
	$("#submit").on("click",function(){
		richContent=layedit.getContent(richTool)
		if(hasLength(richContent)){
			console.log("提交中..."+richContent)
			$("#temp").append(richContent)
		}else{
			console.log("内容为空不能提交")
		}
		
	});
	
	/* $("iframe").contents().find("body").blur(function(){
		richContent=layedit.getContent(richTool)
		
	}); */
	
	
	$("span.reply").on("click",function(){
		console.log("名字: "+$(this).attr("name"));
		$("input[name='replyedUsername']").val($(this).attr("name"))
	})
	
	
});

</script>
</body>
</html>