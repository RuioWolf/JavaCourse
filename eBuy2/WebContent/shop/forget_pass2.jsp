<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="shopBeans.ConnDB" %> 
<%@ page import="java.sql.*" %>
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
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: underline;
}
a:active {
	text-decoration: none;
}
.STYLE3 {color: #FF0000; font-size: 12px; }
-->
</style>
<script language="javascript">
<!--
		function check_answer(form)
		{
			if(form.c_answer.value=="")
			{
				alert("请输入问题的答案");
				form.c_answer.focus();
				return false;
			}
		}
-->
</script>
</head>
<body>
<% 
	String c_name=request.getParameter("c_name");
	if(c_name=="" || c_name==null)
	{
		out.println("<script language='javascript'>alert('请先登录!');window.location.href='index.jsp';</script>");
	}
	ConnDB con=new ConnDB();
	String sql="select * from customer where c_name='"+c_name+"'";
	ResultSet rs=con.doQuery(sql);
	if(!rs.next())
	{
		out.println( "<HTML><HEAD><META http-equiv='refresh' content='2; URL=forget_pass.jsp' target=Main></HEAD><BODY bgcolor='#FFFFFF'></body></html>");
 %>
 <br /><br /><br /><br /><br /><br /><br /><br />
 <center>
	  <table width="300" border="1" bordercolor="#99CCFF" style="border-collapse:collapse" cellpadding="0" cellspacing="0">
	  <!--DWLayoutTable-->
	  <tr bgcolor="#99CCFF">
		<td height="13">&nbsp;</td>
	    </tr>
	  <tr>
		<td height="60" align="center"><span class="STYLE10">此用户名不存在<span class="STYLE3">！</span>返回重新输入<span class="STYLE3">！</span></span></td>
	    </tr>
   </table>
</center>
 <% 
 	}
 	else
 	{
  %>
<jsp:include page="title.jsp" flush="true"/>
<jsp:include page="menu.jsp" flush="true"/>
<jsp:include page="explain.html" flush="true"/>
<center>
<form action="forget_pass3.jsp?c_name=<%= c_name %>" method="post" onSubmit="return check_answer(this);">
<table width="415" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td height="36" colspan="2" align="center" valign="top"><span class="STYLE10">eBuy电子商务系统－－密码查询</span> </td>
  </tr>
  <tr>
    <td width="140" align="right"><span class="STYLE1">提示问题</span>：</td>
	<td width="275" height="34" align="left"><input type="text" name="c_question" value="<%= rs.getString("c_question") %>" size="25"  /></td>
  </tr>
  <tr>
    <td height="34" align="right"><span class="STYLE1">提示答案</span>：</td>
	<td height="34" align="left"><input type="text" name="c_answer" value="" size="25" /></td>
  </tr>
  <tr>
    <td height="13" colspan="2" align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="Submit" type="submit" class="STYLE1" value=" 确定 "  />&nbsp;<input type="button" class="STYLE1" value=" 返回 " onClick="history.go(-1);" /></td>
  </tr>
  <tr>
    <td height="13" colspan="2">&nbsp;</td>
  </tr>
</table>
</form>
<jsp:include page="copyright.jsp" flush="true"/>
</center>
</body>
</html>
<% } %>