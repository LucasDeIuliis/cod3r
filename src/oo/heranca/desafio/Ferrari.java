package oo.heranca.desafio;

public class Ferrari extends Carro {

//	boolean acelerar(Carro velocidade) {
//		boolean acelerar1 = super.acelerar(velocidade);
//		boolean acelerar2 = super.acelerar(velocidade);
//		boolean acelerar3 = super.acelerar(velocidade);
//		return acelerar1 || acelerar2 || acelerar3;
//	}

	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		velocidadeAtual += 15;
	}
}
