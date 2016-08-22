$(function() {
			$("#register_btn").click(function() {
						$("#register_div").css("display", "block");
						$("#login_div").css("display", "none");
					});
			$("#back_btn").click(function() {
						$("#register_div").css("display", "none");
						$("#login_div").css("display", "block");
					});
		});
// 登录
function severCheck() {
	var login_btn = document.getElementById("login_btn");
	
	if (check()) {
		
	}
}
// 客户端校验
function check() {
	if ($("#loginname").val() == "") {

		$("#loginname").tips({
					side : 2,
					msg : '用户名不得为空',
					bg : '#AE81FF',
					time : 3
				});

		$("#loginname").focus();
		return false;
	}

	if ($("#loginpassword").val() == "") {

		$("#loginpassword").tips({
					side : 2,
					msg : '密码不得为空',
					bg : '#AE81FF',
					time : 3
				});

		$("#loginpassword").focus();
		return false;
	}
	
	
	return true;
}