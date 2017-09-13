<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>addNumber</title>
</head>
<body>
<%
	int sum = 0;
	for ( int i = 1; i <= 100; i = i + 2 )
	{
		sum += i;
	}
	out.println(sum);
%>
</body>
</html>
