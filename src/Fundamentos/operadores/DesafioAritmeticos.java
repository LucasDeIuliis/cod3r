package Fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {

		/*int a = 3 *4 - 10;
		int  b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		exemplo*/
		
		double a = Math.pow((6 * (3+2)), 2) / (3*2);
		double b = Math.pow(((1-5)*(2-7)/2), 2); 
		System.out.println(a);
		System.out.println(b);
		double ab = Math.pow((a-b), 3) / Math.pow(10, 3);
		System.out.println(ab);
		
		
		
		

	}

}
