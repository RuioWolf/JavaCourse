<%@ page language="java" contentType="text/html; charset=utf-8"%> 
<style type="text/css">
<!--
.STYLE10 {
	font-size: 14px;
	color: #FF0000;
}
-->
</style>
<%
session.removeAttribute("c_name");
session.removeAttribute("c_header");
session.invalidate();
out.println( "<HTML><HEAD><META http-equiv='refresh' content='2; URL=index.jsp' target=Main></HEAD><BODY bgcolor='#FFFFFF'></body></html>");
%>
<br /><br /><br /><br /><br /><br /><br /><br />
<center>
	  <table width="300" border="1" bordercolor="#99CCFF" style="border-collapse:collapse" cellpadding="0" cellspacing="0">
	  <!--DWLayoutTable-->
	  <tr bgcolor="#99CCFF">
		<td height="13">&nbsp;</td>
	    </tr>
	  <tr>
		<td height="60" align="center"><span class="STYLE10">正在退出，请稍候...</span></td>
	    </tr>
   </table>
</center>

