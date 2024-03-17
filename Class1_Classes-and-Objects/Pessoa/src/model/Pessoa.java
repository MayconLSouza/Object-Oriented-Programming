package model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	private String profissao;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(int dia, int mes, int ano) {
		//Pega a data máxima de pessoa de 150 anos
		LocalDate dataMaxima = LocalDate.now().minusYears(150);
		LocalDate dataFornecida = LocalDate.of(ano, mes, dia);
		//Verifica se a data fornecida é de uma pessoa com menos de 150 anos.
        if (dataFornecida.isAfter(dataMaxima)) {
        	this.dataNascimento = dataFornecida;
        } else {
        	this.dataNascimento = dataMaxima; 
        }
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public Period getIdade() {
		LocalDate dataNascimento = getDataNascimento();
		//Calcula idade da pessoa
		Period idade = Period.between(dataNascimento, LocalDate.now());
		return idade;
	}
}
