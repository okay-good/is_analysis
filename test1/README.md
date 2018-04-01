#实验一：业务流程建模
<table>
    <tr>
        <td>学号</td>
		<td>班级</td>
		<td>姓名</td>
    </tr>
	<tr>
        <td>201510414406</td>
		<td>2015-软件工程(4班)</td>
		<td>蒋春林</td>		
    </tr>
</table>
<br>
<img src="./headImage.jpg"/>
<hr>
<h2>一.考试及成绩管理流程图</h2>
#1.1代码如下所示:
@startuml<br>
|教务处|<br>
start<br>
:安排考试;<br>
:考试安排表]<br>
|#AntiqueWhite|教师|<br>
:出卷;<br>
fork<br>
    :A、B试卷|<br>
fork again<br>
    :打印审批表]<br>
|#AntiqueWhite|系主任|<br>
    :审批签字;<br>
    :打印审批表;<br>
end fork<br>
|#AntiqueWhite|教务处|<br>
:打印试卷;<br>
:试卷]<br>
|#AntiqueWhite|学生|<br>
:参加考试;<br>
:答卷]<br>
|#AntiqueWhite|教师|<br>
:阅读出成绩;<br>
fork<br>
    :成绩单]<br>
|#AntiqueWhite|教务处|<br>
if (有不及格) then (有)<br>
    fork<br>
    :安排补考;<br>
    :补考安排表]<br>
    detach<br>
    end fork<br>
endif<br>
|#AntiqueWhite|教师|<br>
fork again<br>
    :答卷]<br>
    :装订存档;<br>
end fork<br>
:期末流程结束;<br>
stop<br>
@enduml<br>
<hr>
###图一：
<br>
<img src="./flow1.jpg"/>
<hr>
<h2>二.客户维修服务流程</h2>
#2.1代码如下所示:
@startuml<br>
|客户|<br>
start<br>
:申请服务;<br>
|#AntiqueWhite|业务经理|<br>
if (是新客户?) then (是)<br>
:登记客户信息;<br>
else (不是)<br>
endif<br>
:上门侦查;<br>
:制定方案;<br>
|客户|<br>
if (满意?) then (不是)<br>
stop<br>
else (是)<br>
:签订服务合同;<br>
endif<br>
|业务经理|<br>
fork<br>
:安排人工;<br>
fork again<br>
:安排材料;<br>
endfork<br>
:填写派工单;<br>
|工人|<br>
:领取材料;<br>
:上门服务;<br>
|客户|<br>
:验收并填写反馈意见;<br>
|业务经理|<br>
:交回派工单;<br>
|财务人员|<br>
:结算收账;<br>
stop<br>
@enduml<br>
<hr>
###图二：
<br>
<img src="./flow2.jpg"/>