<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.util.Vector"%>
<%@ page import="shopBeans.CartBean"%>
<%@ page import="shopBeans.ConnDB"%>
<html> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加购物车</title>
</head>
<body>
<%
request.setCharacterEncoding("utf-8");
	String p_id=request.getParameter("p_id");
	Vector cart=(Vector)session.getAttribute("cart");
	CartBean cb=new CartBean();
	cart=cb.addCart(p_id,cart);
	if(cart!=null)
	{
		session.setAttribute("cart",cart);
		response.sendRedirect("my_cart.jsp");
	}

%>
