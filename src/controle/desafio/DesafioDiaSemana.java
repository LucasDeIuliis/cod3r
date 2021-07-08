package controle.desafio;

import javax.swing.JOptionPane;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		
		String Dsemana = JOptionPane.showInputDialog("Informe o Dia da Semana: ");
		
		
		if (Dsemana.equalsIgnoreCase("Domingo")) {
			System.out.println("Esse é o 1º dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase ("Segunda") ) {
			System.out.println("Esse é o 2º dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase("Terça") ) {
			System.out.println("Esse é o 3º dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase("Quarta") ) {
			System.out.println("Esse é o 4º dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase("Quinta") ) {
			System.out.println("Esse é o 5º dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase("Sexta") ) {
			System.out.println("Esse é o 6º dia da semana ");
		}
		else if (Dsemana.equalsIgnoreCase("Sabado") ) {
			System.out.println("Esse é o 7º dia da semana ");
		}
		
		
		
	
		
		
		
		
		

	}

}
