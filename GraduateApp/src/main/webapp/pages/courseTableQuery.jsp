<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="./commonHeader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=0">
<script type="text/javascript" src="../js/Timetables.min.js"></script>
<title>课程表页面</title>
<style type="text/css">
	#coursesTable {
            padding: 15px 10px;
        }

        .Courses-head {
            background-color: #edffff;
        }

        .Courses-head > div {
            text-align: center;
            font-size: 14px;
            line-height: 28px;
        }

        .left-hand-TextDom, .Courses-head {
            background-color: #f2f6f7;
        }

        .Courses-leftHand {
            background-color: #f2f6f7;
            font-size: 12px;
        }

        .Courses-leftHand .left-hand-index {
            color: #9c9c9c;
            margin-bottom: 4px !important;
        }

        .Courses-leftHand .left-hand-name {
            color: #666;
        }

        .Courses-leftHand p {
            text-align: center;
            font-weight: 900;
        }

        .Courses-head > div {
            border-left: none !important;
        }

        .Courses-leftHand > div {
            padding-top: 5px;
            border-bottom: 1px dashed rgb(219, 219, 219);
        }

        .Courses-leftHand > div:last-child {
            border-bottom: none !important;
        }

        .left-hand-TextDom, .Courses-head {
            border-bottom: 1px solid rgba(0, 0, 0, 0.1) !important;
        }

        .Courses-content > ul {
            border-bottom: 1px dashed rgb(219, 219, 219);
            box-sizing: border-box;
        }

        .Courses-content > ul:last-child {
            border-bottom: none !important;
        }

        .highlight-week {
            color: #02a9f5 !important;
        }

        .Courses-content li {
            text-align: center;
            color: #666666;
            font-size: 14px;
            line-height: 50px;
        }

        .Courses-content li span {
            padding: 6px 2px;
            box-sizing: border-box;
            line-height: 18px;
            border-radius: 4px;
            white-space: normal;
            word-break: break-all;
            cursor: pointer;
        }

        .grid-active {
            z-index: 9999;
        }

        .grid-active span {
            box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.2);
        }
</style>
</head>
<body>
	<div class="layui-container">
		<div class="layui-row">
			<div class="layui-col-md3 layui-col-md-offset4">
				<form action="" class="layui-form">
					<select name="weeks" lay-verify="required" id="weeks">
					</select>
				</form>
				<h3 style="text-align: center;">2019年03月&nbsp;&nbsp;&nbsp;&nbsp;
					<label>大三&nbsp;第二学期</label>
				</h3>
			</div>
		</div>
		
		<div class="layui-container">
			<div id="coursesTable"></div>
		</div>
		
	</div>


