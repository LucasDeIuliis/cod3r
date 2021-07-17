package classe.desafio;


public class Data {

	public String mes;
	public int dia;
	public int ano;
	
	Data (){
		
	}
	
	
	public Data (int dia , String mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	

	
	
	
	public String obterDataformatada() {
		final String formato = "%d/%s%d";
		return String.format(formato,this.dia, mes, ano);
		
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataformatada());
	}
}
