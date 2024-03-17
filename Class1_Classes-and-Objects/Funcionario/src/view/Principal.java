package view;

import model.Funcionario;

public class Principal {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Maycon");
		funcionario1.setCargo("Estagiário");
		funcionario1.setSalario(1000.00);
		System.out.println(funcionario1.getNome());
		System.out.println(funcionario1.getCargo());
		System.out.println("$" + funcionario1.getSalarioLiquido(400.00, 200.00));
	}

}
