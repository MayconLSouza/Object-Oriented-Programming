package model;

public class Motor {

	private int qtdPistao;
	private int potencia;
	
	public Motor() {
		super();
	}

	public int getQtdPistao() {
		return qtdPistao;
	}

	public final void setQtdPistao(int qtdPistao) {
		this.qtdPistao = qtdPistao;
	}

	public int getPotencia() {
		return potencia;
	}

	public final void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
