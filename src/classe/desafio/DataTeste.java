package classe.desafio;

public class DataTeste {
	
	public static void main(String[] args) {
	
		
		Data d1 = new Data(01,"Janeiro",1970);
		/*d1.dia = 12;
		//d1.mes = "abril" ;
		d1.ano = 2021;*/
		 
		var d2 = new Data();
		d2.dia = 7;
		d2.mes = "Dezembro";
		d2.ano = 2020;
		
		
		System.out.println("Dia: " + d1.dia + "  Mes: " + d1.mes + "  Ano: " + d1.ano );
		System.out.printf("%d/%s/%d\n", d1.dia, d1.mes, d1.ano);
		
		// com metdodo
		
		System.out.println(d1.obterDataformatada() + " data com metodo");
	
		System.out.println("Dia: " + d2.dia + "  Mes: " + d2.mes + "  Ano: " + d2.ano );
		System.out.printf("%d/%s/%d\n", d2.dia, d2.mes, d2.ano);

		
		
		
		
		
		
	}
	
	
}
