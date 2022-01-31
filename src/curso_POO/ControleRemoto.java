package curso_POO;

public class ControleRemoto implements Controlador {

	// Atributo //
	private int volume;
	private boolean ligado;
	private boolean tocando;

	// Métodos Especiais
	public void construtor() {
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

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	// Sobre escrevendo Métodos

	public void ligar() {
		setLigado(true);
	}

	@Override
	public void desligar() {
		setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println(isLigado());
		System.out.println(getVolume());
		
		
	}

	@Override
	public void fecharMenu() {

	}

	@Override
	public void masiVolume() {
	}

	@Override
	public void menosVolume() {

	}

	@Override
	public void ligarMudo() {

	}

	@Override
	public void desligarMudo() {

	}

	@Override
	public void play() {

	}

	@Override
	public void pause() {

	}
}
