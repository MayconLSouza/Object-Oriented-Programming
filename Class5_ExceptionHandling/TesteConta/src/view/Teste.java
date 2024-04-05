package view;

import model.Conta;

public class Teste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
        conta.setAgencia(1234);
        conta.setCodigo(56789);
        conta.setSaldo(1000);
        conta.setLimite(500);
        
        System.out.println(conta.toString());
        System.out.println("**************************************");
        
        conta.deposito(200);
        System.out.println("**************************************");

        try {
        	conta.saque(500);
        	System.out.println("**************************************");
        	conta.saque(2000);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        

        
        
	}

}
