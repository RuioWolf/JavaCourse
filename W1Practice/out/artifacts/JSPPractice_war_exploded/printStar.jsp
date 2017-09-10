<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>W1Practice</title>
</head>
<body>
<center>
	<%
		String kg, xh;
		int k = 0, h = 5;
		for ( int i = 1; i <= h; ++i )
		{
			kg = "";
			xh = "";
			k = h - i;
			while ( kg.length() < k * 6 )
			{
				kg += "&nbsp;";
			}
			while ( xh.length() < 2 * i - 1 )
			{
				xh += "*";
			}
//			out.println(kg + xh + "</br>");
			out.println(xh + "</br>");
		}
	%>
</center>
</body>
</html>
