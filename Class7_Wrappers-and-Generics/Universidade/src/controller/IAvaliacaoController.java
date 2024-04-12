package controller;

public interface IAvaliacaoController<T> {
	
	public void addAvaliacao(T t);
	public T buscaAvaliacao(int posicao);
	public void clearAvaliacao();
	public void imprimeAvaliacao();

}
