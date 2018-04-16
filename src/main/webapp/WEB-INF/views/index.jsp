<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user login</title>
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	 body{      
        background-image: url(static/image/2.jpg);      
        background-size:cover;    
     } 
     
           
</style>
</head>
<body>
	<form action="logins" method="post">
		<table align="center">
		<tr><td>&nbsp;</td><tr><td>&nbsp;</td><tr><td>&nbsp;</td><tr><td>&nbsp;</td>
		<tr><td>&nbsp;</td><tr><td>&nbsp;</td><tr><td>&nbsp;</td><tr><td>&nbsp;</td>
		<tr><td>&nbsp;</td><tr><td>&nbsp;</td><tr><td>&nbsp;</td><tr><td>&nbsp;</td>
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr><td>&nbsp;</td><tr>
			<tr>
				<td>密 码:</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr><td>&nbsp;</td><tr>
			<tr>
				<td align="center"><input  type="radio" name="ra" value="1" />淘宝者</td>
				<td align="center"><input  type="radio" name="ra" value="2" />售卖者</td>
			</tr>
			<tr><td>&nbsp;</td><tr>
			<tr>
				<td><input type="reset" value="重置" class="btn btn-primary"></td>
				<td align="center"><input type="submit" value="登录" class="btn btn-primary"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>