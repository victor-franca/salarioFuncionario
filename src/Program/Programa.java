package Program;


import Clases.FuncionarioComissionado;
import Clases.FuncionarioComissionadoBase;

public class Programa {

	public static void main(String[] args) {
		FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Pedro", 45286396, 10, 50000);
		FuncionarioComissionadoBase funcionarioComissionadoBase = new FuncionarioComissionadoBase("Julio", 58296331, 10, 50000, 2000);
		
		
		System.out.println("Salario Funcionario Comissionado: "+funcionarioComissionado.getSalario());
		System.out.println("Salario Comisssionado Base: "+funcionarioComissionadoBase.getSalario());
	}

}
