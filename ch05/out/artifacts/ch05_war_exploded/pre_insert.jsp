<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/6
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.Date" %>
<html>
<head>
    <title>成功添加商品信息</title>
</head>
<body>
<%--<%@ include file="convert.jsp"%>--%>
<%
    Connection conn=null;
    try {
        request.setCharacterEncoding("utf-8");
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String strConn="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=ShopSystem";
        String strUser = "sa";
        String strPassword = "123456";
        conn = DriverManager.getConnection(strConn, strUser, strPassword);
        String p_id = request.getParameter("p_id");
        String p_type = request.getParameter("p_type");
        String p_name = request.getParameter("p_name");
        float p_price = Float.parseFloat(request.getParameter("p_price"));
        int p_quantity = Integer.parseInt("p_quantity");
        String p_image = request.getParameter("p_image");
        String p_description = (request.getParameter("p_description"));
        Date date = new Date();
        String p_time = String.valueOf(date.getMonth() + 1) + "-" + date.getDate() + "-20" + String.valueOf(date.getYear()).substring(1);
        String strSql = "insert into product values(?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = conn.prepareStatement(strSql);
        pstmt.setString(1,p_type);
        pstmt.setString(2,p_id);
        pstmt.setString(3,p_name);
        pstmt.setFloat(4,p_price);
        pstmt.setInt(5,p_quantity);
        pstmt.setString(6,p_image);
        pstmt.setString(7,p_description);
        pstmt.setString(8,p_time);
        int intTemp = pstmt.executeUpdate();
        if (intTemp != 0) {
            out.println("<center><h3>" + "商品添加成功" + "</h3></center>");
        } else {
            out.println("<center><h3>" + "商品添加失败" + "</h3></center>");
        }
        String strSql2 = "SELECT TOP 5 p_id,p_type,p_name,p_price,p_quantity FROM product WHERE p_type=? order by p_time asc";
        PreparedStatement pstmt2 = conn.prepareStatement(strSql2);
        pstmt2.setString(1, "电视机系列");
        ResultSet rs=pstmt2.executeQuery();

%>
<table border="1" align="center">
    <tr>
        <th>商品编号</th>
        <th>商品类别</th>
        <th>商品名称</th>
        <th>商品单价</th>
        <th>商品数量</th>
    </tr>
    <% while (rs.next()){ %>
    <tr bgcolor="#add8e6">
        <td><%=rs.getString("p_id")%></td>
        <td><%=rs.getString("p_type")%></td>
        <td><%=rs.getString("p_name")%></td>
        <td><%=rs.getString("p_price")%></td>
        <td><%=rs.getString("p_quantity")%></td>
    </tr>
    <% } %>
</table>
<%
        pstmt.close();
        pstmt2.close();
        conn.close();
    } catch (Exception e) {
        out.println(e.toString());
    }
%>
</body>
</html>
