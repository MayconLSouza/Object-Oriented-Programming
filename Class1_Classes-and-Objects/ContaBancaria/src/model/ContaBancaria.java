package model;

public class ContaBancaria {
	
	public int numeroConta;
	public String nome;
	public double saldo;
	
	public ContaBancaria() {
		this.numeroConta = 12345;
		this.nome = "Cliente";
		this.saldo = 1000.00;
	}
	
	public double realizaDeposito(double valor) {
		saldo += valor;
		return saldo;
	}
	
	public double realizaSaque(double valor) {
		saldo -= valor;
		return saldo;
	}
	
}
