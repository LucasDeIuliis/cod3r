package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
	
		
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		
		
		
		case "preta":
			System.out.println("sei o bassai-dai...");
		case "marrom":
			System.out.println("sei o tekki shodan...");
		case "roxa":
			System.out.println("sei o Heian Godan...");
		case "verde":
			System.out.println("sei o Heian Yodan...");
		case "Laranja":
			System.out.println("sei o Heian Sandan...");
		case "vermelha":
			System.out.println("sei o Heian Nidan...");
		case "amarela":
			System.out.println("sei o Heian Shodan...");
		case "branca":
			System.out.println("Não sei de nada");
			
		}
		
		int idade = 3;
		
		switch (idade) {
		case 2:
			System.out.println("Sabe falar");
		case 1:
			System.out.println("Sabe andar");
		case 0:
			System.out.println("Sabe respirar");
		}

	}

}
