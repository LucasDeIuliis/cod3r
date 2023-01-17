package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::print;

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n"); // primeira forma passando valor literal
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };// segunda forma de criar passando array
		Stream.of(maisLangs).forEach(print);

		Arrays.stream(maisLangs).forEach(print); // terceira forma de criar stream apartir de array

		Arrays.stream(maisLangs, 1, 3).forEach(print); // passando apenas o subconjunto "elemento 1 e 2 do array. (3 não
														// é impresso é o stop),
		// caso queira fazer o 3 0elemento do array devo por o 4 pois ele trabalha
		// sempre com -1 .

		List<String> outrasLang = Arrays.asList("\nC ", "PHP ", "Kotlin\n");
		outrasLang.stream().forEach(print);
		outrasLang.parallelStream().forEach(print); //ele faz uma sequencia random
		
		//Stream.generate(() -> "a").forEach(print); gera sem ordenação infinita
		
		//Stream.iterate(0, n -> n+1).forEach(println); gera uma ordenação infinita
	}

}
