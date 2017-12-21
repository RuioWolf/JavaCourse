<%@page contentType="text/html;charset=utf-8" import="java.sql.*" %>
<html>
<head>
<title>商品搜索结果</title>
<style type="text/css">
<!--
.style1 {font-size: 15px}
.style2 {color: #FF0000}
-->
</style>
</head>
<body>
<jsp:include page="search.jsp"/>
<% 
	Connection conn=null;
	ResultSet rsAll=null;
	Statement stmt=null;
	request.setCharacterEncoding("utf-8");
 	try
	{ 
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String strConn="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=ShopSystem";
		String strUser="sa";
		String strPassword="123456";
		conn=DriverManager.getConnection(strConn,strUser,strPassword); 
		//ODBC驱动连接
		/* Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String strConn="jdbc:odbc:shopData";
		String strUser="sa";
		String strPassword="123456";
		conn=DriverManager.getConnection(strConn,strUser,strPassword); */
		
		stmt=conn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String strItem=request.getParameter("item");
		String strContent=request.getParameter("content");
		
		String sessionItem=(String)session.getAttribute("item");
		String sessionContent=(String)session.getAttribute("content");
		String strSql="";//用于构建SQL语句的变量

		
		out.print(strSql);//执行查询前一定要先检查构建的SQL语句是否有错
		
		rsAll=stmt.executeQuery(strSql);
		
	 } 
	catch(Exception e)
	{
		e.printStackTrace();
	}
 %>
<table width="80%" border=1 cellspacing="0" align="center">
<tr>
	<td><font size="2" color="#0000FF">商品编号</font></td>
	<td><font size="2" color="#0000FF">商品名称</font></td>
	<td><font size="2" color="#0000FF">商品类别</font></td>
	<td><font size="2" color="#0000FF">商品价格</font></td>
	<td><font size="2" color="#0000FF">商品数量</font></td>
	<td><font size="2" color="#0000FF">上架日期</font></td>
</tr>
<%
//处理分页过程


 %>
 <tr>
 <td><font size="2"><%= rsAll.getString("p_id") %></font></td>
 <td><font size="2"><%= rsAll.getString("p_name") %></font></td>
 <td><font size="2"><%= rsAll.getString("p_type") %></font></td>
 <td><font size="2"><%= rsAll.getFloat("p_price") %></font></td>
 <td><font size="2"><%= rsAll.getInt("p_quantity") %></font></td>
 <td><font size="2"><%= rsAll.getString("p_time") %></font></td>
 <td><a href="#"><font size="2">详情</font></a></td>
 <td><a href="#"><font size="2">购买</font></a></td>
 </tr>
 <%
		try
		{
			if(!rsAll.next()){break;}
		}catch(Exception e){}
	}
%>
</table>
<p align="center"><font size="2">跳转到:<input type="text" name="page" size="3">当前页数：[<%=currentPage%>/<%=maxPage%>]&nbsp;
<%  //根据当前页面序号，生成对应超链接***超链接？和=前后一定不要加空格***
	if(currentPage>1)
	{
%>
	<a href="search_result.jsp?page=1">第一页</a>　<a href="search_result.jsp?page=<%=currentPage-1%>">上一页</a>
<%
	}
	if(currentPage<maxPage)
	{
%>

<%
	}
	rsAll.close();
	stmt.close();
	conn.close();
%>
</font></p>
</body>
</html>

