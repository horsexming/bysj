<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
		$(function() {
		
			var uname = $("#uname").val();
			var username= document.getElementById("uname");
			if(username.value.trim()!=""){
				alert("aaa");		
			}			
		
	});
	</script>
</head>
<body>
<input type="hidden" value="${login}" id="uname">
<img src="<%=request.getContextPath() %>/static/goods/1.7.jpg" width="100" height="75">
success
</body>
</html>