<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>购买</title>
<style type="text/css">
	 body{      
        background-image: url(<%=request.getContextPath() %>/static/image/3.jpg);      
        background-size:cover;    
     }            
</style>
</head>

<body>
<form action="<%=request.getContextPath() %>/BuyShopping" method="post">
	<table align="center">
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
		<tr>
			<td colspan="9" align="center"><font color="blue" size="4">验证订单信息</font></td>
		</tr>
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
		<tr>
			<td>商品名</td>
			<td><input type="text" name="oname" value="${ogoods.gname} " readonly="readonly"></td>
		</tr>
		<tr>
			<td>商品图片</td>		
			<td><img src="<%=request.getContextPath() %>/static/goods/${ogoods.gpicture}" width="100" height="75">
		
		</tr>
		<tr>	
		<td>&nbsp;</td>	
			<td><input type="text" name="opicture" value="${ogoods.gpicture}" readonly="readonly"></td>
		</tr>
		<tr>
			<td>商家名</td>
			<td><input type="text" name="obusiness" value="${obusiness.username}" readonly="readonly"></td>
		</tr>
		<tr>
			<td>填写收件地址</td>
			<td><input type="text" name="oaddress"></td>
		</tr>
		<tr>
			<td><input type="reset" value="重置"></td>
			<td><input type="submit" value="提交"></td><td>
		</tr>
	</table> 
	<input>
</form>
	
</body>
</html>