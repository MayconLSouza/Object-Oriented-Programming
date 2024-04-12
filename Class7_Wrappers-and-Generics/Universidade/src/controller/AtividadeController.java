package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Atividade;

public class AtividadeController implements IAvaliacaoController<Atividade>{

	private List<Atividade> avaliacao;
	
	public AtividadeController() {
		avaliacao = new ArrayList<>();
	}

	@Override
	public void addAvaliacao(Atividade atividade) {
		avaliacao.add(atividade);
	}
	
	@Override
	public Atividade buscaAvaliacao(int posicao) {
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
