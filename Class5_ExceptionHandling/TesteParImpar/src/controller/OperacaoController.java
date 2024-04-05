package controller;

public class OperacaoController {

	public OperacaoController() {
		super();
	}
	
	public int operacaoValor(int valor) throws ArithmeticException {
		if(valor < 0) {
			throw new ArithmeticException("Parâmetro não pode ser negativo");
		} else {
			if ( (valor % 2) == 0) {
				return (int) Math.pow(valor, 2);
			} else {
				return (int) Math.pow(valor, 3);
			}
		} 
	}

}
