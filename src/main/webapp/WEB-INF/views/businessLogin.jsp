<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="multipart/form-data; charset=UTF-8">
<title>商家登录</title>
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	 body{      
        background-image: url(<%=request.getContextPath() %>/static/image/3.jpg);      
        background-size:cover;    
     }            
</style>
<script type="text/javascript">
		$(function() {
		
			var uname = $("#uname").val();
			var username= document.getElementById("uname");
			if(username.value.trim()!=""){
				alert("添加商品成功");		
			}			
		
	});
	</script>
</head>
<body>
<input type="hidden" value="${login}" id="uname">
&nbsp;
&nbsp;
&nbsp;
&nbsp;
<form action="addGoods" enctype="multipart/form-data" method="post">

	<table align="center" class="table table-hover">
		<tr>
			<td align="center" colspan="6"><font color="blue" size="5">欢迎进入个人主页</font></td>
		</tr>		
		<tr>
			<td>&nbsp;</td>			
			<td><a href="#" class="btn btn-primary">个人信息</a></td>		
			<td><a href="<%=request.getContextPath() %>/addGoods" class="btn btn-primary">添加商品</a></td>	
			<td><a href="#" class="btn btn-primary">订单查询</a></td>
			<td><a href="#" class="btn btn-primary">店铺管理</a></td>
			<td align="right" colspan="6"><font color="blue">欢迎商家：</font>${business.username}</td>		
		</tr>	
		<tr>
				<td>&nbsp;</td>
    			<td>名称</td>			
    			<td>商品价格</td>    			
    			<td>商品描述</td>   			
    			<td>商品数量</td>
    			<td>下架商品</td>
		</tr>
		<c:forEach items="${Budoods}" var="Budoods">
    		<tr> 
    			<td>&nbsp;</td>  			
    			<td>${Budoods.gname}</td>
    			<td>${Budoods.gprice}</td>   			
    			<td>${Budoods.gcategory}</td>   			
    			<td>${Budoods.gumber}</td>
    			<td><a href="#" class="btn btn-danger">下架</a></td>   		
    		</tr>   		
    	</c:forEach>		
	</table>
	
	</form>
</body>
</html>