<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
</head>

<body>
	<form action="<%=request.getContextPath()%>/user/userAction_getUsers" method="post">
		<label style="font-size: 16;font-family: 黑体">姓名：</label>
		<input style="border-style: solid;border-color: blue" type="text" name="user.name,user2.name,user3.name" />user.name,user2.name,user3.name
		<br>
		<label style="font-size: 16;font-family: 黑体;">年龄：</label>
		<input style="border-style: solid;border-color: blue;" type="text"  name="user.age" />user.age
		<br>
		<input type="submit" value="保存">
		<input type="reset" value="取消">

	</form>
</body>
</html>
