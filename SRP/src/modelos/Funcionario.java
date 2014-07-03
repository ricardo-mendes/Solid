package modelos;

public class Funcionario {
	private String nome;
	private double salario;
	private Cargo cargo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public double calculaSalario(){
		return cargo.getRegraDeSalario().calculaSalario(this);
	}
	
	
}
