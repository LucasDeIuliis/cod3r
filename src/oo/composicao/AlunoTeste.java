package oo.composicao;

public class AlunoTeste {

	public static void main(String[] args) {
	
		
		Aluno aluno1 = new Aluno("Jo„o");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		Aluno aluno4 = new Aluno("Lucas");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web Completo");
		Curso curso3 = new Curso("ZÈBurato Completo");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno4);

		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);

		curso3.adicionarAluno(aluno4);
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Estou Matriculado no cruso: " + curso1.nome +  " e meu nome e:" + aluno.nome);
			System.out.println();
		}
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou Matriculado no cruso: " + curso3.nome + " e meu nome e:" + aluno.nome);
			System.out.println();
		}
		Curso cursoEncontrado = aluno4.obterCursoPorNome("zÈBurato Completo");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
