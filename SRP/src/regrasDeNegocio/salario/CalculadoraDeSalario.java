package regrasDeNegocio.salario;

import modelos.Funcionario;

public class CalculadoraDeSalario {
	
	public static double calculaSalario(Funcionario funcionario){
		
		return funcionario.calculaSalario();
		//return funcionario.getCargo().getRegra().calculaSalario(funcionario);
		
	}
}
