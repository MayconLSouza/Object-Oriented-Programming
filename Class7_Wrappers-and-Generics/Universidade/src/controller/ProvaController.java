package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Prova;

public class ProvaController implements IAvaliacaoController<Prova>{

	private List<Prova> avaliacao;
	
	public ProvaController() {
		avaliacao = new ArrayList<>();
	}

	@Override
	public void addAvaliacao(Prova prova) {
		avaliacao.add(prova);
	}
	
	@Override
	public Prova buscaAvaliacao(int posicao) {
		return avaliacao.get(posicao);
	}

	@Override
	public void clearAvaliacao() {
		avaliacao.clear();
	}

	@Override
	public void imprimeAvaliacao() {
		System.out.println(Arrays.toString(avaliacao.toArray()));
		
	}

}
