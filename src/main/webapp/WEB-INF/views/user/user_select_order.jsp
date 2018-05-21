<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单信息</title>
</head>
<body>
	<table align="center" class="table">
		<tr>
			<td ></td>
			
		</tr>
		<tr>
			<td colspan="2">&nbsp;</td>
			<td colspan="2">名称</td>
			<td colspan="2">地址</td>
			<td colspan="2">商家</td>
			<td colspan="2">订单编号</td>
			<td><a href="<%=request.getContextPath() %>/user_index">返回</a></td>
		</tr>
		<c:forEach items="${order_message}" var="ordermessage">
			<tr>
				<td colspan="2">&nbsp;</td>
				<td colspan="2">${ordermessage.oname}</td>
			
				<td colspan="2">${ordermessage.oaddress}</td>
			
				<td colspan="2">${ordermessage.obusiness}</td>
			
				<td colspan="2">${ordermessage.onumber}</td>
		</c:forEach>
	</table>
</body>
</html>