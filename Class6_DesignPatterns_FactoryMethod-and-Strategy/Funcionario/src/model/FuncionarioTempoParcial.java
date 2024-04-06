package model;

import java.time.LocalTime;

public class FuncionarioTempoParcial extends Funcionario {

	private LocalTime horaEntrada;
	private LocalTime horaSaida;
	
	public FuncionarioTempoParcial() {
		super();
	}

	public LocalTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public LocalTime getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("ID: " + getId() + "\n");
		buffer.append("Nome: " + getNome() + "\n");
		buffer.append("Salário: $" + getSalario() + "\n");
		buffer.append("Horário de entrada: " + horaEntrada + "\n");
		buffer.append("Horário de saída: " + horaSaida + "\n");
		return buffer.toString();
	}
	
}
