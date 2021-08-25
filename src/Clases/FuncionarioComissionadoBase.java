package Clases;

public class FuncionarioComissionadoBase extends Funcionario {
	
	private float valorBase;

	public FuncionarioComissionadoBase(String nome, int cpf, float percentualSobVendas, int totalVendas,
			float valorBase) {
		super(nome, cpf, percentualSobVendas, totalVendas);
		this.valorBase = valorBase;
	}

	public float getValorBase() {
		return valorBase;
	}

	public void setValorBase(float valorBase) {
		this.valorBase = valorBase;
	}
	
	public float getSalario () {
		return (getTotalVendas()*getPercentualSobVendas()/100)+getValorBase();
	}

}
