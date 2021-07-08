package controle.desafio;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for(String i = "*"; !i.equals("*****") ;i += "*") {
			System.out.println(valor);
			valor +="#";
		}
		
		
		// Versão do desafio
		//Não pode usar valor numerico para controlar o laço!
	}

}
