package Fundamentos.ExercíciosConceitosBásicos;

import java.util.Scanner;

public class NumeroElevado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o nuemro: ");
		double numero = entrada.nextDouble();
		
		System.out.println("Seu numeor ao cubo é : " + Math.pow(numero, 3));
		
		System.out.println("seu numero ao quadrado é : " + Math.pow(numero, 4));
		
		entrada.close();
		
		
		

	}

}
