package Clases;

public class FuncionarioComissionado extends Funcionario {

	public FuncionarioComissionado(String nome, int cpf, float percentualSobVendas, int totalVendas) {
		super(nome, cpf, percentualSobVendas, totalVendas);		
	}
	
	
	public float getSalario() {
		return getTotalVendas()*getPercentualSobVendas()/100;
	}
	
}
