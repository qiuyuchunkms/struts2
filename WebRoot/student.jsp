<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>简单对象</h3>
	<form action="<%=request.getContextPath()%>/user/user2Action_addStuList" method="post">
		编号：
		<input type="text" name="student.stuNo" />
		<br /> 姓名：
		<input type="text" name="student.stuName" />
		<br /> 年龄：
		<input type="text" name="student.stuAge" />
		<br />
		<input type="submit" value="提交" />
	</form>
	<hr>
	<h3>List集合</h3>
	<form action="<%=request.getContextPath()%>/user/user2Action_addStuList" method="post">
		学生1 编号：
		<input type="text" name="stuList[0].stuNo" />
		姓名：
		<input type="text" name="stuList[0].stuName" />
		年龄：
		<input type="text" name="stuList[0].stuAge" />
		<br /> 学生2 编号：
		<input type="text" name="stuList[1].stuNo" />
		姓名：
		<input type="text" name="stuList[1].stuName" />
		年龄：
		<input type="text" name="stuList[1].stuAge" />
		<br /> 学生3 编号：
		<input type="text" name="stuList[2].stuNo" />
		姓名：
		<input type="text" name="stuList[2].stuName" />
		年龄：
		<input type="text" name="stuList[2].stuAge" />
		<br />
		<input type="submit" value="提交" />
	</form>
	<hr>
	<h3>Set集合</h3>
	<form action="<%=request.getContextPath()%>/user/userAction2_addStuList" method="post">
		学生1 编号：
		<input type="text" name="stuSet.makeNew[0].stuNo" />
		姓名：
		<input type="text" name="stuSet.makeNew[0].stuName" />
		年龄：
		<input type="text" name="stuSet.makeNew[0].stuAge" />
		<br /> 学生2 编号：
		<input type="text" name="stuSet.makeNew[1].stuNo" />
		姓名：
		<input type="text" name="stuSet.makeNew[1].stuName" />
		年龄：
		<input type="text" name="stuSet.makeNew[1].stuAge" />
		<br /> 学生3 编号：
		<input type="text" name="stuSet.makeNew[2].stuNo" />
		姓名：
		<input type="text" name="stuSet.makeNew[2].stuName" />
		年龄：
		<input type="text" name="stuSet.makeNew[2].stuAge" />
		<br />
		<input type="submit" value="提交" />
	</form>
	<hr>

	<h3>Map集合</h3>
	<form action="<%=request.getContextPath()%>/user/userAction2_addStuList" method="post">
		学生1 编号：
		<input type="text" name="stuMap['stu1'].stuNo" />
		姓名：
		<input type="text" name="stuMap['stu1'].stuName" />
		年龄：
		<input type="text" name="stuMap['stu1'].stuAge" />
		<br /> 学生2 编号：
		<input type="text" name="stuMap.stu2.stuNo" />
		姓名：
		<input type="text" name="stuMap.stu2.stuName" />
		年龄：
		<input type="text" name="stuMap.stu2.stuAge" />
		<br /> 学生3 编号：
		<input type="text" name="stuMap['stu3'].stuNo" />
		姓名：
		<input type="text" name="stuMap['stu3'].stuName" />
		年龄：
		<input type="text" name="stuMap['stu3'].stuAge" />
		<br />
		<input type="submit" value="提交" />
	</form>
	<hr>
</body>
</html>
