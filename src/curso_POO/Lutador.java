package curso_POO;

public class Lutador {

	// atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	// metodos acessores e modificadores

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(this.peso < 52.2 ) {
			this.categoria = "invalido";
		}else if(this.peso <= 70.3 ) {
			this.categoria = "leve";
		}else if(this.peso <= 83.9) {
			this.categoria = "médio";
		}else if(this.peso<= 120.2) {
			this.categoria = "pesado";
		}else{
			this.categoria ="inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	// metodo cosntrutor
	
	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrota,
			int empate) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitorias(vitoria);
		this.setDerrotas(derrota);
		this.setEmpates(empate);
	}

	// metodos

	public void apresentar() {
		System.out.println("E agora com voces o lutador:" + this.nome);
		System.out.println(getCategoria());
	}

	public void status() {
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso);
		System.out.println(
				"Cartel: Vitorias " + this.vitorias + " Derrotas: " + this.derrotas + " Empates: " + this.empates);

	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

}
