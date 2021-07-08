package controle.desafio;

import java.util.Scanner;

public class SomadorDeNumeroInteiro {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = scanner.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero; // Isso � igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma at� o momento: %d\n", somadorDeNumeros);
			}
		}
		scanner.close();

	}

}
