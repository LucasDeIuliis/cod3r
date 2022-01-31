package codeWars;

public class reverseWords {
	public static String reverseWords(final String original) {
		
			 String[] cadaPalavra = original.split(" ");
						
						  String fraseReversa = "";
						  for (int i = 0; i < cadaPalavra.length; i++) {
						   String palavra = cadaPalavra[i];
						   String reverso = "";
						   for (int j = palavra.length() - 1; j >= 0; j--) {
						    reverso = reverso + palavra.charAt(j);
						   }
						   if (i == cadaPalavra.length){
			          fraseReversa = fraseReversa + reverso ;
			         }
			          else{
			            fraseReversa = fraseReversa + reverso + " ";
			          }
						  }
			    System.out.println();
						return fraseReversa;
	}
}
