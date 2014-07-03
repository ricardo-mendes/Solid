package regrasDeNegocio.desconto;

import modelos.Funcionario;
import interfaces.RegraDeCalculoDeDesconto;

public class RetornaDezOuVintePorCento implements RegraDeCalculoDeDesconto{

	public double calculaDesconto(Funcionario funcionario) {
		
		// Desconto de 20 %
		if (funcionario.getSalario() >= 10000){
			return funcionario.getSalario() * 0.2;
		}
		// Desconto de 10%
		else {
			return funcionario.getSalario() * 0.1;
		}
	}

}
