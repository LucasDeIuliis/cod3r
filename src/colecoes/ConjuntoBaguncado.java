package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Interger
		conjunto.add('X'); // char -> caracter
		
		
		System.out.println("Tamanho é " + conjunto.size() + " Elementos" );
		
		conjunto.add("teste");
		
		System.out.println("Tamanho é " + conjunto.size() + " Elementos");
		// set aceitou pois o t esta minusculo 
		
		System.err.println(conjunto.remove("teste"));
		System.err.println(conjunto.remove("teste"));
		System.err.println(conjunto.remove('X'));
		
		System.out.println("Tamanho é " + conjunto.size() + " Elementos" );
		
		
		
		System.out.println(conjunto.contains('X'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		

	}

}
