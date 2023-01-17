package curso_POO;

import java.util.Random;

public class Luta {
	
	//Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	// metodos Especiais
	public Lutador getDesafiado() {
		return desafiado;
	}	
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	
	//Metodos

	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 ){
			this.aprovada = true;
			this.desafiante = l1;
			this.desafiado = l2;
		}else {
			this.aprovada = false;
			this.desafiante = null;
			this.desafiado = null;
		}
	}
	public void lutar() {
		if(getAprovada()) {
			System.out.println("----Desafiado----");
			desafiado.apresentar();
			System.out.println("----Desafiante----");
			desafiante.apresentar();
			
			Random aleatorio = new Random();
			var vencedor = aleatorio.nextInt(3); // 0 1 2
			switch(vencedor) {
			case 0: //desafiadoWin
				System.out.println("vitória de: " + desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
			break;
			case 1: //desafiadoLose
				System.out.println("Vitória de: " + this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			case 2: //empate
				System.out.println("Empate entre: " + this.desafiante.getNome() + " e " + desafiado.getNome()); 
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			}
			
			
		}else {
			System.out.println("A luta não pode acontecer!");
		}
	}
	
	
}
