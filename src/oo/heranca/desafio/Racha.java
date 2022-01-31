package oo.heranca.desafio;

public class Racha {

	public static void main(String[] args) {
		
		
		// linhas comentadas foram no metodo que eu criei .
		// linhas rodando foram no metodo da aula

		Civic civic = new Civic();
		//civic.velocidadeAtual = 20;
		
		Ferrari ferrari = new Ferrari();
		//ferrari.velocidadeAtual = 0;
		
		System.out.println("Ferrari esta a: " +  ferrari.velocidadeAtual + "Km/h");
		System.out.println("Civic esta a : " + civic.velocidadeAtual + "Km/h");
		
		ferrari.acelerar();
//		ferrari.acelerar(ferrari);
//		civic.acelerar(civic); //errado
		
		System.out.println("Ferrari esta a: " +  ferrari.velocidadeAtual + "Km/h");
		System.out.println("Civic esta a : " + civic.velocidadeAtual + "Km/h");
		civic.acelerar();
//		ferrari.acelerar(ferrari);
//		ferrari.acelerar(ferrari);
//		ferrari.freiar(ferrari);
//		civic.acelerar(civic);
		
		System.out.println("Ferrari esta a: " +  ferrari.velocidadeAtual + "Km/h");
		System.out.println("Civic esta a : " + civic.velocidadeAtual + "Km/h");
		
//		civic.freiar(civic);
//		civic.freiar(civic);
//		civic.freiar(civic);
//		civic.freiar(civic);
//		civic.freiar(civic);
//		civic.freiar(civic);
//		civic.freiar(civic);
		
		System.out.println("Ferrari esta a: " +  ferrari.velocidadeAtual + "Km/h");
		System.out.println("Civic esta a : " + civic.velocidadeAtual + "Km/h");
	}

}
