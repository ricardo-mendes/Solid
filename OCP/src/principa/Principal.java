package principa;

import regrasDeNegocio.CalculaSalarioDiretor;
import modelos.Cargo;
import modelos.Funcionario;

public class Principal {
	
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setCargo(Cargo.DIRETOR);
		System.out.println("Salario : " + new CalculaSalarioDiretor().calculaSalario(funcionario));
	}
	
}
