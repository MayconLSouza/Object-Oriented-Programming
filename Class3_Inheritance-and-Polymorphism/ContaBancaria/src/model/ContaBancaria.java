package model;

public class ContaBancaria {

	private String cliente;
	private int numConta;
	private float saldo;
	
	public ContaBancaria() {
		super();
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void sacar(float valorSaque) {
		if((saldo - valorSaque) < 0.0f) {
			System.out.println("Saque no valor de $" + valorSaque + " nao pode ser realizado");
		} else {
			saldo -= valorSaque;
			System.out.println("Saque no valor de $" + valorSaque + " realizado");
		}
	}
	
	public void depositar(float valorDeposito) {
		System.out.println("Depósito no valor de $" + valorDeposito + " realizado");
		saldo += valorDeposito;
	}
}
