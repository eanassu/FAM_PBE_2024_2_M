<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix='fam'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://code.jquery.com/ui/1.14.0/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script src="https://code.jquery.com/ui/1.14.0/jquery-ui.js"></script>
<title>Formul�rio</title>
</head>
<body>
<form action='Cadastrar' method='post'>
RA:<input type='text' name='ra'/><br/>
nome:<input type='text' name='nome'/><br/>
data de nascimento:<fam:campoData id='dataNascimento'/><br/>
curso:<input type='text' name='curso'/><br/>
renda:<input type='text' name='renda'/><br/>
e-mail:<input type='text' name='email'/><br/>
<input type='submit' value='enviar'/>
</form>

<a href='/Projeto'>voltar</a>

</body>
</html>