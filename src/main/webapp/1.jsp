<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Primeira página JSP</title>
</head>
<body>

<h1>Teste</h1>
<%
String msg = "Hello World!";

out.println(msg);
System.out.println("isto vai para o console");
%>

<p>Separador</p>

<%=msg %>
</body>
</html>