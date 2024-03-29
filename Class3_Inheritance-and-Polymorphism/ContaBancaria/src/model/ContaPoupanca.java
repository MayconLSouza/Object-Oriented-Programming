package model;

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;
	
	public ContaPoupanca() {
		super();
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(double taxaRendimento) {
		float novoSaldo = (float) ((getSaldo() * taxaRendimento) + getSaldo());
		setSaldo(novoSaldo);
	}

}
