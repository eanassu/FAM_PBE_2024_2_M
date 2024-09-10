package br.com.vemprafam.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.vemprafam.dao.DaoAluno;
import br.com.vemprafam.pojo.Aluno;

/**
 * Servlet implementation class ServletTabela
 */
@WebServlet("/Tabela")
public class ServletTabela extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTabela() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		DaoAluno dao = new DaoAluno();
		List<Aluno> lista = dao.getLista();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Tabela</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<table border='1'>\r\n"
				+ "<tr>\r\n"
				+ "	<th>RA</th><th>nome</th><th>data nasc.</th><th>curso</th><th>renda</th><th>e-mail</th>\r\n"
				+ "</tr>");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		for( Aluno a:lista ) {
			out.println("<tr>\r\n"
					+ "	<td>"+a.getRa()+"</td><td>"+a.getNome()+"</td><td>"+ dateFormat.format( a.getDataNascimento())+"</td>"
					+ "<td>"+a.getCurso()+"</td><td>"+ numberFormat.format( a.getRenda())+"</td><td>"+a.getEmail()+"</td>\r\n"
					+ "</tr>");
		}
		out.println("</table>\r\n"
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
