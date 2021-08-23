package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList <Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		Usuario u2 = new Usuario("lucas");
		lista.add(u1);
		lista.add(u2);
		
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(1)); // acessa pela indice
		
		
		System.err.println(">>> " + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu"))); 
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	
	}

}
