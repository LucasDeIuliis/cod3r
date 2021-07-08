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
		/* quando o sinal esta antes da variavel ela o incremento é antes da comparação (++a) 
		então é comparado e true apenas despois de comparar a subtração de b é feita (b--)*/
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		

	}

}
