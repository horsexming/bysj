<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>个人小车</title>
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	 body{      
        background-image: url(<%=request.getContextPath() %>/static/image/8.jpg);      
        background-size:cover;    
     }           
</style> 
<script type="text/javascript">
	function del() {
		var msg = "您真的确定要删除吗？\n\n请确认！";
			if (confirm(msg)==true){
				return true;
			}else{
					return false;
				}
	}
</script>
</head>
<body>
    ${users.username }
	<table align="center">
	<tr><td>&nbsp;</td></tr>
	
	<tr><td>&nbsp;</td></tr>
	<tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
	<td colspan="5"><font color="blue" size="5">欢迎来到购物小车</font></td></tr>
	<tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>
	<tr>
    	<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
    	<td><font color="blue" size="3">商品名</font></td>
    	<td>&nbsp;</td>
    	<td><font color="blue" size="3">商品价格</font></td>
    	<td>&nbsp;</td>
    	<td><font color="blue" size="3">收获地址</font></td>
    	<td>&nbsp;</td>
    	<td><font color="blue" size="3">商品图片</font></td>   		
    </tr>
    <tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td></tr>
		<c:forEach items="${shop}" var="shop">
    		<tr>
    			<td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
    			<td>${shop.sname}</td>
    			<td>&nbsp;</td>
    			<td>${shop.sprice}</td>
    			<td>&nbsp;</td>
    			<td>${shop.saddress}</td>
    			<td>&nbsp;</td>
    			<td><a href="goods/${shop.spicture}"><img src="<%=request.getContextPath() %>/static/goods/${shop.spicture}" width="100" height="75"></a></td>   		
    			<td><a href="<%=request.getContextPath() %>/Buygoods/${shop.spicture}">购买</a></td>
    			<td><a href="<%=request.getContextPath() %>/Deletegoods/${shop.id}" onclick="javascript:return del(); ">删除</a></td>
    		</tr>
    		<tr>
    			<td>&nbsp;</td>	
    		</tr>
    	</c:forEach>
	</table>
</body>
</html>