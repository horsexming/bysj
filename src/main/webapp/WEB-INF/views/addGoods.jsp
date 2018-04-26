<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="multipart/form-data; charset=UTF-8">
<title>商品添加</title>
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
           

<style type="text/css">
	 body{      
        background-image: url(<%=request.getContextPath() %>/static/image/8.jpg);      
        background-size:cover;    
     } 
     
           
</style> 
</head>
<body>
	<form action="<%=request.getContextPath() %>/addGoods" enctype="multipart/form-data" method="post">
		<table  align="center">
		
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
		<tr><td>&nbsp;</td>
		<td colspan="2"><font color="blue" size="5">商品添加到店铺</font></td></tr>
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
			<tr>
				<td>商品名:</td>
				<td><input type="text" name="Gname" class="form-control"></td>
			</tr>			
			<tr>
				<td>商品价格:</td>
				<td><input type="text" name="Gprice" class="form-control"></td>
			</tr>			
			<tr>
				<td>商品描述:</td>
				<td><input type="text" name="Gcategory" class="form-control"></td>
			</tr>			
			<tr>
				<td>商品数量:</td>
				<td><input type="text" name="Gumber" class="form-control"></td>
			</tr>		
			<tr>
				<td>商品图片:</td>
				<td><input type="file" name="Gpicture" class="form-control"></td>
			</tr>
			<tr><td>&nbsp;</td>
			<tr>
				<td align="left">
					<a href="<%=request.getContextPath()%>/Bpage?pn=1" class="btn btn-success">返回</a>
				</td>
				<td align="right">
					<input type="submit" value="添加" class="btn btn-success">
				</td>
			</tr>
		</table>	
	</form>
</body>
</html>