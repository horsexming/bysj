<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="<%=request.getContextPath() %>/static/js/jquery-3.3.1.min.js"></script>
<link href="<%=request.getContextPath() %>/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="<%=request.getContextPath() %>/static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
<style type="text/css">
	 body{      
        background-image: url(static/image/3.jpg);      
        background-size:cover;    
     } 
     
           
</style>
<script type="text/javascript">
		$(function() {
		$("#uname").blur(function() {
			var uname = $(this).val();
			var username= document.getElementById("uname");
			if(username.value.trim()==""){
				$("#tip").html("用户名不能为空!");		
			}else{			
				$.ajax({
					type : "POST",
					url : "check_businessName",
					data : "username=" + uname,
					success : function(data) {
						if(data==1){
							$("#tip").html("用户名已存在!");
						}else{
							$("#tip").html("用户名可用!");
						}
					}
				});
				
			}
			 
			
		});
	});
	</script>
</head>
<body>
	
	<form action="Business_Registers" method="post">
		<table align="center">
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
		<tr><td align="center" colspan="2"><font color="blue" size="5">商家注册</font></td></tr>	
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
		<tr><td>&nbsp;</td></tr><tr><td>&nbsp;</td></tr>
			<tr>
				<td>用户名:</td>
				<td><input  id="uname" type="text" name="username"></td>
				<td><span id="tip"></span></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>性别:</td>
				<td><input type="text" name="sex"></td>
			</tr>
			<tr>
				<td>邮箱:</td>
				<td><input type="text" name="Bemail"></td>
			</tr>
			<tr>
				<td>联系电话:</td>
				<td><input type="text" name="Bphone"></td>
			</tr>
			<tr>
				<td>地址:</td>
				<td><input type="text" name="Baddress"></td>
			</tr>
			<tr><td>&nbsp;</td></tr>
			
			<tr>
				<td><input type="reset" value="重置" class="btn btn-primary"></td>
				<td align="right"><input type="submit" value="注册" class="btn btn-primary"></td>
			</tr>
		</table>	
	</form>

</body>
</html>