package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTesDigitos = num-> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTesDigitos).negate().test(123));
		System.out.println(isPar.or(isTesDigitos).test(123));

	}

}
