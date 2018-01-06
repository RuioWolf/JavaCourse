<%@ page contentType="text/html;charset=GB2312" language="java" %>
<%@ page import="java.sql.*"%>
<html>
<head><title>JDBC-ODBC连接SQL Server</title></head>
<% 
	Connection conn=null;
	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String strConn="jdbc:odbc:shopData";
		String strUser="sa";
		String strPassword="123456";
		conn=DriverManager.getConnection(strConn,strUser,strPassword);
		out.println("<h2>JDBC-ODBC桥连接数据库成功!</h2>");
	}
	catch(ClassNotFoundException e)
	{
		out.println(e.getMessage());
	}
	catch(SQLException e)
	{
		out.println(e.getMessage());
	}
	finally
	{
		try
		{
			if (conn!=null)
				conn.close();
		}
		catch(Exception e){}
	}
 %>
</html>
