<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/BuyShopping" method="post">
		<table>
			<tr>
				<td>商品名:</td>
				<td><input type="text" name="oname"></td>
			</tr>
			<tr>
				<td>商家名:</td>
				<td><input type="text" name="obusiness"></td>
			</tr>
			<tr>
				<td>地址:</td>
				<td><input type="text" name="oaddress"></td>
			</tr>
			<tr>
				<td>商品图片:</td>
				<td><input type="text" name="opicture"></td>
			</tr>
			<tr>
				<td>商品图片</td>
				<td><input type="submit" value="登录"></td>
			</tr>
			
		</table>
	</form>
</body>
</html>