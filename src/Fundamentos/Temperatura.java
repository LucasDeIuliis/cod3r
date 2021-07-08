package Fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		/*conversor de graus em firehigh
		Formula: (ºf - 32) * 5/9 = ºc */
		
		double ºf = 86;
		final double Calculo = 5.0/9.0;
		final double Ajuste = 32;
		double celsius = (ºf - Ajuste) * Calculo;
		
		
		System.out.println("O resultado é " + celsius + " ºC.");
		
		ºf = 150;
		celsius = (ºf - Ajuste) * Calculo;
		System.out.println("O resultado é " + celsius + " ºC.");
		
		

	}

}
