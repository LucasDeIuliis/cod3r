package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {

		Cliente cliente = new Cliente("Lucas");
		
		Compra compra1 = new Compra();
		
		//1
		compra1.adicionarItem(new Produto("notebook", 1000), 2);
		//2
		compra1.adicionarItem("Adesivo", 1, 2);
		
		
		System.out.println(compra1.itens.size()); 
		cliente.compras.add(compra1);
		System.out.println(cliente.vtotal());
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 5, 1);
		compra2.adicionarItem(new Produto("Caneta Azul", 5),1);
		cliente.compras.add(compra2);
		System.out.println(cliente.vtotal());
		

		
		
	}
}
