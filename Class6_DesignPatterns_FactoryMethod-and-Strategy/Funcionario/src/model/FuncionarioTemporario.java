package model;

import java.time.LocalDate;

public class FuncionarioTemporario extends Funcionario {

	private LocalDate fimContrato;
	
	public FuncionarioTemporario() {
		super();
	}

	public LocalDate getFimContrato() {
		return fimContrato;
	}

	public void setFimContrato(LocalDate fimContrato) {
		this.fimContrato = fimContrato;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("ID: " + getId() + "\n");
		buffer.append("Nome: " + getNome() + "\n");
		buffer.append("Salário: $" + getSalario() + "\n");
		buffer.append("Fim do contrato: " + fimContrato + "\n");
		return buffer.toString();
	}
	
}
