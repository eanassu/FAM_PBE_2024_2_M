package br.com.vemprafam.pojo;

import java.util.Date;

public class Funcionario {
    private int re;
    private String nome;
    private Double salario;
    private Date dataAdmissao;
    private String email;
	public Funcionario() {
		super();
	}
	public Funcionario(int re, String nome, Double salario, Date dataAdmissao, String email) {
		super();
		this.re = re;
		this.nome = nome;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.email = email;
	}
	public int getRe() {
		return re;
	}
	public void setRe(int re) {
		this.re = re;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Funcionario [re=" + re + ", nome=" + nome + ", salario=" + salario + ", dataAdmissao=" + dataAdmissao
				+ ", email=" + email + "]";
	}


}
