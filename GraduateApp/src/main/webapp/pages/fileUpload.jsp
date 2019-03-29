<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./commonHeader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="../layui/lay/modules/upload.js"></script>
<title>课程文件上传</title>
<style type="text/css">
	div.layui-circle{
		width:300px;
		height:300px;
		background-size: cover;
	}
	div.video{
		 background: url('../image/video.png')  no-repeat center 50% ;
	}
	div.office{
		background-color:white;
		background: url('../image/officeFile.png')  no-repeat center 50% ;
	}
	button{
	width: 50%;
	margin-left: auto;
	}
	div.layui-btn-container{
		width: 400px;
		margin: auto;
	}
	div.lay-row{
		padding-top: 90px;
	}
	
	div.layui-col-md5{
		
	}
</style>
</head>
<body>
<div class="layui-fluid">
	<div class="lay-row">
		<div class="layui-col-md5 layui-col-md-offset1">
			<div class="layui-circle video"></div><br>
			<div class="layui-main" style="width: 200px;">
			<div class="layui-btn-container">
				<button type="button" class="layui-btn" id="video">
				  <i class="layui-icon">&#xe67c;</i>视频教学上传
				</button>
			</div>
			</div>
		</div>
		<div class="layui-col-md5 layui-col-md-offset1">
			<div class="layui-circle office"></div><br>
			<div class="layui-form">
			<div class="layui-form-item">
			    <div class="layui-input-block"  style="margin-left: 35px !important;">
			      <input type="radio" name="sex" value="nan" title="课件">
				  <input type="radio" name="sex" value="nv" title="作业" checked>
				  <input type="radio" name="sex" value="" title="试题">
				  <input type="radio" name="sex" value="nv" title="参考资料" >
				  <input type="radio" name="sex" value="" title="PDF书籍">
			    </div>
			  </div>
			 </div>
			 <div class="layui-btn-container">
				<button type="button" class="layui-btn" id="office">
				  <i class="layui-icon layui-icon-read"></i>Office文件上传
				</button>
			</div>
		</div>
	</div>
	<!-- 进度条部分 -->
	<div class="layui-row">
		<div class="layui-progress layui-progress-big layui-hide" lay-showPercent="true" lay-filter="progressBar">
		  <div class="layui-progress-bar layui-bg-blue" lay-percent="0%"></div>
		</div>
	</div>
</div>


<!-- js部分 -->
<script type="text/javascript">
$(function(){
	//执行实例
	  var uploadVideo = upload.render({
	    elem: '#video', //绑定元素
	    url: 'http://www.cassso.com/file/fileUpload', //上传接口
	    accept: 'video',
	    //acceptMime: 'audio/wav,audio/ogg,audio/mp4,video/webm,video/x-msvideo,audio/aac,application/octet-stream,flv-application/octet-stream',
	    exts:'flv|wmv|map4|ogg|avi',
	    number: 3,
	    multiple:true,//开启多选
	    done: function(res){
	      //上传完毕回调
	      console.log(res)
	    },
	    error: function(res){
	      //请求异常回调
	    },
	    before:function(res){
	    	updateUploadProgress(layer);
		  }
	  });
	  var uploadOffice = upload.render({
		    elem: '#office', //绑定元素
		    url: baseUrl+'/file/fileUpload', //上传接口
		    accept:'file',
		    multiple:true,//开启多选
		    number:9,//同时上传的文件个数
		    acceptMime:'text/csv,application/msword,application/pdf,application/vnd.ms-excel,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/mspowerpoint,application/vnd.openxmlformats-officedocument.presentationml.presentation',//限定文件类型
		    done: function(res){
		      //上传完毕回调
		      console.log(res)
		    },
		    error: function(res){
		      //请求异常回调
		      console.log(res)
		    },
		    before:function(){
		    	updateUploadProgress(layer);
		    },
		    choose:function(){
		    	
		    }
		  });
	  
	  
	  
	  
})
/**
 * 更新文件上传进度
 */
function updateUploadProgress(layer){
	$("div.layui-progress").removeClass("layui-hide").addClass("layui-show");
	uploadLayer=layer.open({
		  type:3,
		  shade: 0.4,
		  icon:1
		})
	progressFlag=setInterval(function(){
		  $.ajax({
			  url:baseUrl+'/file/fileUploadProgress',
			  type:'post',
			  success:function(res){
				  console.log("进度情况: "+JSON.stringify(res));
				  let readed=res.readedBytes;
				  let total=res.totalBytes;
				  if(readed<total){
					  let result=(readed/total)*100;
					element.progress("progressBar",result.toFixed(2)+"%");	  								  
					}else{
						element.progress("progressBar","100%");	
						$("div.layui-progress").removeClass("layui-show").addClass("layui-hide");
						clearInterval(progressFlag);
						layer.close(uploadLayer)
				  }
				}
		  })
	},250)
}
</script>
</body>
</html>