package Fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!");
		//colocando \n ele pula linhas//
		
		System.out.println("Bom");
		System.out.println("Dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		// %n neste caso funciona como \n //
		System.out.printf("Salário: %.2f", 1234.5678);
		// %.1f faz arredondamento par 1 casa apos o . //
		System.out.printf(" Salário: %s%n", "João");
		// %s para guardar uma string //
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome : ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome : ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("nome: " + nome+ " " + sobrenome);
		
		System.out.print("Digite a sua idade : ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos", nome , sobrenome , idade);
		
		entrada.close();
		
		
		
		

	}

}
