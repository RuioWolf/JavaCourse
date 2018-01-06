function check_name(form)
{
	if(form.c_name.value=="")
	{
		alert("请输入用户名！");
		form.c_name.focus();
		return false;
	}
	if(form.c_name.value.length<6 || form.c_name.value.length>20)
	{
		alert("用户名长度必须在6至20个字符之间！");
		form.c_name.focus();
		return false;
	}
}
function check_info(form)
{
	if(form.c_pass.value=="")
	{
		alert("请输入密码！");
		form.c_pass.focus();
		return false;
	}
	if(form.c_pass2.value=="")
	{
		alert("请输入确认密码！");
		form.c_pass2.focus();
		return false;
	}
	if(form.c_pass2.value != form.c_pass.value)
	{
		alert("密码和确认密码不一致！");
		form.c_pass2.focus();
		return false;
	}
	if(form.c_phone.value=="")
	{
		alert("请输入电话号码！");
		form.c_phone.focus();
		return false;
	}
	if(form.c_phone.value.length>15)
	{
		alert("电话号码长度大于15个字符");
		form.c_phone.focus();
		return false;
	}
	if(isNaN(form.c_phone.value) || form.c_phone.value.indexOf('.',0)!=-1)
	{
		alert("电话号码不是数字或者有小数！");
		form.c_phone.focus();
		return false;
	}	
	if(form.c_question.value=="")
	{
		alert("请输入问题！");
		form.c_question.focus();
		return false;
	}
	if(form.c_answer.value=="")
	{
		alert("请输入答案！");
		form.c_answer.focus();
		return false;
	}
	if(form.c_email.value.indexOf("@")==-1 ||(form.c_email.value.indexOf(".")==-1))
	{
		alert("错误的E-mail格式！");
		form.c_email.focus();
		return false;
	}
}