package Fundamentos.ExercíciosConceitosBásicos;

import java.util.Scanner;

public class ConversorDeTemperatura {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a temperatura em Graus Celsius: ");
		double ºc = entrada.nextDouble();
		
		double convF = (ºc*1.8000 + 32);
		
		System.out.println(convF);
		
		System.out.print("Informe a temperatura em firehigh: ");
		double ºf = entrada.nextDouble();
		
		double convC = ((ºf - 32)/1.8000);
		
		System.out.println(convC);
		
		
		
		entrada.close();
		
	}

}
