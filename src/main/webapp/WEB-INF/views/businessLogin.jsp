<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="multipart/form-data; charset=UTF-8">
<title>商家登录</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery-3.3.1.min.js"></script>
<link href="<%=request.getContextPath() %>/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=request.getContextPath() %>/static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	 body{      
        background-image: url(<%=request.getContextPath() %>/static/image/dianpu.jpg);      
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
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 align="center">
					<font color="blue">欢迎进入个人主页</font>
				</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-2">
				<a href="<%=request.getContextPath() %>/selsect_business/${business.username}" class="btn btn-primary">个人信息</a>
			</div>
			<div class="col-md-2">
				<a href="<%=request.getContextPath() %>/business_selectorder/${business.username}" class="btn btn-primary">订单查询</a>
			</div>
			<div class="col-md-2">
				<a href="#" class="btn btn-primary">店铺管理</a>
			</div>
			<div class="col-md-2">
				<a href="<%=request.getContextPath() %>/addGoods" class="btn btn-primary" class="btn btn-primary">添加商品</a>
			</div>
			<div class="col-md-2 col-md-offset-11">
				<font color="blue">欢迎商家：</font>${business.username}
			</div>
		</div>
		<div class="row">
			<table class="table table-hover">
				<tr>
					<td>名称</td>
					<td>商品价格</td>
					<td>商品描述</td>
					<td>商品数量</td>
					<td>下架商品</td>
				</tr>
				<c:forEach items="${Budoods}" var="Budoods">
					<tr>
						<td>${Budoods.gname}</td>
		    			<td>${Budoods.gprice}</td>   			
		    			<td>${Budoods.gcategory}</td>   			
		    			<td>${Budoods.gumber}</td>
		    			<td><a href="#" class="btn btn-danger">下架</a></td>
					</tr>				
				</c:forEach>				
			</table>
		</div>
		<div class="row">		
			<div class="col-md-6" >
				当前第<font color="blue">${pageInfo.pageNum}</font>页,
				共有<font color="blue">${pageInfo.pages}</font>	页,
				共有<font color="blue">${pageInfo.total}</font>条记录
			</div>
			<div class="col-md-6">
				<nav aria-label="Page navigation">
					  <ul class="pagination">
					  	<li><a href="<%=request.getContextPath()%>/Bpage?pn=1" aria-label="Previous">首页</a></li>
					  	<c:if test="${pageInfo.hasPreviousPage}">
						  	<li>
								<a href="<%=request.getContextPath()%>/Bpage?pn=${pageInfo.pageNum-1}" aria-label="Previous">
								<span aria-hidden="true">&laquo;</span>
								</a>
						    </li>
					  	</c:if>					    
						<c:forEach items="${pageInfo.navigatepageNums}" var="page_Number">
							<c:if test="${page_Number==pageInfo.pageNum}">
							    <li class="active"><a href="#">${page_Number}</a></li>
							</c:if>					    		
							<c:if test="${page_Number!=pageInfo.pageNum}">
							    <li><a href="<%=request.getContextPath()%>/Bpage?pn=${page_Number}">${page_Number}></a></li>
							</c:if>					  					    	
						</c:forEach>
					    <c:if test="${pageInfo.hasNextPage}">
							<li>
								<a href="<%=request.getContextPath()%>/Bpage?pn=${pageInfo.pageNum+1}" aria-label="Next">
									<span aria-hidden="true">&raquo;</span>
								</a>
							</li>
					  	</c:if>					    
					    <li><a href="<%=request.getContextPath()%>/Bpage?pn=${pageInfo.pages}" aria-label="Previous">尾页</a></li>
					  </ul>
				</nav>
			</div>
		</div>		
	</div>
</body>
</html>