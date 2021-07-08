package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		entrada.useLocale(Locale.ENGLISH);
		/*entrada.useLocale(Locale.ENGLISH); teve que ser colocado 
		pois o scanner pega a linguagem da maquian (em ptbr usa-se , ao inves de .) 
		ponto é padrão americano */
	
		System.out.print("Informe o número: ");
		double num1 = entrada.nextDouble();

		System.out.print("Informe o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("informe a operação: ");
		String op = entrada.next();
		
		//lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		entrada.close();
		
		

	}

}
