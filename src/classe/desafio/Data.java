package classe.desafio;


public class Data {

	String mes;
	int dia;
	int ano;
	
	Data (){
		
	}
	
	
	Data (int diaInicial , String mesInicial, int anoInicial ){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	

	
	
	
	String obterDataformatada() {
		return String.format("%d/%s/%d", dia, mes, ano);
		
	}
}
