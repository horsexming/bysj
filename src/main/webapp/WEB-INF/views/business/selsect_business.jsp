<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商家信息</title>
<style type="text/css">
	 body{      
        background-image: url(<%=request.getContextPath() %>/static/image/find.jpg);      
        background-size:cover;    
     }            
</style>
</head>
<body>
	<table align="center">
	<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
	
		<tr>
			<td><font color="blue" size="4">用户名：</font></td>
			<td><font color="green" size="4">${Business_message.username}</font></td>
		</tr>
		<tr>
			<td><font color="blue" size="4">email：</font></td>
			<td><font color="green" size="4">${Business_message.bemail}</font></td>
		</tr>
		<tr>
			<td><font color="blue" size="4">性别：</font></td>
			<td>
				<c:if test="${Business_message.sex=='n'}">
					<font color="green" size="4">男</font>
				</c:if>
				<c:if test="${Business_message.sex=='m'}">
				
					<font color="green" size="4">女</font>
				</c:if>			
			</td>
		</tr>
		<tr>
			<td><font color="blue" size="4">电话：</font></td>
			<td><font color="green" size="4">${Business_message.bphone}</font></td>
		</tr>
		<tr>
			<td><font color="blue" size="4">地址：</font></td>
			<td><font color="green" size="4">${Business_message.baddress}</font></td>
		</tr>
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
		<tr>
			<td><a href="<%=request.getContextPath() %>/business_update/${Business_message.username}" class="btn btn-primary">修改</a></td>
			<td><a href="<%=request.getContextPath() %>/Business_index" class="btn btn-primary">返回</a></td>
		</tr>
		</table>
</body>
</html>