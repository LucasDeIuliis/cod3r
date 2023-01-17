package oo.heranca.desafio;

public class Carro {
	// linhas comentadas foram no metodo que eu criei .
	int velocidadeAtual;
	final int velocidadeMaxima;
	

	
	
	public Carro(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	void acelerar() {
		if(velocidadeAtual +5 > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}else {
		velocidadeAtual += 5;
	}
		}

	void freiar() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;

		} else if (velocidadeAtual <= 4) {
			velocidadeAtual = 0;
		} else {
		}
	}

//	boolean acelerar (Carro velocidade) {
//		
//		if (velocidadeAtual >= 0) {
//			velocidade.velocidadeAtual += 5;
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
//	boolean freiar (Carro velocidade) {
//		if (velocidadeAtual >= 5) {
//			velocidade.velocidadeAtual -= 5;
//			return true;
//		}else if (velocidadeAtual <=4){
//			velocidade.velocidadeAtual =0;
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
//
//	void acelerar() {
//		velocidadeAtual +=5;
//	}
//	
//	void frear() {
//		if (velocidadeAtual >=5) {
//			velocidadeAtual -=5;
//		}else {
//			velocidadeAtual =0;
//		}
//	}

}
