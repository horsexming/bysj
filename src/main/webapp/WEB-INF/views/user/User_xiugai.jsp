<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息修改</title>
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="User_update" method="post">
		<table  align="center">
			<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
			<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
			<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
			<tr><td colspan="2" align="center"><font size="6">基本信息修改</font></td></tr>
			<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
			<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
			<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username" value="${usermessage.username}" readonly="readonly"></td>
			</tr>			
			<tr>
				<td><input  type="radio" name="sex" value="n" checked="checked"/>男</td>
				<td><input  type="radio" name="sex" value="m" />女</td>			
			</tr>
			<tr>
				<td>年龄:</td>
				<td><input type="text" name="age" value="${usermessage.age}"></td>
			</tr>
			<tr>
				<td>联系电话:</td>
				<td><input type="text" name="telephone" value="${usermessage.telephone}"></td>
			</tr>
			<tr>
				<td>收货地址:</td>
				<td><input type="text" name="address" value="${usermessage.address}"></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			
			<tr>
				<td><input type="reset" value="重置" class="btn btn-primary"></td>
				<td align="right"><input type="submit" value="修改" class="btn btn-primary"></td>
			</tr>
		</table>
	</form>
</body>
</html>