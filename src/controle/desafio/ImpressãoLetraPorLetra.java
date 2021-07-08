package controle.desafio;

import java.util.Scanner;

public class ImpressãoLetraPorLetra {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a palavra: ");
		String palavra = scanner.nextLine();

		char letras[] = palavra.toCharArray();

		for (int i = 0; i <letras.length; i++) {
			System.out.println(letras[i]);
		}

		scanner.close();

	}

}
