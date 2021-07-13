package classe;


public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		

	/*	Produto p1 = new Produto("Notebook", 4356.89, 0.25);
		
		//p1.nome = "notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		
		var p2 = new Produto("Caneta Preta");
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome + " teste");
		System.out.println(p2.nome  + " teste");
		
		double valortotal = ((p1.preco * (1- p1.desconto)) + (p2.preco * (1- p2.desconto)) );
		System.out.println(p1.preco * (1- p1.desconto) );
		System.out.println((p2.preco * (1- p2.desconto)));
	// refatorada subistituido com metodo.
		double precoFinal0 = p1.precoComDesconto();
		System.out.println(precoFinal0 + "  sem metodo");
		// com paremetro ele muda o metodod
		double precoFinal1 = p1.precoComDesconto(0.1);
		System.out.println(precoFinal1);
		System.out.printf("Valor total da Compra = R$%.2f.", valortotal);*/
	
		
		
		Produto p1 = new Produto ("Notebook", 4356.89);
		Produto.desconto = 0.29;
		
		System.out.println(p1.nome +" "+ p1.preco);
		System.out.println("preço com desconto " + p1.nome + " R$ "+ p1.precoComDesconto());
		
		
		
		
	}
}
