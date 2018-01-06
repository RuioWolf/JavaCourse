package shopBeans;
import java.sql.*;
import java.io.*;
import java.util.*;

public class ConnDB
{
	public Connection conn=null;
	public Statement stmt=null;
	public ResultSet rs=null;
	
	//ODBC版驱动及连接协议
	//private static String dbDriver="sun.jdbc.odbc.JdbcOdbcDriver";
	//private static String dbUrl="jdbc:odbc:shopData";
	//JDBC版驱动及连接协议，需要把JDBC驱动包放入对应WebContent/Web-INF/lib目录
	private static String dbDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String dbUrl="jdbc:sqlserver://192.168.1.10:1433;DatabaseName=ShopSystem";
//	private static String dbUrl="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=ShopSystem";
	private static String dbUser="sa";
	private static String dbPwd="qwer";
//	private static String dbPwd="123456";

	//打开数据库连接
	public static Connection getConnection()
	{
		Connection conn=null;
		try
		{
			Class.forName(dbDriver);
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    	if (conn == null) 
    	{
      		System.err.println("警告:数据库连接失败!");
    	}		
		return conn;
	}
	//读取结果集
	public ResultSet doQuery(String sql)
	{
		try
		{
			conn=ConnDB.getConnection();
			stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			rs=stmt.executeQuery(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rs;
	}
	//更新数据
	public int doUpdate(String sql)
	{
		int result=0;
		try
		{
			conn=ConnDB.getConnection();
			stmt=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			result=stmt.executeUpdate(sql);
		}
		catch(SQLException e)
		{
			result=0;
		}
		return result;
	}
	//关闭数据库连接
	public void closeConnection()
	{
		try
		{
			if (rs!=null)
				rs.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			if (stmt!=null)
				stmt.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
			if (conn!=null)
				conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}