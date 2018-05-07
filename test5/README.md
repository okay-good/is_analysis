# 实验5: 图书管理系统数据库设计与界面设计

-------

## 1、数据库表的设计

### 1.1 读者信息表
<br>
<table cellspacing="0">
<tr>
	<td>字段</td>
	<td>类型</td>
	<td>主键、外键</td>
	<td>是否为空</td>
	<td>默认值</td>
	<td>约束</td>
	<td>说明</td>
</tr>

<tr>
	<td>id</td>
	<td>int(8)</td>
	<td>主键</td>
	<td>否</td>
	<td>1</td>
	<td></td>
	<td>读者信息表的主键id值</td>
</tr>
<tr>
	<td>accountId</td>
	<td>int(8)</td>
	<td>外键</td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>账号信息表的ID值</td>
</tr>

<tr>
	<td>studentNo</td>
	<td>char(12)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td>必须为12位的纯数字值</td>
	<td>学生的学号值</td>
</tr>

<tr>
	<td>name</td>
	<td>varchar(16)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>名字</td>
</tr>
<tr>
	<td>age</td>
	<td>tinyint(2)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>年龄</td>
</tr>
<tr>
	<td>sex</td>
	<td>char(2)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>性别</td>
</tr>
<tr>
	<td>tel</td>
	<td>char(11)</td>
	<td></td>
	<td></td>
	<td></td>
	<td>必须为11位的纯数字值</td>
	<td>电话</td>
</tr>

<tr>
	<td>major</td>
	<td>varchar(32)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>专业</td>
</tr>

<tr>
	<td>acdemic</td>
	<td>varchar(32)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>学院</td>
</tr>

<tr>
	<td>email</td>
	<td>varchar(16)</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>邮箱</td>
</tr>

<tr>
	<td>address</td>
	<td>varchar(32)</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>居住地</td>
</tr>
<tr>
	<td>borrowedSize</td>
	<td>tinyint(2)</td>
	<td></td>
	<td></td>
	<td>0</td>
	<td></td>
	<td>已借阅图书量</td>
</tr>

<tr>
	<td>borrowableSize</td>
	<td>tinyint(2)</td>
	<td></td>
	<td></td>
	<td>0</td>
	<td></td>
	<td>可借阅图书数量</td>
</tr>

<tr>
	<td>orderSize</td>
	<td>tinyint(2)</td>
	<td></td>
	<td></td>
	<td>0</td>
	<td></td>
	<td>预定图书数量</td>
</tr>

<tr>
	<td>lastLoginTime</td>
	<td>datetime</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>上次登录时间</td>
</tr>
</table>

--------

### 1.2 图书管理员信息表



<table cellspacing="0">
<tr>
	<td>字段</td>
	<td>类型</td>
	<td>主键、外键</td>
	<td>是否可为空</td>
	<td>默认值</td>
	<td>约束</td>
	<td>说明</td>
</tr>

<tr>
	<td>id</td>
	<td>int(6)</td>
	<td>主键</td>
	<td>否</td>
	<td>1</td>
	<td></td>
	<td>主键ID值，为自增</td>
</tr>
<tr>
	<td>accountId</td>
	<td>int(8)</td>
	<td>外键</td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>账号信息表的ID值</td>
</tr>
<tr>
	<td>managerNo</td>
	<td>char(12)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>管理员的编号值</td>
</tr>
<tr>
	<td>name</td>
	<td>varchar(16)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>姓名</td>
</tr>
<tr>
	<td>age</td>
	<td>tinyint(2)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>年龄</td>
</tr>
<tr>
	<td>sex</td>
	<td>char(2)</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>性别</td>
</tr>
<tr>
	<td>tel</td>
	<td>char(11)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td>必须为11位的纯数字</td>
	<td>电话</td>
</tr>
<tr>
	<td>email</td>
	<td>varhcar(32)</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>邮箱</td>
</tr>

<tr>
	<td>address</td>
	<td>varchar(32)</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>居住地</td>
</tr>


</table>

-------

### 1.3 图书信息表

<table cellspacing="0">
<tr>
	<td>字段</td>
	<td>类型</td>
	<td>主键、外键</td>
	<td>是否可为空</td>
	<td>默认值</td>
	<td>约束</td>
	<td>说明</td>
</tr>

