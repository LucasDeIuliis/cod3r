package Fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
	
		
		
		int a = 1;
		int b = 2;
		
		a++; // a = a +1
		a--; // a = a -1
		
		++b; // b = b +1
		--b; // b = b -1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		/* quando o sinal esta antes da variavel ela o incremento � antes da compara��o (++a) 
		ent�o � comparado e true apenas despois de comparar a subtra��o de b � feita (b--)*/
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		

	}

}
