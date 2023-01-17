package lambdas;

public class Produto {

	
	final String nome;
	final double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco - desconto;
		return "Nome: " + nome + " tem o pre�o de R$" + precoFinal;
	}
	
}
