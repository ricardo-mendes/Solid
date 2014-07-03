package regrasDeNegocio.desconto;

import modelos.Funcionario;
import interfaces.RegraDeCalculoDeDesconto;

public class RetornaTrintaOuQuarentaPorCento implements
		RegraDeCalculoDeDesconto {

	public double calculaDesconto(Funcionario funcionario) {

		// Desconto de 40%
		if (funcionario.getSalario() >= 20000) {
			return funcionario.getSalario() * 0.4;
		}
		// Desconto de 30%
		else {
			return funcionario.getSalario() * 0.3;
		}
	}

}
