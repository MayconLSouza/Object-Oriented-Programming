package view;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("Início do main");
		
		try {
			metodo1();
		} catch (ArithmeticException divisaoPorZero) {
			System.err.println("Divisão por Zero");
		} catch (IndexOutOfBoundsException estouroVetor) {
			System.err.println("Índice fora dos limites do vetor");
		}
		
		System.out.println("Fim do main");
		
	}

	public static void metodo1() throws ArithmeticException, IndexOutOfBoundsException {
		
		System.out.println("Início do método 1");
		metodo2();
		System.out.println("Fim do método 2");
		
	}

	public static void metodo2() throws ArithmeticException, IndexOutOfBoundsException {
		
		System.out.println("Início do método 2");
		int[] vetor = new int[10];
		for (int i = 0; i <= 15; i++) {
			vetor[i] = i;
			System.out.println(i);
			if (i == 9) {
				// Erro por divisao por zero
				int vlr = vetor[i] / vetor[0];
				// Erro por estouro de vetor
//				int vlr = vetor[i] / vetor[1];
				System.out.println(vlr);
			}
		}
		System.out.println("Fim do método 2");
		
	}

}
