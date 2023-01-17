package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{

//	boolean acelerar(Carro velocidade) {
//		boolean acelerar1 = super.acelerar(velocidade);
//		boolean acelerar2 = super.acelerar(velocidade);
//		boolean acelerar3 = super.acelerar(velocidade);
//		return acelerar1 || acelerar2 || acelerar3;
//	}

	
	Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		
	}
	
	@Override
	void acelerar() {
		// TODO Auto-generated method stub
		velocidadeAtual += 15;
	}

	@Override
	public void ligarTurbo() {
	
		
	}

	@Override
	public void desligarTurbo() {
	
		
	}
}
