package controle.desafio;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		
		String Dsemana = JOptionPane.showInputDialog("Informe o Dia da Semana: ");
		
		
		if (Dsemana.equalsIgnoreCase("Domingo")) {
			System.out.println("Esse � o 1� dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase ("Segunda") ) {
			System.out.println("Esse � o 2� dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase("Ter�a") ) {
			System.out.println("Esse � o 3� dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase("Quarta") ) {
			System.out.println("Esse � o 4� dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase("Quinta") ) {
			System.out.println("Esse � o 5� dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase("Sexta") ) {
			System.out.println("Esse � o 6� dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase("Sabado") ) {
			System.out.println("Esse � o 7� dia da semana ");
		}
		
		
		
	
		
		
		
		
		

	}

}
