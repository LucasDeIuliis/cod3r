package classe;

import classe.desafio.Data;


public class ValorNulo {

	public static void main(String[] args) {
		
		
		String s1 ="";
		
		System.out.println(s1.concat("!!!!!!!!!!!"));
		
		
		/*Data d1 = Math.random() > 0.5 ? new Data(): null ;   
		if (d1 != null) {
			d1.mes = "março";
			
		}*/
		String s2 = null;
		System.out.println(s2.concat("???"));
		
		//se o a variavel não tiver valor o compilador reconhece o erro 
		//( porem tera um erro no otempo de execução )
		
		
		
		
		
		
		
	}

}
