package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		
//		Set<String> ListaAprovados = new HashSet<String>() ;não precisa colocar string apos hashset apenas deixa em diamond
		//Set<String> ListaAprovados = new HashSet<>() ;
		TreeSet<String> ListaAprovados = new TreeSet<>() ;
		
		ListaAprovados.add("Lucas");
		ListaAprovados.add("Ana");
		ListaAprovados.add("Carlos");
		ListaAprovados.add("Luca");
		ListaAprovados.add("Pedro");
		
		
		for (String candidato : ListaAprovados) {
			System.out.println(candidato);
		//	System.out.println();
		}
		Set<Integer> nums = new HashSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		nums.add(7);
		
		for (int n: nums) {
			System.out.println(n);
			
		}
	}

}
