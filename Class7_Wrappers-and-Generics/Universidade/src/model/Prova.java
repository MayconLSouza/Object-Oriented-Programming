package model;

public class Prova {
	
	private int numQuestoes;
	private float mediaNotas;
	
	public Prova() {
		super();
	}

	public int getNumQuestoes() {
		return numQuestoes;
	}

	public void setNumQuestoes(int numQuestoes) {
		this.numQuestoes = numQuestoes;
	}

	public float getMediaNotas() {
		return mediaNotas;
	}

	public void setMediaNotas(float mediaNotas) {
		this.mediaNotas = mediaNotas;
	}

	@Override
	public String toString() {
		return "Prova [numQuestoes=" + numQuestoes + ", mediaNotas=" + mediaNotas + "]";
	}
	
}
