package oo.encapsulamento;

public class Pessoa {

	
	private int idade;
	
	public Pessoa(int idade) {
		mudarIdade(idade);
	}
	
	// Getter
	public int lerIdade(){
		return idade;
	}
	
	// Setter
	 public void mudarIdade(int novaIdade){
		 if(novaIdade >=0 && novaIdade >= 120) {
			 this.idade = novaIdade;
		 }else{
			 System.out.println("idade não é válida");
		 }
	 }
	
}
