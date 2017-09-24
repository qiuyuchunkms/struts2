<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'testbeanre.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>

<body>
	<br>
  <div align="right">
      <a href="index.action">
			<u:msg key="jsp-set_locale.back-to-index" />
		</a>
  </div>
    <br>
	<br>
	<br>
	<br>
    <div align="center">
    <table border="1">
    <caption>Persion Attributs</caption>
    
        <tr>
				<td>Name</td>
				<td>
					<c:out value="${persion.firstName} ${persion.lastName}" />&nbsp;</td>
			</tr>
        <tr>
				<td>Brithday</td>
				<td>
					<c:out value="${persion.birthday}" />&nbsp;</td>
			</tr>
        <tr>
				<td>Gender</td>
				<td>
					<c:out value="${persion.gender}" />&nbsp;</td>
			</tr>
        <tr>
				<td>Working Age</td>
				<td>
					<c:out value="${persion.workingAge}" />&nbsp;</td>
			</tr>
        <tr>
				<td>Interest</td>
				<td>
					<c:forEach var="its" items="${persion.interest}">
                                     <c:out value="${its}" /> &nbsp;
                              </c:forEach>&nbsp;</td>
			</tr>
        <tr>
				<td>Photos</td>
				<td>
					<c:forEach var="p" items="${persion.photos}">
                                     <c:out value="${p}" />
						<br>
                              </c:forEach>&nbsp;</td>
			</tr>
    </table>
   </div>
  </body></body>

</html>
