package br.com.vemprafam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.vemprafam.pojo.Aluno;

public class DaoAluno {

	private String url="jdbc:hsqldb:hsql://localhost/";
	private String user="SA";
	private String password="";

	private Connection conn;

	public DaoAluno() {
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void inserir( Aluno aluno ) {
		String sql = "INSERT INTO ALUNOS VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, aluno.getRa());
			pstmt.setString(2, aluno.getNome());
			pstmt.setDate(3, new java.sql.Date(aluno.getDataNascimento().getTime()));
			pstmt.setString(4, aluno.getCurso());
			pstmt.setDouble(5, aluno.getRenda());
			pstmt.setString(6, aluno.getEmail());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void atualizar( Aluno aluno ) {
		String sql = "UPDATE ALUNOS SET NOME=?,DATANASCIMENTO=?,CURSO=?,RENDA=?,EMAIL=? WHERE RA=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, aluno.getNome());
			pstmt.setDate(2, new java.sql.Date(aluno.getDataNascimento().getTime()));
			pstmt.setString(3, aluno.getCurso());
			pstmt.setDouble(4, aluno.getRenda());
			pstmt.setString(5, aluno.getEmail());
			pstmt.setInt(6, aluno.getRa());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excluir( Aluno aluno ) {
		String sql = "DELETE FROM ALUNOS WHERE RA=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, aluno.getRa());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Aluno> getLista() {
		String sql = "SELECT * FROM ALUNOS";
		List<Aluno> result = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int ra = rs.getInt(1);
				String nome = rs.getString(2);
				Date dataNascimento = rs.getDate(3);
				String curso = rs.getString(4);
				Double renda = rs.getDouble(5);
				String email = rs.getString(6);
				result.add(new Aluno(ra,nome,dataNascimento,curso,renda,email));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return result;
	}

	public Aluno buscarPeloRa(int ra) {
		String sql = "SELECT * FROM ALUNOS WHERE RA=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ra);
			ResultSet rs = pstmt.executeQuery();
			if ( rs.next() ) {
				String nome = rs.getString(2);
				Date dataNascimento = rs.getDate(3);
				String curso = rs.getString(4);
				Double renda = rs.getDouble(5);
				String email = rs.getString(6);
				return new Aluno(ra,nome,dataNascimento,curso,renda,email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		DaoAluno dao = new DaoAluno();
		System.out.println(dao.buscarPeloRa(10));
	}
}
