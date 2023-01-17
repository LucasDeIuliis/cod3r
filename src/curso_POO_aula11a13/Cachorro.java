package curso_POO_aula11a13;

public class Cachorro extends Lobo{

	
	public void enterrarOsso() {
		System.out.println("Enterrou um osso!");
	}
	
	public void abanarRabo() {
		System.out.println("Abanou o rabo!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Latindo (hau! - hau!)");
		//super.emitirSom();
	}
	
	public void reagir(int  hora , int min) {
		if(hora < 12) {
			System.out.println("abanar");
		}else if(hora >= 18) {
			System.out.println("ignorar");
		}else {
			System.out.println("abanar e latir");
		}
	}
	
	public void reagir (String frase) {
		if(frase == "toma comida" || frase == "ola") {
			System.out.println("abanar e latir");
		}else  {
			System.out.println("rosnar");
		}
	}
	
	public void reagir(boolean dono) {
		if(dono == true) {
			System.out.println("abanar");
		}else {
			System.out.println("rosnar e latir");
		}
	}
	public void reagir(int idade , double peso) {
		if(idade < 5 && peso < 10) {
			System.out.println("abanar");
		}else if(idade < 5 && peso > 10) {
			System.out.println("latir");
		}else if (idade > 5 && peso < 10 ) {
			System.out.println("rosnar");
		}else {
			System.out.println(idade > 5 && peso > 10);
			System.out.println("ignorar");
		}
		
	}
	
	
}
