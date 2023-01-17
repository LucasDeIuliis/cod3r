package curso_POO;

public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	
	
	public void detalhes() {
		System.out.println("O livro é : " + getTitulo());
		System.out.println("O nome do autor é : " + getAutor());
		System.out.println("Com total de : " + getTotPaginas() );
		System.out.println("Sua pagina atual : " + getPagAtual());
		System.out.println("Leitor é :" + leitor.getNome());
		System.out.println("Do sexo: " + leitor.getSexo());
	}
	public Livro(String titulo, String autor, int totPaginas, Pessoa pessoa) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.leitor = pessoa;
		this.pagAtual = 0;
		this.aberto = false;
	}
	@Override
	public void abrir() {
		this.aberto = true;
	}
	@Override
	public void fechar() {
		this.aberto = false;
	}
	@Override
	public void folhear(int pag) {
		if(pag > totPaginas) {
			System.out.println("não pode fazer");
		}else {
			this.pagAtual = pag;
		}
	}
	@Override
	public void avançarPag() {
		this.pagAtual++;
	}
	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
	
	
	
	
}
