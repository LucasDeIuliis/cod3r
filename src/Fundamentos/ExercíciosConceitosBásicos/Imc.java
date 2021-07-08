package Fundamentos.ExercíciosConceitosBásicos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
	
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Qual o seu peso:");
		double peso = entrada.nextDouble();
		
		System.out.print("Qual a sua altura:");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println (imc);
		
		System.out.println("Seu imc é: " +new DecimalFormat("#,##0.00").format(imc));
		
		if  (imc < 18.5) {
			
			System.out.println("Abaixo do peso");
		}
		
		else if (imc >= 18.5 && imc <=24.9 ) {
			System.out.println("Peso normal");
		}
		
		else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		}
		else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		}
		else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obsidade Grau II");
		}
		
		else {
			System.out.println("Obesidade Grau III");
		}
		
		
		
		
		entrada.close();
		

	}

}
