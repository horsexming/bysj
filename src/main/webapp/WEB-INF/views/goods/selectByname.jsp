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
<title>商品查询结果</title>
<style type="text/css">
	 body{      
        background-image: url(<%=request.getContextPath() %>/static/image/find.jpg);      
        background-size:cover;    
     }            
</style>
<script type="text/javascript">
		$(function() {		
			var uname = $("#uname").val();		
			var username= document.getElementById("uname");
			if(username.value.trim()=="aa"){
				alert("添加成功");		
			}else if(username.value.trim()=="bb"){
				
				alert("请先登录");
			}
					
	});
	</script>
</head>
<body>
<input type="hidden" value="${addmessage}" id="uname">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 align="center">
					<font color="blue" style="font-weight:bold;font-style:italic;">商品查询</font>
				</h1>
			</div>
		</div>	
	</div>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 align="center">
					<font color="blue">&nbsp;</font>
				</h1>
			</div>
		</div>	
	</div>
	<table align="center">
		<tr>
    		<c:forEach items="${bgoodsByname}" var="bgoods">
    			<td>
    				<a href="goods/${bgoods.id}">
    					<img src="<%=request.getContextPath()%>/static/image/${bgoods.gpicture}"
    					width="100" height="75">
    				</a><br>
    				名称:${bgoods.gname}<br>
    				商品价格:${bgoods.gprice}<br>
    				商品描述:${bgoods.gcategory}<br>
    				<a href="user_byshop/${bgoods.id}">加入购物车</a>
    			</td>
    			<td>&nbsp;</td>
    			<td>&nbsp;</td>
    		</c:forEach>   			
    	</tr> 
    	<tr>
    		<td>&nbsp;</td>
    		<td>&nbsp;</td>
    	</tr> 
    		
	</table>
	<table align="center">
		<tr>
    		<td>当前第<font color="blue">${pageInfo.pageNum}</font>页</td>
    		<td>共有<font color="blue">${pageInfo.pages}</font>页</td>
    		<td>共有<font color="blue">${pageInfo.total}</font>条记录</td>
    	</tr>  
	</table>	
	<div class="container">					
			<div class="col-md-12 col-md-offset-6">
				<nav aria-label="Page navigation">
					  <ul class="pagination">
					  	<li><a href="<%=request.getContextPath()%>/select_page?pn=1" aria-label="Previous">首页</a></li>
					  	<c:if test="${pageInfo.hasPreviousPage}">
						  	<li>
								<a href="<%=request.getContextPath()%>/select_page?pn=${pageInfo.pageNum-1}" aria-label="Previous">
								<span aria-hidden="true">&laquo;</span>
								</a>
						    </li>
					  	</c:if>					    
						<c:forEach items="${pageInfo.navigatepageNums}" var="page_Number">
							<c:if test="${page_Number==pageInfo.pageNum}">
							    <li class="active"><a href="#">${page_Number}</a></li>
							</c:if>					    		
							<c:if test="${page_Number!=pageInfo.pageNum}">
							    <li><a href="<%=request.getContextPath()%>/select_page?pn=${page_Number}">${page_Number}></a></li>
							</c:if>					  					    	
						</c:forEach>
					    <c:if test="${pageInfo.hasNextPage}">
							<li>
								<a href="<%=request.getContextPath()%>/select_page?pn=${pageInfo.pageNum+1}" aria-label="Next">
									<span aria-hidden="true">&raquo;</span>
								</a>
							</li>
					  	</c:if>					    
					    <li><a href="<%=request.getContextPath()%>/select_page?pn=${pageInfo.pages}" aria-label="Previous">尾页</a></li>
					  <li>
					  	<a href="user_gouout">返回</a>
					  </li>
					  </ul>
				</nav>
			</div>		
	</div>
</body>
</html>