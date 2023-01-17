package curso_POO_aula11a13;

public class Canguru extends Mamifero{

	public void bolsa() {
		System.out.println("Usando bolsa");
	}

	@Override
	public void locomover() {
		System.out.println("Saltando");
		super.locomover();
	}
	
	
}
