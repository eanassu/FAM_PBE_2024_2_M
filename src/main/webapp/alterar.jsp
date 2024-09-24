<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.vemprafam.pojo.Aluno"%>
<%@page import="br.com.vemprafam.dao.DaoAluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alteração</title>
</head>
<body>
<%
int ra = Integer.parseInt(request.getParameter("ra"));
DaoAluno dao = new DaoAluno();
Aluno a = dao.buscarPeloRa(ra);
SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
String dataStr = dateFormat.format(a.getDataNascimento());
%>
<form action='Alterar' method='post'>
RA:<input type='text' name='ra' value='<%=ra%>'/><br/>
nome:<input type='text' name='nome' value='<%=a.getNome()%>'/><br/>
data de nascimento:<input type='text' name='dataNascimento' value='<%=dataStr%>'/><br/>
curso:<input type='text' name='curso' value='<%=a.getCurso()%>'/><br/>
renda:<input type='text' name='renda' value='<%=a.getRenda()%>'/><br/>
e-mail:<input type='text' name='email' value='<%=a.getEmail()%>'/><br/>
<input type='submit' value='enviar'/>
</form>

<a href='/Projeto'>voltar</a>
</body>
</html>