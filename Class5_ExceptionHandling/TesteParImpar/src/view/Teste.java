package view;

import java.util.Scanner;

import controller.OperacaoController;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		OperacaoController opCont = new OperacaoController();
		
		do {
			System.out.println("Digite um valor: ");
			int valor = scanner.nextInt();
			try {
				System.out.println(opCont.operacaoValor(valor));
			} catch (ArithmeticException numeroNegativo){
				System.err.println(numeroNegativo.getMessage());
			} finally {
				scanner.nextLine();
				System.out.println("Deseja Continuar? (s ou n)");
			}
		} while (scanner.nextLine().equals("s"));
		
		scanner.close();
	}

}
