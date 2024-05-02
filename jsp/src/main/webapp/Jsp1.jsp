<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<%!
		int a = 0;
		int b = 1;
		int c = 0;
	%>
	<h1><%=a%></h1>
	<h1><%=b%></h1>

	<%
		for (int i = 1; i <= 10; i++) {
			c = a + b;
			System.out.println(c);
	%>
		<h1><%=c%></h1>
	<%
		a = b;
		b = c;
	
		}
	%>

</body>
</html>