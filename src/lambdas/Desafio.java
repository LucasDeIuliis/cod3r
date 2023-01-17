package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);

		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085
				/* (preco + (8.5/100)) */ : preco;

		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;

		UnaryOperator<Double> arredondar = preco -> new  BigDecimal(preco).setScale(2,RoundingMode.CEILING).doubleValue(); 
				//.set.parseDouble(String.format("%.2f", preco));
		System.out.println(String.format("%.2f", 3154.52));

		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

		Produto p = new Produto("ipad", 3235.89, 0.13);

		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				 .andThen(arredondar)
				.andThen(formatar)
				.apply(p);

		System.out.println("O preço final é: " + preco);
	}
}
