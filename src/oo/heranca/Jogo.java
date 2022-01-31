package oo.heranca;

public class Jogo {

	public static void main(String[] args) {

//		Jogador j1 = new Jogador();
//		j1.x=10;
//		j1.y=10;

		Vilao vilao = new Vilao();
		vilao.x = 10;
		vilao.y = 10;

// posso mudar jogador por heroi pois a clase Heroi recebeu por herança os parametros de Jogador

		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		System.out.println("Vilão tem S2 ==> " + vilao.vida);
		System.out.println("Heroi tem S2 ==> " + heroi.vida);

		vilao.atacar(heroi);
		heroi.atacar(vilao);

		vilao.atacar(heroi);
		heroi.atacar(vilao);

		heroi.andar(Direcao.LESTE);

		vilao.atacar(heroi);
		heroi.atacar(vilao);

		System.out.println("Vilão tem S2 ==> " + vilao.vida);
		System.out.println("Heroi tem S2 ==> " + heroi.vida);

		vilao.andar(Direcao.LESTE);

		vilao.atacar(heroi);
		heroi.atacar(vilao);
		
		System.out.println("Vilão tem S2 ==> " + vilao.vida);
		System.out.println("Heroi tem S2 ==> " + heroi.vida);
	}

}
