package br.com.vemprafam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.vemprafam.dao.DaoAluno;
import br.com.vemprafam.pojo.Aluno;

/**
 * Servlet implementation class ServletAlteracao
 */
@WebServlet("/Alterar")
public class ServletAlteracao extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAlteracao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ra = Integer.parseInt(request.getParameter("ra"));
		String nome = request.getParameter("nome");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimento;
		try {
			dataNascimento = dateFormat.parse(request.getParameter("dataNascimento"));
		} catch (ParseException e) {
			dataNascimento = new Date();
		}
		String curso = request.getParameter("curso");
		Double renda = Double.parseDouble(request.getParameter("renda"));
		String email = request.getParameter("email");
		Aluno aluno = new Aluno(ra,nome,dataNascimento,curso,renda,email);
		DaoAluno dao = new DaoAluno();
		dao.atualizar(aluno);
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Resultado</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<h1>Resultado</h1>\r\n"
				+ "\r\n"
				+ "<p>Alterado</p>\r\n"
				+ "<a href='/Projeto'>voltar</a>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
