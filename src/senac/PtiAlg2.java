package senac;

import java.util.Scanner;

public class PtiAlg2 {

	// letra A
	public static int maiorDiferenca(int[] vetor) {

		int maiorNumero = vetor[0]; // vetor com maior numero
		int menorNumero = vetor[0]; // vetor com menor numero
		int maiorDif = vetor[0]; // resultado da subtração do menor com maior

		for (int i = 0; i < vetor.length; i++) {

			if (vetor[i] > maiorNumero) {
				maiorNumero = vetor[i];
			}
			if (vetor[i] < menorNumero) {
				menorNumero = vetor[i];
			}
		}

		maiorDif = maiorNumero - menorNumero;
		System.out.println("A maior diferença entre os numero é " + maiorDif);
		return maiorDif;
	}

	// letra B
	public static boolean vetorEmOrdem(int[] vetor) {

		for (int i = 1; i < vetor.length; i++) {

			if (vetor[i - 1] > vetor[i]) {
				System.out.println("vetores estão em ordem crescente: " + false);
				return false;	
			}
		}
		System.out.println("Vetores estão em ordem crescente: " + true);
		return true;
	}

	public static void main(String[] args) {

		int contador = 0;

		Scanner ler = new Scanner(System.in);
		int n;

		System.out.println("Qual tamanho do seu vetor ?");
		n = ler.nextInt(); // entrada do vetor

		int[] vetor = new int[n];

		while (contador < vetor.length) {
			System.out.println("Digite um numero para o vetor: ");

			vetor[contador] = ler.nextInt();

			contador = contador + 1;

		}
		maiorDiferenca(vetor);
		vetorEmOrdem(vetor);

	}

}
