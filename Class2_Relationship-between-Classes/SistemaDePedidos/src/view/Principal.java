package view;

import model.ItemPedido;
import model.Pedido;
import model.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		produto1.setDescricao("celular");
		produto1.setCodigo(1);
		produto1.setValor(2000.00);
		
		ItemPedido item1 = new ItemPedido();
		item1.setProduto(produto1);
		item1.setQuantidade(1);
		
		Pedido pedido1 = new Pedido();
		pedido1.setNumeroNota(1);
		pedido1.adicionaItem(item1);
		
		System.out.println("Nota " + pedido1.getNumeroNota());
		System.out.println("$" + pedido1.getValorTotal());
		System.out.println("********************************************");
		
		Produto produto2 = new Produto();
		produto2.setDescricao("Camisa");
		produto2.setCodigo(2);
		produto2.setValor(50.00);
		
		Produto produto3 = new Produto();
		produto3.setDescricao("Bermuda");
		produto3.setCodigo(3);
		produto3.setValor(25.00);
		
		Produto produto4 = new Produto();
		produto4.setDescricao("Sapato");
		produto4.setCodigo(4);
		produto4.setValor(100.00);
		
		ItemPedido item2 = new ItemPedido();
		item2.setProduto(produto2);
		item2.setQuantidade(4);
		
		ItemPedido item3 = new ItemPedido();
		item3.setProduto(produto3);
		item3.setQuantidade(2);
		
		ItemPedido item4 = new ItemPedido();
		item4.setProduto(produto4);
		item4.setQuantidade(1);
		
		Pedido pedido2 = new Pedido();
		pedido2.setNumeroNota(2);
		pedido2.adicionaItem(item2);
		pedido2.adicionaItem(item3);
		pedido2.adicionaItem(item4);
		
		System.out.println("Nota " + pedido2.getNumeroNota());
		System.out.println("$" + pedido2.getValorTotal());
	}

}
