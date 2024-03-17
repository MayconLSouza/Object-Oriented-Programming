package view;

import model.ContaBancaria;

public class Principal {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria();
		System.out.println("Saldo original = $" + conta.saldo);
		double saldo = conta.realizaDeposito(500.00);
		System.out.println("Saldo após depósito = $" + saldo);
		saldo = conta.realizaSaque(300.00);
		System.out.println("Saldo após saque = $" + saldo);
	}

}
