package curso_POO;

public class Visualizacao {

	private Gafanhoto espectador;
	private Video filme;
	
	
	public void avaliar() {
		
	}
	public void avaliar(double nota) {
		
	}
	public void avaliar(int porcentagem) {
		
	}
	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
		this.filme.setViews(this.filme.getViews() +1);
	}
	public Gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}
	@Override
	public String toString() {
		return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
	}
	
}
