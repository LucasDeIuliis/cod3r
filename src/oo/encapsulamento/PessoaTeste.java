package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa(-10);
	//	p1.idade = -30; //altera o valor
	//System.out.println(p1.idade);//ler a variavel
		
		System.out.println(p1.lerIdade());
		
		
		p1.mudarIdade(30);
		
		System.out.println(p1.lerIdade());
	}
	
}
