<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>南阳玉器商城</title>
	<meta name="description" content="">
	<meta name="keywords" content="">
	<link href="<%=request.getContextPath()%>/static/css/style.css" rel="stylesheet">
	<script src="<%=request.getContextPath()%>/static/js/jquery.js" type="text/javascript"></script>
	<script src="<%=request.getContextPath()%>/static/js/scripts.js" type="text/javascript"></script>
	<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
		function getuser(){			
			alert("您已登录不用重新注册");		
		}
	</script>
</head>
<body>
	<div class="top">
		<div class="topnav clear">
			<div class="user-entry">
				<b>${users.username }</b>您好，欢迎来到玉器商城
			</div>
			<ul class="quick-menu">
				<li class="user-center">
					中国南阳>>
				</li>				
				<li class="user-center">
					中国名玉之一的产地>>
				</li>
				<li class="user-center">
					独山
				</li>
				<li class="user-center">
					<div class="menu">
						<a href="#">我的商城</a>
						<i class="arrow"></i>					
					</div>
					<span class="hline"></span>
					<div class="menu-bd menu-bdp">
						<ul>
							<li><a href="user_index">首页</a></li>
						</ul>
					</div>
				</li>		
				<li class="user-center">
					<div class="menu">
						<a href="<%=request.getContextPath()%>/user_helps">站内消息</a>
						<span class="hline"></span>
					</div>
				</li>
				<li class="user-center">
					<div class="menu">
						<a href="#">更多链接</a>
						<i class="arrow"></i>
					</div>
					<div class="menu-bd">
						<ul>
							<li><a href="<%=request.getContextPath()%>/user_out">退出</a></li>
						</ul>
					</div>
				</li>													
			</ul>

		</div>
	</div>
	<div class="head">
		<div class="logo fl">
			<a href="#"><img src="<%=request.getContextPath()%>/static/images/1.png"></a>
		</div>
		<div class="search fl">
			<div class="sch-form">
				<form action="select_goods_byname">
					<input type="text" class="stext" name="Gname">
					<input type="submit" class="sbtn" value="搜索">
				</form>
			</div>
		</div>
		<div class="cart fr">
			<div class="cartb">
				<i class="buyicon"></i>
				<a href="shopping/${users.id}">我的购物车</a>
			</div>
		</div>
	</div>
	<div class="dtw">
		<div class="dtww clear">
			<div class="dt fl">
				<a href="#">全部商品分类</a>
			</div>
			<ul class="navbar fl">
				<li><a href="user_index">首页</a></li>
				<li><a href="<%=request.getContextPath()%>/User_message?username=${user.username }">个人信息</a></li>
				<li><a href="#">订单查询</a></li>
				<li><a href="user_helps">帮助</a></li>
			</ul>
		</div>
	</div>
	<div class="nav clear">
		<div class="category clear">
			<div class="dd">
				<div class="dd-inner">
					<ul>
						<li>
							<h3><a href="#">摆件</a></h3>
							<i> > </i>
							<div class="item-sub">
								<div class="subleft">
									<div class="item-channels">
										<div class="channel">
											<a href="<%=request.getContextPath()%>/select_byname?Gname=财">招财<i> > </i></a>
											<a href="<%=request.getContextPath()%>/select_byname?Gname=福">引福<i> > </i></a>
											<a href="<%=request.getContextPath()%>/select_byname?Gname=佑">辟邪 <i> > </i></a>
											<a href="<%=request.getContextPath()%>/select_byname?Gname=饰">装饰 <i> > </i></a>
											<div class="clear"></div>
										</div><div class="clear"></div>
									</div>
									<div class="subitems">
										<dl>
											<dd><b>招财</b><i> > </i></dd>
											<dt>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=貔貅">貔貅</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=金蟾">金蟾</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=财">其它</a>
											</dt>
										</dl>
										<dl>
											<dd><b>引福</b><i> > </i></dd>
											<dt>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=玉蝉">玉蝉</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=玉白菜">玉白菜</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=如意">如意</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=福">更多</a>
											</dt>
										</dl>
										<dl>
											<dd><b>辟邪</b><i> > </i> </dd>
											<dt>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=观音">玉观音</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=玉佛">玉佛</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=关">关二爷</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=佑">更多</a>
											</dt>
										</dl>
										<dl>
											<dd><b>装饰</b><i> > </i></dd>
											<dt>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=山水">山水</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=竹">玉竹</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=画">壁画</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=人">人物</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=饰">其它</a>
											</dt>
										</dl>
										<dl>
											<dd><b>其它</b><i> > </i> </dd>
										</dl>										
									</div>
								</div>
								<div class="clear"></div>
							</div>
						</li>
						<li>
							<h3><a href="#">首饰</a></h3>
							<i> > </i>
							<div class="item-sub">
								<div class="subleft">
									<div class="item-channels">
										<div class="channel">
											<a href="<%=request.getContextPath()%>/select_byname?Gname=镯">手镯<i> > </i></a>
											<a href="<%=request.getContextPath()%>/select_byname?Gname=链">手链<i> > </i></a>
											<a href="<%=request.getContextPath()%>/select_byname?Gname=坠">吊坠<i> > </i></a>
											<a href="<%=request.getContextPath()%>/select_byname?Gname=脚">脚链<i> > </i></a>
										</div>
									</div>
									<div class="subitems">
										<dl>
											<dd><b>手链</b><i> > </i></dd>
											<dt>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=生肖">生肖</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=貔貅">貔貅</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=简">简单</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=链">更多</a>
											</dt>
										</dl>
										<dl>
											<dd><b>手镯</b><i> > </i> </dd>
											<dt>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=老料">老料</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=镯">更多</a>												
											</dt>
										</dl>
										<dl>
											<dd><b>脚链</b><i> > </i> </dd>
											<dt>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=生肖">生肖</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=铃铛">铃铛</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=动物">小动物</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=链">更多</a>											
											</dt>
										</dl>
										<dl>
											<dd><b>吊坠</b><i> > </i> </dd>
											<dt>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=生肖">生肖</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=景">风景</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=动物">小动物</a>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=坠">更多</a>											
											</dt>
										</dl>											
									</div>
								</div>

							</div>
						</li>	
						<li>
							<h3><a href="<%=request.getContextPath()%>/select_byname?Gname=玩">玩物</a></h3>
							<i> > </i>
							<div class="item-sub">
								<div class="subleft">
									<div class="item-channels">
										<div class="channel">
											<a href="<%=request.getContextPath()%>/select_byname?Gname=玩">小玩件</a>
											<a href="<%=request.getContextPath()%>/select_byname?Gname=玩">大玩件</a>
										</div>
									</div>
									<div class="subitems">
										<dl>
											<dd><b>小玩件</b><i> > </i></dd>
											<dt>
												<a href="<%=request.getContextPath()%>/select_byname?Gname=核桃">核桃</a>											
												<a href="<%=request.getContextPath()%>/select_byname?Gname=玩">更多</a>

											</dt>
										</dl>															
									</div>
								</div>
							</div>
						</li>	
						<li>
							<h3><a href="<%=request.getContextPath()%>/select_byname?Gname=藏">收藏</a></h3>
							<i> > </i>
							<div class="item-sub">
								<div class="subleft">
									<div class="item-channels">
										<div class="channel">
											<a href="<%=request.getContextPath()%>/select_byname?Gname=玩">玩物<i> > </i></a>
											<a href="<%=request.getContextPath()%>/select_byname?Gname=器桃">玉容器<i> > </i></a>
											<a href="<%=request.getContextPath()%>/select_byname?Gname=摆">摆件<i> > </i></a>
											<a href="<%=request.getContextPath()%>/select_byname?Gname=风水">风水<i> > </i></a>
										</div>
									</div>
									<div class="subitems">
										<dl>
											<dd><b>玩物</b><i> > </i> </dd>
											<dt>												
											</dt>
										</dl>
										<dl>
											<dd><b>风水</b><i> > </i></dd>
										</dl>								
									</div>
								</div>
							</div>
						</li>																																																																																																																												
					</ul>
				</div>	
			</div>		
			<div class="banner fl">
				<div class="flex">
					<ul class="slider">
						
						<li><img src="<%=request.getContextPath()%>/static/images/f11.jpg" height=411></li>
						<li><img src="<%=request.getContextPath()%>/static/images/f10.jpg" height=411></li>
						<li><img src="<%=request.getContextPath()%>/static/images/f9.jpg" height=411></li>
						<li><img src="<%=request.getContextPath()%>/static/images/f8.jpg" height=411></li>
						<li><img src="<%=request.getContextPath()%>/static/images/f7.jpg" height=411></li>
					</ul>
					<ul class="btn">
						<li class="prev"></li>
						<li class="next"></li> 		
					</ul>
					<ol class="dot">
						<li class="cur"></li>
						<li></li>
						<li></li>
						<li></li>
						<li></li>
					</ol>

				</div>
			</div>
			<div class="entrance fl">
				<div class="enter">
					<a href="User_xiugai?username=${user.username }"><i class="epngfix x1"></i>修改信息</a>
					<a href="#" onclick="getuser()"><i class="epngfix x2"></i>注册帐号</a>
				</div>
				<div class="enews">
					<dl class="nlist">
						<dt>玉器快报<a href="#" class="more fr">更多></a></dt>
						<dd class="pt5"><span>[公告]</span><a href="#" class="pl5">商家免费入住商城</a></dd>
						<dd><span>[特惠]</span><a href="#" class="pl5">51大优惠</a></dd>

					</dl>	
				</div>
				<div class="ebanner mt10"><img src="<%=request.getContextPath()%>/static/images/f6.jpg" width=261 height=125></div>
			</div>
		</div>
	</div>			
</body>
</html>