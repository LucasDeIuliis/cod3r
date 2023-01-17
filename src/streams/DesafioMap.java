package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

import javax.sound.sampled.ReverbType;

import codeWars.reverseWords;

public class DesafioMap {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Consumer<String> print = System.out::println;

		List<String> reverse = nums.stream().map(num -> {
			System.out.println(Integer.toBinaryString(num));
			return (Integer.toBinaryString(num)); // criei a variavel manualmente.
		}).collect(Collectors.toList());

		// reverse.stream().map(tras ->
		// {System.out.println(StringBuffer(nums).reverse().toString());}

		System.out.println("Impossivel");

		reverse.stream().map(num -> {
			System.out.println(Integer.parseInt(num, 2));
			return Integer.parseInt(num, 2);
		}).collect(Collectors.toList());

		System.out.println("//////////////// codigo resolutivo ////////////////");

		UnaryOperator<String> inverter = 
				sr -> new StringBuilder(sr).reverse().toString();
				
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s , 2);
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInt)
		.forEach(System.out::println);
		
		

		/*
		 * 1.Número para String Binária... 6 => "110" 2.Reverter a string... "10" =>
		 * "01" 3.Converter de volta para inteiro => "011" => 3
		 */

		// nums.stream().map(Integer::toBinaryString).forEach(print); // criaa variavel
		// com indice.

		// map faz retorno
		// foreach não tem retorno

	}

}
