package oo.composicao.desafio.aprendi;

public class Caixa {
	public static void main(String[] args) {

		Cliente cliente = new Cliente("Lucas");
		Compra fiqueiGordo = new Compra();

		fiqueiGordo.adicionarPedido("Big Mac", 25.90, 1);

		cliente.pedido.add(fiqueiGordo);
		System.out.println(cliente.totalPreju());
				
		Cliente cliente2 = new Cliente("Synbios");
		Compra maisGordo = new Compra();
		
		maisGordo.adicionarPedido("Big Tasty", 29.90, 15);
		cliente2.pedido.add(maisGordo);
		System.out.println(cliente2.totalPreju());
		
		Cliente cliente24 = new Cliente("Leo Furado");
		Compra eleGosta = new Compra();
		
		eleGosta.adicionarPedido("Charuto de Carne", 24, 20);
		
		cliente24.pedido.add(eleGosta);
		
		System.out.println(cliente24.totalPreju());
		

	}
}
