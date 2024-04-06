package controller;

import java.time.LocalTime;

import model.Funcionario;
import model.FuncionarioTempoParcial;

public class ContratacaoFuncionarioTempoParcial extends FuncionarioFactory {

	public ContratacaoFuncionarioTempoParcial() {
		super();
	}
	
	@Override
	public Funcionario contratacao() {
		FuncionarioTempoParcial f = new FuncionarioTempoParcial();
		f.setId(654321);
		f.setNome("Bárbara");
		f.setSalario(3000.00f);
		LocalTime horaEntrada = LocalTime.of(8, 0, 0);
		f.setHoraEntrada(horaEntrada);
		LocalTime horaSaida = LocalTime.of(15, 0, 0);
		f.setHoraSaida(horaSaida);
		return f;
	}

}
