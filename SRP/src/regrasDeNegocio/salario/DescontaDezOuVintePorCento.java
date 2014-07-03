package regrasDeNegocio.salario;

import modelos.Funcionario;
import interfaces.RegraDeCalculoDeSalario;

public class DescontaDezOuVintePorCento implements RegraDeCalculoDeSalario{

	public double calculaSalario(Funcionario funcionario) {
		
		//Desconto de 20 %
		if (funcionario.getSalario() >= 10000)
        {
			funcionario.setSalario(funcionario.getSalario() * 0.8);
            return funcionario.getSalario();
        }
		//Desconto de 10%
        else
        {
        	funcionario.setSalario(funcionario.getSalario() * 0.9);
            return funcionario.getSalario();
        }
	}

}