<tr>
	<td>id</td>
	<td>int(8)</td>
	<td>主键</td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>图书的ID编号值</td>
</tr>
<tr>
	<td>name</td>
	<td>varchar(64)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>书名</td>
</tr>
<tr>
	<td>price</td>
	<td>float(7,2)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td>小数点后两位</td>
	<td>价格</td>
</tr>
<tr>
	<td>publishName</td>
	<td>varchar(32)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>出版社名字</td>
</tr>
<tr>
	<td>publishTime</td>
	<td>datetime</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>出版时间</td>
</tr>
<tr>
	<td>borrowedSize</td>
	<td>int(5)</td>
	<td></td>
	<td></td>
	<td>0</td>
	<td></td>
	<td>已借阅出去的图书数量</td>
</tr>
<tr>
	<td>borrowableSize</td>
	<td>int(5)</td>
	<td></td>
	<td></td>
	<td>0</td>
	<td>大于等于0</td>
	<td>可借阅的图书数量</td>
</tr>
<tr>
	<td>sumBorrowSize</td>
	<td>int(8)</td>
	<td></td>
	<td></td>
	<td>0</td>
	<td></td>
	<td>该图书的总借阅次数</td>
</tr>
<tr>
	<td>ISBN</td>
	<td>varchar(32)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td>必须为严格的ISBN格式的值</td>
	<td>图书的ISBN号</td>
</tr>
<tr>
	<td>kindId</td>
	<td>varchar(32)</td>
	<td>外键</td>
	<td></td>
	<td>否</td>
	<td>该值必须要在图书信息分类表中存在</td>
	<td>图书的分类编号</td>
</tr>
<tr>
	<td>desciption</td>
	<td>text</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>描述</td>
</tr>

</table>

------

### 1.4 账号信息表
<table cellspacing="0">
<tr>
	<td>字段</td>
	<td>类型</td>
	<td>主键、外键</td>
	<td>是否可为空</td>
	<td>默认值</td>
	<td>约束</td>
	<td>说明</td>
</tr>

<tr>
	<td>id</td>
	<td>int(8)</td>
	<td>主键</td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>账号表的主键值</td>
</tr>
<tr>
	<td>account</td>
	<td>char(12)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>账号值</td>
</tr>
<tr>
	<td>password</td>
	<td>char(32)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td>使用MD5加密后的值</td>
	<td>密码</td>
</tr>
<tr>
	<td>role</td>
	<td>varchar(16)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>角色</td>
</tr>
<tr>
	<td>isAlive</td>
	<td>tinyint(1)</td>
	<td></td>
	<td>否</td>
	<td>1</td>
	<td></td>
	<td>是否可用</td>
</tr>

</table>

----

### 1.5 借阅信息表
<table cellspacing="0">
<tr>
	<td>字段</td>
	<td>类型</td>
	<td>主键、外键</td>
	<td>是否可为空</td>
	<td>默认值</td>
	<td>约束</td>
	<td>说明</td>
</tr>

<tr>
	<td>id</td>
	<td>int(8)</td>
	<td>主键</td>
	<td>否</td>
	<td>1</td>
	<td></td>
	<td>借阅表的ID值</td>
</tr>
<tr>
	<td>studentId</td>
	<td>char(12)</td>
	<td>外键</td>
	<td>否</td>
	<td></td>
	<td>该值必须存在于读者信息表中</td>
	<td>读者表的ID值</td>
</tr>
<tr>
	<td>bookId</td>
	<td>char(16)</td>
	<td>外键</td>
	<td>否</td>
	<td></td>
	<td>该值必须存在于图书表中</td>
	<td>图书表的ID值</td>
</tr>
<tr>
	<td>borrowTime</td>
	<td>datetime</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>借书时间</td>
</tr>
<tr>
	<td>shouldReturnTime</td>
	<td>datetime</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>规定还书时间</td>
</tr>
<tr>
	<td>realReturnTime</td>
	<td>datetime</td>
	<td></td>
	<td></td>
	<td></td>
	<td>必须小于当前时间值</td>
	<td>实际还书的时间</td>
</tr>
<tr>
	<td>isBeyond</td>
	<td>tinyint(1)</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>是否超期</td>
</tr>
<tr>
	<td>managerId</td>
	<td>int(5)</td>
	<td>外键</td>
	<td>否</td>
	<td></td>
	<td>必须为管理员表中的ID值</td>
	<td>管理员的ID值</td>
