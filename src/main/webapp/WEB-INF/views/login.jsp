<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户首页</title>
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
	<form action="">
	<table align="center">
		<tr><td>&nbsp;</td></tr>
		<tr>
			<td colspan="9" align="right"><font color="blue">欢迎用户：</font>${user.username }</td>
		</tr>
		<tr>
			<td colspan="9" align="center"><font color="blue" size="5">欢迎光临玉器商城</font></td>
		</tr>
		<tr>
			<td><font color="blue">==========</font></td>
			<td><font color="blue">==========</font></td>
			<td><font color="blue">==========</font></td>
			<td><font color="blue">==========</font></td>
			<td><font color="blue">==========</font></td>
			<td><font color="blue">==========</font></td>
			<td><font color="blue">==========</font></td>
			<td><font color="blue">=============================</font></td>
			<td><font color="blue">==========</font></td>
			
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><a href="#" class="btn btn-primary">个人信息</a></td>
			<td>&nbsp;</td>
			<td><a href="#" class="btn btn-primary">购物小车</a></td>
			<td>&nbsp;</td>
			<td><a href="#" class="btn btn-primary">订单查询</a></td>
			<td>&nbsp;</td>
			<td align="right"><input type="text" name="Gname"></td><td align="left"><input type="submit" value="商品查询" class="btn btn-primary" ></td>			
		</tr>
		
		<tr>
			<td><img src="static/goods/8.jpg"></td>
			<td>${bgoods.gname}</td><td>${bgoods.gprice}</td>
			<td>${bgoods.gcategory}</td><td><img src="static/goods/7.jpg" width="100" height="75"></td>
			<td></td><td></td>
		</tr>
		<tr><td>${bgoods.gname}</td></tr>
		<tr><td>${bgoods.gprice}</td></tr>
		<tr><td>${bgoods.gcategory}</td></tr>
	</table>
	</form>
	
</body>
</html>