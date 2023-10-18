package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		List<String> listEleves = Arrays.asList("Jean", "Tom", "Sam");

		// POUVOIR ENCHAINER DES OPERATIONS
		// type intermediaire et finale

		// conversion en stream
		// Stream<String> listElevesStream = listEleves.stream();
		// ou
		// listEleves.stream();

		// FILTRAGE
		// pour chaque donnée il parcourt la list comme un foreach
		listEleves.stream().filter(eleve -> eleve.length() > 3);

		// TRANSFORMATION
		listEleves.stream().map(String::toUpperCase).peek(data -> System.out.println(data)).toList();

		// TRIER

		listEleves.stream().sorted();
		List<String> filteredList = listEleves.stream()
				.map(String::toLowerCase)
				.peek(data -> System.out.println(data))
				.toList();
		System.out.println(filteredList);
		// end main
	}
}
