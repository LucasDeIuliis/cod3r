package Fundamentos.Exerc�ciosConceitosB�sicos;

import java.util.Scanner;

public class ConversorDeTemperatura {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a temperatura em Graus Celsius: ");
		double �c = entrada.nextDouble();
		
		double convF = (�c*1.8000 + 32);
		
		System.out.println(convF);
		
		System.out.print("Informe a temperatura em firehigh: ");
		double �f = entrada.nextDouble();
		
		double convC = ((�f - 32)/1.8000);
		
		System.out.println(convC);
		
		
		
		entrada.close();
		
	}

}
