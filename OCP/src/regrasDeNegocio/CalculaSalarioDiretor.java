package regrasDeNegocio;

import modelos.Funcionario;
import interfaces.CalculaSalarioBase;

public class CalculaSalarioDiretor implements CalculaSalarioBase {

	public double calculaSalario(Funcionario funcionario) {
		
		funcionario.setSalario(20000);
		return funcionario.getSalario();
		
	}

}
