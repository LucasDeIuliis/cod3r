package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<Item>();

	// 1
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}

//2
	void adicionarItem(String nome, double preco, int qtde) {
		var p = new Produto(nome, preco);
		this.itens.add(new Item(p, qtde));
	}

	double vtotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}

		return total;
	}

}
