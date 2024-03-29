package view;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Contas {

	public static void main(String[] args) {
		ContaPoupanca cp = new ContaPoupanca();
		cp.setCliente("João");
		cp.setNumConta(1);
		cp.setSaldo(400);
		cp.setDiaRendimento(5);
		
		cp.sacar(200);
		cp.sacar(1000);
		cp.depositar(300);
		cp.calcularNovoSaldo(0.005d);
		
		System.out.println(cp.getCliente());
		System.out.println("Conta " + cp.getNumConta());
		System.out.println("Dia " + cp.getDiaRendimento());
		System.out.println("Saldo = $" + cp.getSaldo());
		System.out.println("*****************************************");
		
		ContaEspecial ce = new ContaEspecial();
		ce.setCliente("Maria");
		ce.setNumConta(2);
		ce.setSaldo(1000);
		ce.setLimite(500);
		
		ce.sacar(300);
		ce.sacar(2000);
		ce.sacar(1000);
		ce.depositar(500);
		
		System.out.println(ce.getCliente());
		System.out.println("Conta " + ce.getNumConta());
		System.out.println(ce.getLimite());
		System.out.println("Saldo = $" + ce.getSaldo());
	}

}
