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
			$.ajax({
				type : "get",
				url : "user_Loginvalidate",
				success : function(data) {
					if(data==1){
						alert("请先登录!!");
					}else{
						alert("请先登录!!");
					}
				}
			});		
		}
	</script>
</head>
<body>
	<div class="top">
		<div class="topnav clear">
			<div class="user-entry">
				您好，欢迎来到
				<b>玉器商城</b>&nbsp;&nbsp;
				[<a href="user_Login">登录</a>]&nbsp;&nbsp;
				[<a href="registers">注册</a>]
			</div>
			<ul class="quick-menu">
				<li class="user-center">
					<div class="menu">
						<a href="#" onclick="getuser()">我的商城</a>
						<i class="arrow"></i>
						
					</div>
					<span class="hline"></span>
					<div class="menu-bd menu-bdp">
						<ul>
							<li><a href="#" onclick="getuser()">个人主页</a></li>
						</ul>
					</div>
				</li>
				<li class="user-center">
					<div class="menu">
						<a href="#" onclick="getuser()">卖家中心</a>
						<i class="arrow"></i>
						<span class="hline"></span>
					</div>
					<div class="menu-bd menu-bdp">
						<ul>
							<li><a href="#" onclick="getuser()">上架商品</a></li>
							<li><a href="#" onclick="getuser()">下架商品</a></li>
						</ul>
					</div>
				</li>				
				<li class="user-center">
					<div class="menu">
						<a href="#" onclick="getuser()">我的订单</a>					
						<span class="hline"></span>
					</div>
				</li>
				<li class="user-center">
					<div class="menu">
						<a href="#" onclick="getuser()">我的收藏</a>
						<i class="arrow"></i>
						<span class="hline"></span>
					</div>
					<div class="menu-bd">
						<ul>
							<li><a href="#" onclick="getuser()">收藏的商品</a></li>
						</ul>
					</div>
				</li>
				<li class="user-center">
					<div class="menu">
						<a href="#" onclick="getuser()">站内消息</a>
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
							<li><a href="user_help">帮助</a></li>
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
				<a href="#" onclick="getuser()">我的购物车</a>
			</div>
		</div>
	</div>
	<div class="dtw">
		<div class="dtww clear">
			<div class="dt fl">
				<a href="list.html">全部商品分类</a>
			</div>
			<ul class="navbar fl">
				<li><a href="#">首页</a></li>
				<li><a href="#" onclick="getuser()">购买留言</a></li>
				<li><a href="#" onclick="getuser()">询问商品</a></li>
				<li><a href="user_help">帮助</a></li>
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
						
						<li><img src="<%=request.getContextPath()%>/static/images/f2.jpg" height=411></li>
						<li><img src="<%=request.getContextPath()%>/static/images/f1.jpg" height=411></li>
						<li><img src="<%=request.getContextPath()%>/static/images/f3.jpg" height=411></li>
						<li><img src="<%=request.getContextPath()%>/static/images/f4.jpg" height=411></li>
						<li><img src="<%=request.getContextPath()%>/static/images/f5.jpg" height=411></li>
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
					<a href="user_Login"><i class="epngfix x1"></i>会员登录</a>
					<a href="userRegisters"><i class="epngfix x2"></i>免费注册</a>
					<a href="shopRegisters"><i class="epngfix x3"></i>商家开店</a>
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
	<div id="faq">
		<ul class="s1">
			<h3>帐户管理</h3>
			<li><a href="#" title="如何安全登录"> 如何安全登录 </a></li>
			<li><a href="#" title="忘记密码"> 忘记密码 </a></li>
			<li><a href="#" title="修改个人资料"> 修改个人资料 </a></li>
			<li><a href="#" title="账户注册"> 账户注册 </a></li>
		</ul>
		<ul class="s2">
			<h3>卖家服务</h3>
			<li><a href="#" title="关于商城VIP店铺各类型活动币解释说明"> 关于商城VIP店 </a></li>
			<li><a href="#" title="淘宝商品导入教程"> 淘宝商品导入 </a></li>
			<li><a href="#" title="什么是金币？"> 什么是金币？ </a></li>
			<li><a href="#" title="开店前准备"> 开店前准备 </a></li>
			<li><a href="#" title="如何申请开店"> 如何申请开店 </a></li>
		</ul>
		<ul class="s3">
			<h3>消费者保障</h3>
			<li><a href="#" title="店连店商城VIP店铺消费者保障服务协议"> XXX商城VIP </a></li>
			<li><a href="#" title="消费者保障服务"> 消费者保障服 </a></li>
			<li><a href="#" title="商城消费者保障服务协议"> 商城消费者保 </a></li>
			<li><a href="#" title="退款申请"> 退款申请 </a></li>
			<li><a href="#" title="返修/退换货"> 返修/退换货 </a></li>
		</ul>
		<ul class="s4">
			<h3>支付方式      </h3>
			<li><a href="#" title="账户余额支付"> 账户余额支付 </a></li>
			<li><a href="#" title="渤海易生"> 渤海易生 </a></li>
			<li><a href="#" title="网银在线"> 网银在线 </a></li>
			<li><a href="#" title="财付通"> 财付通 </a></li>
			<li><a href="#" title="公司转账"> 公司转账 </a></li>
		</ul>
		<ul class="s5">
			<h3>特色服务      </h3>
			<li><a href="#" title="店铺优惠券"> 店铺优惠券 </a></li>
		</ul>
		<ul class="s6">
			<h3>XXX介绍      </h3>
			<li><a href="#" title="关于我们"> 关于我们 </a></li>
			<li><a href="#" title="招聘英才"> 招聘英才 </a></li>
			<li><a href="#" title="联系我们"> 联系我们 </a></li>
			<li><a href="#" title="消费保障"> 消费保障 </a></li>
		</ul>
		<div class="clear"></div>
	</div>
</body>
</html>