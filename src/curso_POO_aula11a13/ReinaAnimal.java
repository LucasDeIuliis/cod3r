package curso_POO_aula11a13;

public class ReinaAnimal {

	public static void main(String[] args) {
		
	Mamifero m = new Mamifero();
	Reptil r = new Reptil();
	Peixe p = new Peixe();
	Ave a = new Ave();
	
	m.setPeso(85.3);
	m.setIdade(2);
	m.setMembros(4);
	m.setCorPelo("marrom");
	m.locomover();
	m.alimentar();
	m.emitirSom();
	System.out.println(m.getCorPelo());
	
	System.out.println("______________________________________");
	
	p.setPeso(0.29);
	p.setIdade(1);
	p.setCorEscama("azul");
	p.locomover();
	p.alimentar();
	p.emitirSom();
	System.out.println(p.getCorEscama());
	p.soltarBolha();
	
	System.out.println("______________________________________");
	
	a.setPeso(0.89);
	a.setIdade(2);
	a.setCorPenas("Amarelas");
	a.locomover();
	a.alimentar();
	a.emitirSom();
	System.out.println(a.getCorPenas());
	a.fazerNinho();
	
	
	System.out.println("______________________________________");
	
	Canguru c = new Canguru();
	Cachorro dog = new Cachorro();
	
	c.setPeso(55.30);
	c.setIdade(3);
	c.setMembros(4);
	c.locomover();
	c.alimentar();
	c.emitirSom();
	
	System.out.println("______________________________________");
	
	dog.setPeso(3.94);
	dog.setIdade(5);
	dog.setMembros(4);
	dog.locomover();
	dog.alimentar();
	dog.emitirSom();
	dog.abanarRabo();
	
	
	
	
	
	}

}
