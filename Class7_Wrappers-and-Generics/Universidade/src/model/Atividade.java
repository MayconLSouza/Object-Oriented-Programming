package model;

import java.util.Arrays;

public class Atividade {

	private char[] assunto;
	private int qtdPaginas;
	
	public Atividade() {
		super();
	}

	public char[] getAssunto() {
		return assunto;
	}

	public void setAssunto(char[] assunto) {
		this.assunto = assunto;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	@Override
	public String toString() {
		return "Atividade [assunto=" + Arrays.toString(assunto) + ", qtdPaginas=" + qtdPaginas + "]";
	}

}
