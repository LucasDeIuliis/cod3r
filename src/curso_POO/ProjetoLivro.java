package curso_POO;

public class ProjetoLivro {
	public static void main(String[] args) {
		
		Pessoa[] Pessoa  = new Pessoa[2];
		Livro[] Livro = new Livro[3];
		
		Pessoa[0] = new Pessoa();
		Pessoa[1] = new Pessoa();
		
		Livro[0] = new Livro("Pai rico, pai pobre ","Robert Kiyosaki", 153, Pessoa[0]);
		Livro[1] = new Livro("Aprendendo Java", "José da Silva", 300, Pessoa[1]);
		
		Livro[0].folhear(151);
		Livro[0].avançarPag();
		Livro[0].detalhes();
		Livro[0].abrir();
	}
}
