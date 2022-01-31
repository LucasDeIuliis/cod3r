package oo.composicao.desafio.aprendi;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Pedido> pedido = new ArrayList<Pedido>();

	void adicionarPedido(String nome, double valor, int quantidade) {
		var pedido = new Lanche(nome, valor);
		this.pedido.add(new Pedido(pedido, quantidade));
	}

	double totalPreju() {
		double conta = 0;

		for (Pedido pedido : pedido) {
			conta += pedido.quantidade * pedido.lanche.preco;
		}
		return conta;
	}
}
