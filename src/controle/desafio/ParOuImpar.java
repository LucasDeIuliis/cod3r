package controle.desafio;

import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
	
		
		String valor = JOptionPane.showInputDialog
				("Digite o primeiro n�mero de [0/10]:");
		
		int conversor = Integer.parseInt(valor);
		
		if (conversor % 2 == 0) {
			System.out.println("Numero � par");
		}
		else {
			System.out.println("Numero � impar");
		}

	}

}