<!-- 绘制课程表 -->
<script type="text/javascript">
	$(function(){
		let nowDate=new Date();
		let nowMonth=nowDate.getMonth()+1;
		let weeksStr='<option value="0">--查看其它周--</option>'
		for(let i=1;i<21;i+=1){
			weeksStr+='<option value="'+i+'">第'+i+'周</option>';
		}
		$("#weeks").append(weeksStr);
		form.render('select');//动态增加表单后需要调用该方法来重新渲染表单
		
		/**
			课程表部分代码
		*/
		/**
			上课信息，合并的依据为课程名称相同,''代码间隔一个单元格
		*/
		var courseList = [
		    ['大学英语(Ⅳ)@10203', '大学英语(Ⅳ)@10203', '', '',  '', '毛概@14208', '毛概@14208', '', '', '', '选修','选修',''],
		    ['', '', '信号与系统@11302', '信号与系统@11302','', '模拟电子技术基础@16204', '模拟电子技术基础@16204', '', '', '', '', '', ''],
		    ['大学体育(Ⅳ)', '大学体育(Ⅳ)', '形势与政策(Ⅳ)@15208', '形势与政策(Ⅳ)@15208',  '', '电路、信号与系统实验', '电路、信号与系统实验', '', '','', '', ''],
		    ['', '', '', '','', '电装实习@11301', '电装实习@11301', '', '', '', '大学体育', '大学体育', ''],
		    ['', '', '数据结构与算法分析', '数据结构与算法分析', '',  '', '', '信号与系统', '信号与系统', '', '',''],
		  ];
		  var week = window.innerWidth > 360 ? courseHeader() :
		    ['一', '二', '三', '四', '五','六','日'];
		  var day = new Date().getDay();//获取今天为周几，方便突出显示表头
		  /**
		  	左侧的上课时间，第一个为对象值，第二项为要分类的长度,
		  	总的长度要和courseList的项数一致
		  */
		  var courseType = [
		    [{index: '1', name: '8:30'}, 1],
		    [{index: '2', name: '9:20'}, 1],
		    [{index: '3', name: '10:25'}, 1],
		    [{index: '4', name: '11:15'}, 1],
		    
		    [{index: '5', name: '午餐'}, 1],
		    
		    [{index: '6', name: '14:00'}, 1],
		    [{index: '7', name: '14:50'}, 1],
		    [{index: '8', name: '15:55'}, 1],
		    [{index: '9', name: '16:40'}, 1],
		    
		    [{index: '10', name: '晚餐'}, 1],
		    
		    [{index: '11', name: '晚一'}, 1],
		    [{index: '12', name: '晚二'}, 1],
		    [{index: '12', name: '晚三'}, 1],
		  ];
		  // 实例化(初始化课表)
		  var Timetable = new Timetables({
		    el: '#coursesTable',
		    timetables: courseList,
		    week: week,//表头
		    timetableType: courseType,
		    highlightWeek: day,
		    gridOnClick: function (e) {
		      alert(e.name + '  ' + e.week + ', 第' + e.index + '节课, 课长' + e.length + '节');
		      console.log(e);
		    },
		    styles: {
		      Gheight: 50  //Gheight 为表格内每一个单元格高度(number)单位为'px'
		      //leftHandWidth 为表格左侧日程分类样式宽带度(number)单位为'px'
		      /**palette 为合并相同课程单元格后颜色调色盘,默认有15种颜色,
		      	可以传入颜色数组自定义(传入的颜色会与默认颜色合并,并优先使用自定义颜色)，
		      	设为false时不为课程单元格生成色盘颜色
		      */
		      
		    }
		  });
			
		  //切换课表
		  function onChange() {
		    var courseListOther = [
		      ['', '', '', '', '毛概@14208', '毛概@14208', '', '', '', '选修', '', ''],
		      ['大学英语(Ⅳ)@10203', '大学英语(Ⅳ)@10203', '', '', '模拟电子技术基础@16204', '模拟电子技术基础@16204', '', '', '', '', '', ''],
		      ['', '', '信号与系统@11302', '信号与系统@11302', '', '', '电路、信号与系统实验', '电路、信号与系统实验', '', '', '', ''],
		      ['形势与政策(Ⅳ)@15208', '形势与政策(Ⅳ)@15208', '', '', '电装实习@11301', '电装实习@11301', '', '', '', '大学体育', '大学体育', ''],
		      ['大学体育(Ⅳ)', '大学体育(Ⅳ)', '', '', '数据结构与算法分析', '数据结构与算法分析', '', '', '信号与系统', '信号与系统', '', ''],
		    ];

		    Timetable.setOption({
		      timetables: courseListOther,
		      week: ['一', '二', '三', '四', '五', '六', '日'],
		      styles: {
		        palette: ['#dedcda', '#ff4081']
		      },
		      timetableType: courseType,
		      gridOnClick: function (e) {
		        console.log(e);
		      }
		    });
		  };
		
		
	});
	
	/**
		根据今天的日期值，查询出本周的七天日期值
	*/
	function getDates() {
	    var new_Date = new Date()
	    var timesStamp = new_Date.getTime();
	    var currenDay = new_Date.getDay();
	    var dates = [];
	    for(var i = 0; i < 7; i++) {
	        dates.push(new Date(timesStamp + 24 * 60 * 60 * 1000 * (i - (currenDay + 6) % 7)).toLocaleDateString().replace(/[年月]/g, '-').replace(/[日上下午]/g, ''));
	    	//dates.push(new Date(timesStamp + 24 * 60 * 60 * 1000 * (i - (currenDay + 6) % 7)));
	    }
	    return dates
	}

	/**
		返回表头
	*/
	function courseHeader(){
		let weekDesc=['周一','周二','周三','周四','周五','周六','周日']
		let dates=getDates();
		let headers=[];
		for(let i=0;i<dates.length;i+=1){
			let temp=i;
			headers.push(weekDesc[temp]+'\n'+dates[temp]);
		}
		return headers;
	}
	
</script>
</body>
</html>