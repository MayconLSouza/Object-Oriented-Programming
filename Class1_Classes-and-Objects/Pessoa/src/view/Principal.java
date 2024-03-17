package view;

import java.time.Period;

import model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maycon");
		pessoa.setProfissao("Desenvolvedor");
		pessoa.setDataNascimento(16, 9, 2003);
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getProfissao());
		Period idade = pessoa.getIdade();
		int idadeAno = idade.getYears();
		int idadeMes = idade.getMonths();
		int idadeDia = idade.getDays();
		System.out.println(idadeAno + " ano(s), " +idadeMes+ " mes(es), " + idadeDia + " dia(s)");
	}

}
