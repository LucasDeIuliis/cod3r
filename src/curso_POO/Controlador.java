package curso_POO;

public interface Controlador {

	//Métodos Abstratos
	
	public abstract void ligar();
	public abstract void desligar();
	public abstract void abrirMenu();
	public abstract void fecharMenu();
	public abstract void masiVolume();
	public abstract void menosVolume();
	public abstract void ligarMudo();
	public abstract void desligarMudo();
	public abstract void play();
	public abstract void pause();
	
	
	public static void main(String[] args) {
		
		
		ControleRemoto c1 = new ControleRemoto();
		c1.abrirMenu();
		c1.ligar();
		c1.masiVolume();
		c1.abrirMenu();

	}
	
	
	
	
	
	
}
