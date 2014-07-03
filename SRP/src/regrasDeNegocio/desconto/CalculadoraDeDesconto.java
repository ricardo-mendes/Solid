package regrasDeNegocio.desconto;

import modelos.Funcionario;

public class CalculadoraDeDesconto {
	
	public static double calculaDesconto(Funcionario funcionario)
	{
		
		return funcionario.getCargo().getRegraDeDesconto().calculaDesconto(funcionario);
		
	} 
}
