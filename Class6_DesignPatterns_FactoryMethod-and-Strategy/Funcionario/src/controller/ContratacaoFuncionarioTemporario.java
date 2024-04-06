package controller;

import java.time.LocalDate;
import model.Funcionario;
import model.FuncionarioTemporario;

public class ContratacaoFuncionarioTemporario extends FuncionarioFactory {

	public ContratacaoFuncionarioTemporario() {
		super();
	}
	
	@Override
	public Funcionario contratacao() {
		FuncionarioTemporario f = new FuncionarioTemporario();
		f.setId(987456);
		f.setNome("Rubinho");
		f.setSalario(1000.00f);
		LocalDate fimContrato = LocalDate.of(2025, 1, 30);
		f.setFimContrato(fimContrato);
		return f;
	}

}
