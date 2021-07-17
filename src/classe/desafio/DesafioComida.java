package classe.desafio;

public class DesafioComida {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz",0.180);
		Comida c2 = new Comida("Feijão", 0.300);
		
		Pessoa p = new Pessoa("João", 99.800);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		p.comer(c2);
		System.out.println(p.apresentar());
		
		System.out.println("Apos comer : " + c1.comida + " e " + c2.comida + " " + p.nome + " ficou com " + 
											(c1.pesoComida + c2.pesoComida + p.peso) + " Kg.");
	}
}
