package arrays.desafio;

import java.util.Scanner;

public class NotasArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas: ");
		
		int qtdeNotas = entrada.nextInt();
		
		 double [] notas = new double [qtdeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota" + i + 1 + ":" );
			notas[i] = entrada.nextDouble();
			
			
		}
		double total= 0;
		for(double nota: notas) {
			total += nota;
			
		}
		
		System.out.println("A média é " + (total / notas.length) + "!");
		entrada.close();
	}

}
