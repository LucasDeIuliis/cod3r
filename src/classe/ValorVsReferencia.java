package classe;

import classe.desafio.Data;

public class ValorVsReferencia {

	public static void main(String[] args) {
	
		double a = 2;
		double b = a; // atribui��o por valor (Tipo primitivo)
		
		
		a++;
		b--;
		
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data (1 , "Junho", 2022);
		Data d2 = d1; // atribui��o por refer�ncia (Objeto)
		
		d1.dia = 31;
		d2.mes = "Dezembro";
		d1.ano = 2025;
		System.out.println(d1.obterDataformatada());
		System.out.println(d2.obterDataformatada());
	
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataformatada());
		System.out.println(d2.obterDataformatada());
		
		int c = 5; 
		alterarPrimitivo(c);
		System.out.println(c);
	}
	

		static void voltarDataParaValorPadrao(Data d) {
			d.dia = 1;
			d.mes = "Janeiro";
			d.ano = 1970;
		}
	
		static void alterarPrimitivo(int a) {
			a++;
		}
		
		
}
