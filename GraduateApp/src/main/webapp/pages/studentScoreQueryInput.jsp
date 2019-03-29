<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./commonHeader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成绩录入页面</title>
<style type="text/css">
	.asd{
		background-color: green;
	}
</style>
</head>
<body>
	<table id="scoreInput" lay-filter="scoreInput"></table>

<!-- js -->
<script type="text/html" id="rowOperationBar">
  <a class="layui-btn  layui-btn-xs" lay-event="rowSave"><i class='layui-icon layui-icon-ok'></i>保存</a>
</script>

<script type="text/html" id="tableOperationBar">
	<button class="layui-btn" lay-event='batchUpdate'><i class="layui-icon layui-icon-upload-drag" ></i>更新选中行</button>
</script>
<script type="text/javascript">
	$(function(){
		//第一个实例
		  var infoTable=table.render({
		    elem: '#scoreInput',
		    text:{
		    	none:"--暂无相关数据--"
		    },
		    height: 550,
		    url: baseUrl+'/scoreQuery', //数据接口
		    page: true, //开启分页
		    toolbar:'#tableOperationBar',
		    even:true,
		    limit:20,//必须在limits中存在
		    limits:[10,20,50,100,"all"],
		    loading:true,
		    title:"学生信息",
		    cols: [[ //表头
		      {type:'checkbox', fixed: 'left',LAY_CHECKED:false},
		      {field: 'id', title: 'ID',  sort: true, fixed: 'left'}
		      ,{field: 'name', title: '用户名', }
		      ,{field: 'sex', title: '性别', sort: true}
		      ,{field: 'age', title: '年龄',event:'updateAge',style:'cursor:pointer;background-color:#87CEEB;',edit:'text'} 
		      ,{field: 'major', title: '专业'}
		      ,{field: 'academic', title: '学院', sort: true}
		      ,{field: 'tel', title: '电话',  sort: true}
		      ,{field: 'className', title: '班级'}
		      ,{fixed: 'right', title:'操作', toolbar: '#rowOperationBar'}
		    ]],
		    request:{
		    	pageName:"pageNo",
		    	limitName:"size"
		    }
		  });
		
		//监听表格行的ToolBar中的事件
		table.on('tool(scoreInput)',function(obj){
			var currentRowData=obj.data;//当前行的数据
			console.log(currentRowData)
			var layEvent=obj.event;
			var currentRowDomObj=obj.tr;
			if(layEvent=='rowSave'){
				console.log("行保存")
			}
		});
		
		//监听ToolBar事件
		table.on('toolbar(scoreInput)',function(obj){
			var checkStatus = table.checkStatus(obj.config.id);
			console.log("进入"+  obj.event )
			if(obj.event=='batchUpdate'){
				var data = checkStatus.data;
		        console.log(JSON.stringify(data)+"   "+'选中了：'+ data.length + ' 个');
		        infoTable.reload({
		        	url: baseUrl+'/scoreQuery'
		        })
			}
		});
		
		
		//监听单元格的编辑
		table.on('edit(scoreInput)',function(obj){
			var value = obj.value, //得到修改后的值
		    data = obj.data, //得到所在行所有值
		    field = obj.field; //得到字段
		    console.log(obj)
		    layer.msg('[ID: '+ data.id +'] ' + field + ' 字段更改为：'+ value);
		})
		
		
	});
</script>
</body>
</html>