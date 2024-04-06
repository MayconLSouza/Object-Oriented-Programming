package controller;

import model.Funcionario;
import model.FuncionarioTempoIntegral;

public class ContratacaoFuncionarioTempoIntegral extends FuncionarioFactory {

	public ContratacaoFuncionarioTempoIntegral() {
		super();
	}
	
	@Override
	public Funcionario contratacao() {
		FuncionarioTempoIntegral f = new FuncionarioTempoIntegral();
		f.setId(123456);
		f.setNome("Oswaldo");
		f.setSalario(6000.00f);
		f.setBancoHoras(20);
		return f;
	}

}
