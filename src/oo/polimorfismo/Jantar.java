package oo.polimorfismo;

public class Jantar {
public static void main(String[] args) {
	
	
	Pessoa convidado = new Pessoa(99.65);
	
	Arroz ingrediente1 = new Arroz(0.20);
	Feijao ingrediente2 = new Feijao(0.10);
	Sorvete ingrediente3 = new Sorvete(0.4);
	
	System.out.println(convidado.getPeso());
	
	convidado.comer(ingrediente1);
	convidado.comer(ingrediente2);
	convidado.comer(ingrediente3);
	
	System.out.println(convidado.getPeso());
	
}
}
