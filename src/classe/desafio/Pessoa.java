package classe.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa (String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.pesoComida;
		}
	}
		
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + " kg "; 
	}

	
}
