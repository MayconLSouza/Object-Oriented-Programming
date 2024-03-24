package model;

import java.util.LinkedList;
import java.util.List;

public class Pedido {
	
	private int numeroNota;
	private double valorTotal = 0;
	private List<ItemPedido> carrinhoCompra = new LinkedList<ItemPedido>();
	
	public Pedido() {
		super();
	}

	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		if(numeroNota < 1) {
			this.numeroNota = 1;
		} else {
			this.numeroNota = numeroNota;
		}
	}

	public double getValorTotal() {
		while(!carrinhoCompra.isEmpty()) {
			ItemPedido item = carrinhoCompra.remove(0);
			valorTotal += (item.getQuantidade() * item.getProduto().getValor());
		}
		return valorTotal;
	}
	
	public void adicionaItem(ItemPedido item) {
		carrinhoCompra.add(item);
	}
	
}
