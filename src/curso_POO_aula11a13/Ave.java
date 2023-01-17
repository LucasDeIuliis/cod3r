package curso_POO_aula11a13;

public class Ave extends Animal {

	private String corPenas;
	
	public void fazerNinho() {
		System.out.println("Fez um Ninho");
	}

	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("comeu frutas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}

	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}
	
	
}
