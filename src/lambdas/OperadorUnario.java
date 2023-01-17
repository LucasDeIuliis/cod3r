package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		
		System.out.println(resultado1);

		int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		
		System.out.println(resultado2 + " r2");
	}

}
