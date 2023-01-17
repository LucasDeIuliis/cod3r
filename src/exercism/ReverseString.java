package exercism;

public class ReverseString {
	public static void main(String[] args) {
		
	reverse("cool");

	}

		public static String reverse(String inputString) {
			
			String reverse = "";
			for(int i = (inputString.length()-1) ; i>=0; i--){
				reverse += inputString.charAt(i);
			}
				//System.out.println(reverse);
			/*String[] listaPalavras = inputString.split("");
			String strInvertida = "";

			for (int i = 0; i < listaPalavras.length; i++) {
				String palavra = listaPalavras[i];
				String palavraInvertida = "";
				for (int j = palavra.length() - 1; j >= 0; j--) {
					palavraInvertida = palavraInvertida + palavra.charAt(j);
				}
				strInvertida = strInvertida + palavraInvertida + " ";
			}
			System.out.println(strInvertida);*/
				return reverse;

		}
	}