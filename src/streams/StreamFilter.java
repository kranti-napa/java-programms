package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * **
 * Filters out any names that start with the letter 'J' (case-insensitive).

	Converts the remaining names to all uppercase.

	Sorts the names in reverse alphabetical order.

	Collects the final output into a List.
 */

public class StreamFilter {

	public static void main(String[] args) {
		List<String> names = List.of("John", "Alice", "bob", "Jack", "Charlie", "david");

		List<String> output = filterNames(names);

		System.out.print(output);

	}

	private static List<String> filterNames(List<String> names) {
		// TODO Auto-generated method stub
		return names.stream().filter(name -> !(name.toLowerCase().startsWith("j"))).map(String::toUpperCase)
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}

}
