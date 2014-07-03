package principal;

import regrasDeNegocio.desconto.CalculadoraDeDesconto;
import regrasDeNegocio.salario.CalculadoraDeSalario;
import modelos.Cargo;
import modelos.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo(Cargo.DIRETOR);
		funcionario.setSalario(20000);
	
		
		System.out.println("Descontou R$" + CalculadoraDeDesconto.calculaDesconto(funcionario) + " do funcionário");
		CalculadoraDeSalario.calculaSalario(funcionario);
		System.out.println("Salario final: R$" + funcionario.getSalario());
	}
}
