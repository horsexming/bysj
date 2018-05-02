<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>下架商品管理</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery-3.3.1.min.js"></script>
<link href="<%=request.getContextPath() %>/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=request.getContextPath() %>/static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h1 align="center">
					<font color="blue">下架商品管理</font>
				</h1>
			</div>
		</div>
		<div class="row">
			<table class="table table-hover">
				<tr>
					<td>名称</td>
					<td>商品价格</td>
					<td>商品描述</td>
					<td>商品数量</td>
					<td>重新上架</td>
					<td>彻底删除</td>
				</tr>
				<c:forEach items="${xgoods}" var="xgoods">
					<tr>
						<td>${xgoods.gname}</td>
		    			<td>${xgoods.gprice}</td>   			
		    			<td>${xgoods.gcategory}</td>   			
		    			<td>${xgoods.gumber}</td>
		    			<td><a href="<%=request.getContextPath() %>/shangjia_xboods/${xgoods.id}" class="btn btn-danger">上架</a></td>
		    			<td><a href="<%=request.getContextPath() %>/delete_xboods/${xgoods.id}" class="btn btn-danger" onclick="javascript:return del();">删除</a></td>
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
					  	<li><a href="<%=request.getContextPath()%>/select_Xdoods_page?pn=1" aria-label="Previous">首页</a></li>
					  	<c:if test="${pageInfo.hasPreviousPage}">
						  	<li>
								<a href="<%=request.getContextPath()%>/select_Xdoods_page?pn=${pageInfo.pageNum-1}" aria-label="Previous">
								<span aria-hidden="true">&laquo;</span>
								</a>
						    </li>
					  	</c:if>					    
						<c:forEach items="${pageInfo.navigatepageNums}" var="page_Number">
							<c:if test="${page_Number==pageInfo.pageNum}">
							    <li class="active"><a href="#">${page_Number}</a></li>
							</c:if>					    		
							<c:if test="${page_Number!=pageInfo.pageNum}">
							    <li><a href="<%=request.getContextPath()%>/select_Xdoods_page?pn=${page_Number}">${page_Number}></a></li>
							</c:if>					  					    	
						</c:forEach>
					    <c:if test="${pageInfo.hasNextPage}">
							<li>
								<a href="<%=request.getContextPath()%>/select_Xdoods_page?pn=${pageInfo.pageNum+1}" aria-label="Next">
									<span aria-hidden="true">&raquo;</span>
								</a>
							</li>
					  	</c:if>					    
					    <li><a href="<%=request.getContextPath()%>/select_Xdoods_page?pn=${pageInfo.pages}" aria-label="Previous">尾页</a></li>
					  </ul>
				</nav>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
					<a href="<%=request.getContextPath()%>/Bpage">返回</a>
			</div>
		</div>		
	</div>
</body>
</html>