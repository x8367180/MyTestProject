<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<!-- start: Meta -->
	<meta charset="utf-8">
	
	
	<%@include file="../../../style/style.jsp"%>
	<!-- start: CSS -->
	<link id="bootstrap-style" href="static/janux/css/bootstrap.min.css" rel="stylesheet">
	<link href="static/janux/css/bootstrap-responsive.min.css" rel="stylesheet">
	<link id="base-style" href="static/janux/css/style.css" rel="stylesheet">
	<link id="base-style-responsive" href="static/janux/css/style-responsive.css" rel="stylesheet">
	<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800&subset=latin,cyrillic-ext,latin-ext' rel='stylesheet' type='text/css'>
	<!-- end: CSS -->

	<!-- start: Favicon -->
	<link rel="shortcut icon" href="static/janux/img/favicon.ico">
	<!-- end: Favicon -->
	<!-- start: Mobile Specific -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- end: Mobile Specific -->
	<style type="text/css">
		body { background: url(static/janux/img/bg-login.jpg) !important; }
		.form{background: rgba(255,255,255,0.2);width:400px;margin:100px auto;}  
            #login_div{display: block;}  
            #register_div{display: none;}  
            .fa{display: inline-block;top: 27px;left: 6px;position: relative;color: #ccc;}  
            input[type="text"],input[type="password"]{padding-left:26px;}  
            .checkbox{padding-left:21px;}
	</style>
	<script type="text/javascript">
	
	$(function() {
		$.ajax({
			url : '${basePath}/checkUser',
			data : {},
			type:'post',
			dataType:'json',
			success : function(data) {
				alert("aaaa"+data[0].key);
				var dataArray = eval('(' + data[0].key + ')');
				alert(dataArray[0]);
			},
			error : function(){
				alert("异常");
			}
		});
		
	});
	
	</script>
</head>
<body>
<div class="container-fluid-full col-sm-offset-3 col-md-offset-3">
		<div class="row-fluid">
			<div class="row-fluid">
				<div class="login-box" id="login_div">
					<div class="icons">
						<a href="index.jsp"><i class="halflings-icon home"></i></a>
						<a href="#"><i class="halflings-icon cog"></i></a>
					</div>
					<h2>登录</h2>
					<form class="form-horizontal" action="index.jsp" method="post" id="login_form">
						<fieldset>
							
							<div class="input-prepend" title="Username">
								<span class="add-on"><i class="halflings-icon user"></i></span>
								<input class="input-large span10" name="loginname" id="loginname" value="" type="text" placeholder="请输入用户名"/>
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend" title="Password">
								<span class="add-on"><i class="halflings-icon lock"></i></span>
								<input class="input-large span10" name="loginpassword" id="loginpassword" type="password" placeholder="请输入密码"/>
							</div>
							<div class="clearfix"></div>
							
							<label class="remember" for="remember"><input type="checkbox" id="remember" />记住我</label>
							
							<div class="button-login">	
								<a onclick="severCheck();" id="login_btn" class="btn btn-primary">登录</a> 
								<a href="javascript:;" id="register_btn" class="btn btn-primary">注册</a> 
							</div>
							<div class="clearfix"></div>
					</form>
					<hr>
					<h3>忘记密码?</h3>
					<p>
						<a href="#">点击这里</a> 找回密码.
					</p>	
				</div><!--/span-->
			</div><!--/row-->
			
			<!-- 注册form -->
			<div class="row-fluid">
				<div class="login-box"  id="register_div">
					<div class="icons">
						<a href="index.jsp"><i class="halflings-icon home"></i></a>
						<a href="#"><i class="halflings-icon cog"></i></a>
					</div>
					<h2>注册</h2>
					<form class="form-horizontal" action="index.jsp" method="post" id="register_form">
						<fieldset>
							
							<div class="input-prepend" title="Username">
								<span class="add-on"><i class="halflings-icon user"></i></span>
								<input class="input-large span10" name="username" id="username" type="text" placeholder="请输入用户名"/>
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend" title="Password">
								<span class="add-on"><i class="halflings-icon lock"></i></span>
								<input class="input-large span10" name="password" id="password" type="password" placeholder="请输入密码"/>
							</div>
							<div class="clearfix"></div>
							
							<div class="input-prepend" title="RePassword">
								<span class="add-on"><i class="halflings-icon white chevron-up"></i></span>
								<input class="input-large span10" name="repassword" id="repassword" type="password" placeholder="请再次输入密码"/>
							</div>
							<div class="clearfix"></div>
							
							<div class="input-prepend" title="RePassword">
								<span class="add-on"><i class="halflings-icon envelope"></i></span>
								<input class="input-large span10" name="email" id="email" type="text" placeholder="邮箱"/>
							</div>
							<div class="clearfix"></div>
							
							<div class="button-login">	
								<a href="javascript:;" id="back_btn" class="btn btn-primary">注册</a> 
							</div>
							<div class="clearfix"></div>
					</form>
				</div><!--/span-->
			</div>
			<!-- 注册form end -->

	</div><!--/.fluid-container-->
	
		</div><!--/fluid-row-->
	    <div class="common-modal modal fade" id="common-Modal1" tabindex="-1" role="dialog" aria-hidden="true">
			<div class="modal-content">
				<ul class="list-inline item-details">
					<li><a href="http://themifycloud.com">Admin templates</a></li>
					<li><a href="http://themescloud.org">Bootstrap themes</a></li>
				</ul>
			</div>
		</div>
</body>
</html>
