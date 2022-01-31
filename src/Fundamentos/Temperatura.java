package Fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
//		/*conversor de graus em firehigh
//		Formula: (ºf - 32) * 5/9 = ºc */
//		
//		double ºf = 86;
//		final double Calculo = 5.0/9.0;
//		final double Ajuste = 32;
//		double celsius = (ºf - Ajuste) * Calculo;
//		
//		
//		System.out.println("O resultado é " + celsius + " ºC.");
//		
//		ºf = 150;
//		celsius = (ºf - Ajuste) * Calculo;
//		System.out.println("O resultado é " + celsius + " ºC.");
//		
		
		String trolls = "This website is for losers LOL!".toLowerCase();
	      trolls = trolls.replaceAll("a","");
	      trolls = trolls.replaceAll("e","");
	      trolls = trolls.replaceAll("i","");
	      trolls = trolls.replaceAll("o","");
	      trolls = trolls.replaceAll("u","");
	      System.out.println(trolls);

	}

}
