package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for (String livro: livros) {
			System.out.println(livros);
		}
		
		System.out.println(livros.pop());// retorna exception
		System.out.println(livros.poll());//retorna nulo
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove()); remove da pilha
		
		//livros.size() tamanho
//		livros.clear(); limpa a pilha
//		livros.contains(); conteudo da pilha
		
	

	}

}
