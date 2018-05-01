<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户登录</title>
<link href="<%=request.getContextPath()%>/static2/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="<%=request.getContextPath()%>/static2/js/jquery2.js"></script>
<script src="<%=request.getContextPath()%>/static2/js/cloud.js" type="text/javascript"></script>
<script language="javascript" src="<%=request.getContextPath()%>/static2/js/js.js"></script>
<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="static/bootstrap-3.3.7-dist/js/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body style="background-color:#1c77ac; background-image: url(<%=request.getContextPath()%>/static2/images/light.png) background-repeat:no-repeat; background-position:center top; overflow:hidden;">
<div id="mainBody">
  <div id="cloud1" class="cloud"></div>
  <div id="cloud2" class="cloud"></div>
</div>
<div class="loginbody"> <span class="systemlogo"></span>
  <div class="loginbox">
  <form action="<%=request.getContextPath()%>/logins" method="post">
    <ul>
      <li>
        <input name="username" type="text" class="loginuser" value="用户名" onclick="JavaScript:this.value=''"/>
      </li>
      <li>
        <input name="password" type="text" class="loginpwd" value="密码" onclick="JavaScript:this.value=''"/>
      </li>
      <li>
        <input  type="radio" name="ra" value="1" checked="checked"/>淘宝者
		<input  type="radio" name="ra" value="2" />售卖者
      </li>
      <li>
        <input type="submit" class="loginbtn" value="登录"/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="<%=request.getContextPath()%>/index.jsp" class="btn btn-primary">返回首页</a>
      </li>
      <li>${user}</li>
    </ul>
    </form>
  </div>
</div>
</body>
</html>
