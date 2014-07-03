package regrasDeNegocio.salario;

import modelos.Funcionario;
import interfaces.RegraDeCalculoDeSalario;

public class DescontaTrintaOuQuarentaPorCento implements RegraDeCalculoDeSalario{

	public double calculaSalario(Funcionario funcionario) {
		
		//Desconto de 40%
		if (funcionario.getSalario() >= 20000)
        {
			funcionario.setSalario(funcionario.getSalario() * 0.6);
            return funcionario.getSalario();
        }
		//Desconto de 30%
        else
        {
        	funcionario.setSalario(funcionario.getSalario() * 0.7);
            return funcionario.getSalario();
        }
	}

}
