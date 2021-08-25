package Clases;

public class Funcionario {
	
	private String nome;
	private int cpf;
	private float percentualSobVendas;
	private int totalVendas;
	
	
	public Funcionario(String nome, int cpf, float percentualSobVendas, int totalVendas) {
		this.nome = nome;
		this.cpf = cpf;
		this.percentualSobVendas = percentualSobVendas;
		this.totalVendas = totalVendas;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public float getPercentualSobVendas() {
		return percentualSobVendas;
	}


	public void setPercentualSobVendas(float percentualSobVendas) {
		this.percentualSobVendas = percentualSobVendas;
	}


	public int getTotalVendas() {
		return totalVendas;
	}


	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}
	
	
}
