package modelos;

import regrasDeNegocio.desconto.RetornaDezOuVintePorCento;
import regrasDeNegocio.desconto.RetornaTrintaOuQuarentaPorCento;
import regrasDeNegocio.salario.DescontaDezOuVintePorCento;
import regrasDeNegocio.salario.DescontaTrintaOuQuarentaPorCento;
import interfaces.RegraDeCalculoDeDesconto;
import interfaces.RegraDeCalculoDeSalario;

public enum Cargo {
	
	DIRETOR(new DescontaTrintaOuQuarentaPorCento(), new RetornaTrintaOuQuarentaPorCento()),
	GERENTE(new DescontaDezOuVintePorCento(), new RetornaDezOuVintePorCento());

	
	private RegraDeCalculoDeSalario regraDeSalario;
	private RegraDeCalculoDeDesconto regraDeDesconto;
	
	Cargo(RegraDeCalculoDeSalario regraDeSalario, RegraDeCalculoDeDesconto regraDeDesconto) {
		this.regraDeSalario = regraDeSalario;
		this.regraDeDesconto = regraDeDesconto;
	}
	
	public RegraDeCalculoDeSalario getRegraDeSalario() {
		return regraDeSalario;
	}
	
	public RegraDeCalculoDeDesconto getRegraDeDesconto() {
		return regraDeDesconto;
	}
	
}
