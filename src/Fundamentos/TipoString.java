package Fundamentos;

public class TipoString {

	public static void main(String[] args) {
	
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		//tive que fazer comversão para lowercase pois a frase inciia Boa//
		s = "Bom dia";
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.length());
		System.out.println(s.equals("Bom Dia"));
		System.out.println(s.equalsIgnoreCase("Bom Dia"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1500.00;
		
		System.out.println("Nome:" + nome + "\nSobrenome:" + sobrenome + "\nIdade: " + idade + "\nSalario:" + salario + "\n\n");
		
		System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\n\nO senhor: %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6, 10));
		// inicio no 6 espaço termino no 10 espaço porem como sotem 9 ele so ira ate o maximo escrito//
		
		
		
	}

}
