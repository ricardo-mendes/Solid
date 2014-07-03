package regrasDeNegocio;

import modelos.Funcionario;
import interfaces.CalculaSalarioBase;

public class CalculaSalarioGerente implements CalculaSalarioBase {

	public double calculaSalario(Funcionario funcionario) {
		
		funcionario.setSalario(10000);
		return funcionario.getSalario();
		
	}
	
}
