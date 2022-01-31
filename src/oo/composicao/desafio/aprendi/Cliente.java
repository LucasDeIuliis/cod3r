package oo.composicao.desafio.aprendi;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> pedido = new ArrayList<Compra>();

	Cliente(String nome) {

		this.nome = nome;
	}

	double totalPreju() {
		double conta = 0;

		for (Compra compra : pedido) {
			conta += compra.totalPreju();
		}

		return conta;
	}

}
