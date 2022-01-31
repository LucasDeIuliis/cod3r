package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {


	Compra compra1 = new Compra();
	compra1.cliente = "João Pedro";
//	Item gaveta = new Item("copo", 2 , 3.50);
//	Item gavetadomickey = new Item("copo", 2 , 3.50);
//	compra1.adicionarItem(c);
	compra1.adicionarItem(new Item("Caneta", 20, 7.45));
	compra1.adicionarItem(new Item("Borracha", 12, 3.89));
	compra1.adicionarItem(new Item("Caderno", 3, 18.79));
	
	System.out.println(compra1.itens.size()); 
	System.out.println(compra1.getValorTotal());
	
	
	// Só para mostrar a relação bidirecional!!!
	double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
	System.out.println("O total é "+ total);
	
	
//	compra1.gritar();
//	System.out.println();
	
	}
	
	
	
}
