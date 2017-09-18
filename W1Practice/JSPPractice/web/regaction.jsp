<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/09/13 0013
  Time: 下午 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>
姓名：<%=request.getParameter("name")%><br>
性别：
<%
	if ( request.getParameter("sex")!=null && request.getParameter("sex").indexOf("male")>=0 )
	{
		out.print("男");
	}
	if ( request.getParameter("sex")!=null && request.getParameter("sex").indexOf("female")>=0 )
	{
		out.print("女");
	}
%><br>
出生年月：
<%
	String birthday=request.getParameter("year")+"年"+ request.getParameter("month")+"月"+request.getParameter("day")+"日";
	out.print(birthday);
%><br>
籍贯：
<%
	String place=request.getParameter("province")+"省"+ request.getParameter("city")+"市"+request.getParameter("area")+"区";
	out.print(place);
%><br>
目前专业：<%=request.getParameter("major")%><br>
学习年限：<%=request.getParameter("studyyears")%><br>
生源地：<%=request.getParameter("where")%><br>
政治面貌：
<%
String who= request.getParameter("who");
if ( who!=null && who.indexOf("qunzhong")>=0)
	out.print("群众");
if ( who!=null && who.indexOf("tuanyuan")>=0)
	out.print("共青团团员");
if ( who!=null && who.indexOf("dangyuan")>=0)
	out.print("党员");
%><br>
爱好：
<%
	if (request.getParameter("music")!=null)
		out.print("音乐 ");
	if (request.getParameter("sports")!=null)
		out.print("运动 ");
	if (request.getParameter("reading")!=null)
		out.print("读书 ");
	if (request.getParameter("game")!=null)
		out.print("游戏 ");
%>
<center>
	IP ADDRESS: <%out.print(request.getRemoteHost());%>
	REQUEST URL: <%out.print(request.getRequestURI());%>
</center>
</body>
</html>
