package oo.heranca;

public class Jogador {
	
	
	int vida = 100;
	int x;
	int y;
	
	
	boolean atacar(Jogador oponente) {
		
		int difX = Math.abs(x - oponente.x);
		int dify = Math.abs(y - oponente.y);
		
		if(difX == 0 && dify == 1) {
			oponente.vida -= 10;
			return true;
		}else if(difX == 1 && dify == 0) {
			oponente.vida -= 10;
			return true;
		}else {
			return false;
		}
	}
	
	boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case SUL:
			y++;
			break;
		case LESTE:
			x++;
			break;
		case OESTE:
			x--;
			break;
		}
		//se fosse para verificar se a posição não esta saindo do tabuleiro devo utilizar o if or else para verificar . 
//		if(direcao == Direcao.NORTE) {
//			y++;
//		}
//		return true;
//	boolean andar(String direcao) {
//		if("norte".equalsIgnoreCase(direcao)) {
//			y++;
//		}
			return true;
	}

}
