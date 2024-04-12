package view;

import controller.AtividadeController;
import controller.ProvaController;
import model.Atividade;
import model.Prova;

public class Principal {

	public static void main(String[] args) {
		ProvaController provaController = new ProvaController();
		
		Prova p1 = new Prova();
		p1.setNumQuestoes(5);
		p1.setMediaNotas((float) (Math.random() * 10.01));
		
		Prova p2 = new Prova();
		p2.setNumQuestoes(10);
		p2.setMediaNotas((float) (Math.random() * 10.01));
		
		Prova p3 = new Prova();
		p3.setNumQuestoes(3);
		p3.setMediaNotas((float) (Math.random() * 10.01));
		
		provaController.addAvaliacao(p1);
		provaController.addAvaliacao(p2);
		provaController.addAvaliacao(p3);
		provaController.imprimeAvaliacao();
		provaController.buscaAvaliacao(0);
		provaController.clearAvaliacao();
		
		AtividadeController atividadeController = new AtividadeController();
		
		Atividade a1 = new Atividade();
		a1.setAssunto("POO".toCharArray());
		a1.setQtdPaginas(3);
		
		Atividade a2 = new Atividade();
		a2.setAssunto("ED".toCharArray());
		a2.setQtdPaginas(5);
		
		Atividade a3 = new Atividade();
		a3.setAssunto("SO".toCharArray());
		a3.setQtdPaginas(10);
		
		atividadeController.addAvaliacao(a1);
		atividadeController.addAvaliacao(a2);
		atividadeController.addAvaliacao(a3);
		atividadeController.imprimeAvaliacao();
		atividadeController.buscaAvaliacao(2);
		
	}

}
