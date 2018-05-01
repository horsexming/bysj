<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户基本信息</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery-3.3.1.min.js"></script>
<link href="<%=request.getContextPath() %>/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=request.getContextPath() %>/static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	 body{      
        background-image: url(<%=request.getContextPath() %>/image/bj2.jpg);      
        background-size:cover;    
     }            
</style>
</head>
<body>
	<table align="center">
	<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
		<tr>
			<td><font color="blue" size="4">用户名：</font></td>
			<td><font color="green" size="4">${usermessage.username}</font></td>
		</tr>
		<tr>
			<td><font color="blue" size="4">年龄：</font></td>
			<td><font color="green" size="4">${usermessage.age}</font></td>
		</tr>
		<tr>
			<td><font color="blue" size="4">性别：</font></td>
			<td>
				<c:if test="${usermessage.sex=='n'}">
					<font color="green" size="4">男</font>
				</c:if>
				<c:if test="${usermessage.sex=='m'}">
					<font color="green" size="4">女</font>
				</c:if>			
			</td>
		</tr>
		<tr>
			<td><font color="blue" size="4">电话：</font></td>
			<td><font color="green" size="4">${usermessage.telephone}</font></td>
		</tr>
		<tr>
			<td><font color="blue" size="4">地址：</font></td>
			<td><font color="green" size="4">${usermessage.address}</font></td>
		</tr>
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
		<tr>
			<td><a href="User_xiugai?username=${usermessage.username}" class="btn btn-primary">修改</a></td>
			<td><a href="user_index" class="btn btn-primary">返回</a></td>
		</tr>
	</table>
</body>
</html>