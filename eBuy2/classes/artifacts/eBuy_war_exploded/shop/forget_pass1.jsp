<%@ page contentType="text/html;charset=utf-8" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Easy Buy Online</title>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE10 {
	font-size: 14px;
	color: #FF0000;
}
.STYLE3 {color: #FFFFFF}
-->
</style>
<script language="javascript">
<!--
		function check_name(form)
		{
			if(form.c_name.value=="")
			{
				alert("请输入您的用户名");
				form.c_name.focus();
				return false;
			}
		}
-->
</script>
</head>

<body>
<center>
<form action="forget_pass2.jsp" method="post" onSubmit="return check_name(this);">
<table width="782" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td height="40" colspan="3" align="center"><span class="STYLE10">eBuy电子商务系统－－密码查询</span> </td>
  </tr>
  <tr>
    <td height="20" colspan="3" align="center"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td width="322" align="right"><span class="STYLE1">请输入您的用户名</span>：</td>
	<td width="195" height="34" align="left"><input type="text" name="c_name" value="" /></td>
    <td width="265" align="left"><input name="Submit" type="submit" class="STYLE1" value=" 确定 "  /></td>
  </tr>
  <tr>
    <td height="34" colspan="3" align="left"><!--DWLayoutEmptyCell-->&nbsp;</td>
	</tr>
</table>
</form>
</center>
</body>
</html>
