package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		
		Queue<String> fila = new LinkedList<String>();
		//offer e Add  -> adicionam elementos na fila
		//Diferen�a � o comportamento quando fila est� cheia!
		//Quando a fila esta cheia add (False) offer (retorna exce��o)
		//Quando a fila esta vazia fila.peek (retorna null) fila.element (retorna exce��o)
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		//fila.size(); mostra o tamnho da fila
		//fila.clear(); limpa a fila
		//fila.isEmpty(); mostra se a fila esta vazia ou n�o.
		//fila.remove(); remove o elemento da lista
		//fila.contains() se aquela fila contem um item.
		System.out.println("----------poll-----------");
		 System.out.println(fila.poll());
		 System.out.println(fila.poll());
		 System.out.println(fila.poll());
		 System.out.println(fila.poll());
		 System.out.println(fila.poll());
		 System.out.println(fila.poll());
		 System.out.println(fila.poll());
	}
}
