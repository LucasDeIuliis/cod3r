package Fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {

		
		
		double media = 7.6;
		String resultadoParcial = media >= 5.0 ? "em recupera��o" : "reprovado"  ;
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		// String resultadoFinal = media >= 7.0? "Aprovado" : media >= 5.0 ? "em recupera��o" : "reprovado"  ;
		// pode ser feito desta forma porem fica longa e confusa .
		
		System.out.println("O aluno est�: " + resultadoFinal);
		
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
				
		System.out.printf("Tem desconto ? %s", resultado);
		//ou System.out.println("Tem desconto ? %s", resultado);
		
		
		
		
		
		
		
		
		

	}

}
