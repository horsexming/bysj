<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery-3.3.1.min.js"></script>
<link href="<%=request.getContextPath() %>/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=request.getContextPath() %>/static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>订单信息</title>

</head>
<body>
	<table align="center" class="table">	
		<tr><td><font size="4">购买记录</font></td></tr>
		<tr>
			<td colspan="2">&nbsp;</td>
			<td colspan="2">名称</td>
			
			<td colspan="2">收件地址</td>
			
			<td colspan="2">购买者</td>
			
			<td colspan="2">订单编号</td>
			<td colspan="2">地址修改</td>
			<td><a href="<%=request.getContextPath() %>/Business_index/${ordermessage.obusiness}">返回</a></td>
		</tr>
		<c:forEach items="${order_message}" var="ordermessage">
			<tr>
				<td colspan="2">&nbsp;</td>
				<td colspan="2">${ordermessage.oname}</td>
				
				<td colspan="2">${ordermessage.oaddress}</td>
				
				<td colspan="2">${ordermessage.ouser}</td>
				<td colspan="2">${ordermessage.onumber}</td>
				<td colspan="2"><a href="#">地址修改</a></td>
		</c:forEach>
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
					  	<li><a href="<%=request.getContextPath()%>/select_business_order?pn=1" aria-label="Previous">首页</a></li>
					  	<c:if test="${pageInfo.hasPreviousPage}">
						  	<li>
								<a href="<%=request.getContextPath()%>/select_business_order?pn=${pageInfo.pageNum-1}" aria-label="Previous">
								<span aria-hidden="true">&laquo;</span>
								</a>
						    </li>
					  	</c:if>					    
						<c:forEach items="${pageInfo.navigatepageNums}" var="page_Number">
							<c:if test="${page_Number==pageInfo.pageNum}">
							    <li class="active"><a href="#">${page_Number}</a></li>
							</c:if>					    		
							<c:if test="${page_Number!=pageInfo.pageNum}">
							    <li><a href="<%=request.getContextPath()%>/select_business_order?pn=${page_Number}">${page_Number}></a></li>
							</c:if>					  					    	
						</c:forEach>
					    <c:if test="${pageInfo.hasNextPage}">
							<li>
								<a href="<%=request.getContextPath()%>/select_business_order?pn=${pageInfo.pageNum+1}" aria-label="Next">
									<span aria-hidden="true">&raquo;</span>
								</a>
							</li>
					  	</c:if>					    
					    <li><a href="<%=request.getContextPath()%>/select_business_order?pn=${pageInfo.pages}" aria-label="Previous">尾页</a></li>
					 
					  </ul>
				</nav>
			</div>		
	</div>
</body>
</html>