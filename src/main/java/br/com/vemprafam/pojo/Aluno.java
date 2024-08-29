package br.com.vemprafam.pojo;

import java.util.Date;

public class Aluno {

	private int ra;
	private String nome;
	private Date dataNascimento;
	private String curso;
	private Double renda;
	private String email;
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aluno(int ra, String nome, Date dataNascimento, String curso, Double renda, String email) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.curso = curso;
		this.renda = renda;
		this.email = email;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Double getRenda() {
		return renda;
	}
	public void setRenda(Double renda) {
		this.renda = renda;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", curso=" + curso
				+ ", renda=" + renda + ", email=" + email + "]";
	}
	public static void main(String[] args) {
		Aluno a = new Aluno();
		System.out.println(a);
	}
	
}
