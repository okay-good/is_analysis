<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./commonHeader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生出勤信息</title>
</head>
<body>
<div class="layui-container">
	<!-- 表单行 -->
	<div class="layui-row">
		<form action="" class="layui-form">
			<div class="layui-form-item">
				<div class="layui-inline">
				    <label class="layui-form-label">班级:</label>
				    <div class="layui-input-inline" style="width: 150px;">
				      <select name="quiz">
          				<option value="">--请选择班级--</option>
          				<option value="">软件工程三班</option>
          				<option value="">软件工程四班</option>
          				<option value="">数媒一班</option>
          				<option value="">数媒二班</option>
          			  </select>
				    </div>
				</div>
				
				<div class="layui-inline">
					<label class="layui-form-label">开始时间:</label>
				    <div class="layui-input-inline" style="width: 150px;">
				       <input type="text" name="dateFrom" id="dateFrom" lay-verify="date" 
				       placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input">
				    </div>
				</div>
				
				<div class="layui-inline">
					<label class="layui-form-label">结束时间:</label>
				    <div class="layui-input-inline" style="width: 150px;">
				      <input type="text" name="dateTo" id="dateTo" lay-verify="date" 
				       placeholder="YYYY-MM-DD" autocomplete="off" class="layui-input">
				    </div>
				</div>
				
				<div class="layui-inline">
					<button class="layui-btn" lay-submit="" lay-filter="queryBtn">查询</button>
				</div>
			</div>
		</form>
	</div>
	<!-- 图表结果显示 -->
	<div class="layui-row">
		<div class="layui-col-md5 layui-col-md-offset1">
			<div class="echarts" id="demo" style="width: 400px; height: 300px;"></div>
		</div>
		<div class="layui-col-md5 layui-col-md-offset1">
			<div class="echarts" id="demo1" style="width: 400px; height: 300px;"></div>
		</div>
	</div>
	<div class="layui-row">
		<div class="layui-col-md5 layui-col-md-offset1">
			<div class="echarts" id="demo2" style="width: 400px; height: 300px;"></div>
		</div>
		<div class="layui-col-md5 layui-col-md-offset1">
			<div class="echarts" id="demo3" style="width: 400px; height: 300px;"></div>
		</div>
	</div>
</div>	

<!-- js -->
<script type="text/javascript">
	$(function(){
		laydate.render({
			elem:"#dateFrom",
			type:"date",
			range:false,
			btns: ['now', 'confirm']
		})
		
		laydate.render({
			elem:"#dateTo",
			value:new Date(),//默认值
			calendar: true,
			btns: ['now', 'confirm'],
			done:function(value, date, endDate){
				//value日期值  date日期对象 ,range存在的时候的endDate对象
			}
		})
		
		// 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('demo'));
        var myChart1 = echarts.init(document.getElementById('demo1'));
        var myChart2 = echarts.init(document.getElementById('demo2'));
        var myChart3 = echarts.init(document.getElementById('demo3'));
        // 指定图表的配置项和数据
        var option = {
            title: {
                text: 'ECharts 入门示例'
            },
            tooltip: {},
            legend: {
                data:['销量']
            },
            xAxis: {
                data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
            },
            yAxis: {},
            series: [{
                name: '销量',
                type: 'bar',
                data: [5, 20, 36, 10, 10, 20]
            }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);//双柱状图:个人缺勤次数(只统计缺勤了的，同比)
        myChart1.setOption(option);//饼图:缺勤次数达到三次、两次、一次、无的总人数(点进去弹框显示具体的人员信息)
        myChart2.setOption(option);//曲线图:截止目前每周缺勤人数的变化曲线图
        myChart3.setOption(option);//表格: 本周的缺勤人信息表格
	})
</script>
</body>
</html>