</tr>
<tr>
	<td>fineId</td>
	<td>char(16)</td>
	<td>外键</td>
	<td></td>
	<td></td>
	<td>该值为空或者值必须在罚款表中存在</td>
	<td>罚款表的ID值</td>
</tr>
<tr>
	<td>orderId</td>
	<td>char(16)</td>
	<td>外键</td>
	<td></td>
	<td></td>
	<td></td>
	<td>预定编号</td>
</tr>


</table>

-----

### 1.6 罚款信息表
<table cellspacing="0">
<tr>
	<td>字段</td>
	<td>类型</td>
	<td>主键、外键</td>
	<td>是否可为空</td>
	<td>默认值</td>
	<td>约束</td>
	<td>说明</td>
</tr>

<tr>
	<td>id</td>
	<td>int(5)</td>
	<td>主键</td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>罚款表的ID值</td>
</tr>
<tr>
	<td>studentId</td>
	<td>int</td>
	<td>外键</td>
	<td></td>
	<td></td>
	<td>该值必须在读者表中存在</td>
	<td>读者的ID值</td>
</tr>
<tr>
	<td>bookId</td>
	<td>int</td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>该值必须在图书表中存在</td>
	<td>图书的ID值</td>
</tr>
<tr>
	<td>fineDesciption</td>
	<td>text</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>罚款信息描述</td>
</tr>
<tr>
	<td>fineSize</td>
	<td>float(7,2)</td>
	<td></td>
	<td></td>
	<td>0</td>
	<td></td>
	<td>罚款金额</td>
</tr>
<tr>
	<td>managerId</td>
	<td>int</td>
	<td>外键</td>
	<td>否</td>
	<td></td>
	<td>该值必须在管理员表中存在</td>
	<td>管理员的ID值</td>
</tr>
<tr>
	<td>fineTime</td>
	<td>datetime</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>罚款时间</td>
</tr>

</table>

-------

### 1.7 预定信息表

<table cellspacing="0">
<tr>
	<td>字段</td>
	<td>类型</td>
	<td>主键、外键</td>
	<td>是否可为空</td>
	<td>默认值</td>
	<td>约束</td>
	<td>说明</td>
</tr>

<tr>
	<td>id</td>
	<td>int(8)</td>
	<td>主键</td>
	<td>否</td>
	<td>1</td>
	<td></td>
	<td>预定表的主键值</td>
</tr>
<tr>
	<td>studentId</td>
	<td>int(8)</td>
	<td>外键</td>
	<td>否</td>
	<td></td>
	<td>该值必须存在于读者表中</td>
	<td>读者的ID值</td>
</tr>
<tr>
	<td>orderTime</td>
	<td>datetime</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>预定时间</td>
</tr>
<tr>
	<td>bookId</td>
	<td>int(8)</td>
	<td>外键</td>
	<td>否</td>
	<td></td>
	<td>必须存在于图书表中</td>
	<td>图书的编号值</td>
</tr>
<tr>
	<td>fetchTime</td>
	<td>datetime</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>取书时间</td>
</tr>
<tr>
	<td>isCancel</td>
	<td>tinyint(1)</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>是否取消了预定</td>
</tr>
<tr>
	<td>isBeyondNoFecth</td>
	<td>tinyint(1)</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>是否超期未取</td>
</tr>
<tr>
	<td>isAvailable</td>
	<td>tinyint(1)</td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td>是否可用取书</td>
</tr>

</table>

-----

### 1.8 图书分类信息表

<table cellspacing="0">
<tr>
	<td>字段</td>
	<td>类型</td>
	<td>主键、外键</td>
	<td>是否可为空</td>
	<td>默认值</td>
	<td>约束</td>
	<td>说明</td>
</tr>

<tr>
	<td>id</td>
	<td>int(8)</td>
	<td>主键</td>
	<td>否</td>
	<td>1</td>
	<td></td>
	<td>图书分类的主键值</td>
</tr>

<tr>
	<td>name</td>
	<td>varchar(32)</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>分类名</td>
</tr>

<tr>
	<td>description</td>
	<td>text</td>
	<td></td>
	<td>否</td>
	<td></td>
	<td></td>
	<td>分类描述信息</td>
</tr>


</table>






