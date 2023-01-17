package curso_POO_aula11a13;

public class Peixe extends Animal{
	
	private String corEscama;
	
	public void soltarBolha() {
		System.out.println("Soltou bolhas!");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando!");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substãncias");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som.");
		
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
	
}
