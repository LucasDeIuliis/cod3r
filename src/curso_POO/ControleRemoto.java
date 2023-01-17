package curso_POO;

public class ControleRemoto implements Controlador {

	// Atributo //
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// M�todos Especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// Sobre escrevendo M�todos

	public void ligar() {
		setLigado(true);
	}

	@Override
	public void desligar() {
		setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("====Menu====");
		System.out.println("Est� ligado?" + this.getLigado());
		System.out.println("Esta tocando?" + this.getTocando());
		System.out.println("Volume:" + this.getVolume());
		for( int i = 1; i <= getVolume(); i+=10){
			System.out.print("|");
		}
		System.out.println();
	}

	@Override
	public void fecharMenu(){
		System.out.println("Fechando Menu");
	}

	@Override
	public void masiVolume(){
		if(this.getLigado() == true){
			this.setVolume(this.getVolume() + 1);
		}
	}

	@Override
	public void menosVolume(){
		if(this.getLigado()) {
			this.setVolume(this.getVolume() - 1);
		}
	}

	@Override
	public void ligarMudo(){
		if(this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo(){
		if(this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play(){
		if(this.getLigado() == true && !(this.getTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause(){
		if(this.getLigado() == true && this.getTocando() == true) {
			this.setTocando(false);
		}
	}
}
