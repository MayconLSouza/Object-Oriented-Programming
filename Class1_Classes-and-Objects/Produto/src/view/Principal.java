package view;

import model.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("Celular");
		produto.setPreco(1500.00f);
		produto.setQtdEstoque(10);
		boolean flagDisponivel = produto.verificaProdutoDisponivel();
		if(flagDisponivel) {
			float valorEstoque = produto.totalValorEstoque();
			System.out.println("Valor de Estoque de " + produto.getNome() + " = $" + valorEstoque);
		} else {
			System.out.println("Produto Indisponível");
		}
	}

}
