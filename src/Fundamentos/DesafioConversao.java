package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual o primeiro sal�rio: ");		
		String salario1 = entrada.nextLine().replace(",",".");
		double numero1 = Double.valueOf(salario1).doubleValue();
		System.out.print("Qual o segundo sal�rio: ");
		String salario2 = entrada.nextLine();	
		salario2 = salario2.replace(",",".");
		double numero2 = Double.parseDouble(salario2);
		System.out.print("Qual o terceiro sal�rio: ");
		String salario3 = entrada.nextLine();
		salario3 = salario3.replace(",",".");
		double numero3 = Double.parseDouble(salario3);
		
		System.out.println("A m�dia dos ultimos tres salarios � : R$" + (numero1 + numero2 + numero3)/3 );
		
		entrada.close();
		
	}

}
