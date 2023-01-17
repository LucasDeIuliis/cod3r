package exercism;

public class Two_Fer {

	public static void main(String[] args) {
		twoFer("Alice");

	}

	public static String twoFer(String name) {
		String frase;
		if (name == null || name.equals("") || name.equals(" ")) {
			frase = "One for you, one for me.";
			System.out.println(frase);
			/*if (frase.equals("One for you, one for me.")) {
				System.out.println("é igual");
			} else {
				System.out.println("não é");
			}*/
		} else {
			frase = "One for " + name + ", one for me.";
			System.out.println(frase);
			/*if (frase.equals("One for Alice, one for me.")) {
				System.out.println("é igual");
			} else {
				System.out.println("não é");
			}*/
		}
		return frase;
	}

}
