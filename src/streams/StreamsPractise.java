package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractise {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Amit");
		names.add("Donita");
		names.add("Adam");
		names.add("Ram");
		names.add("Amar");
		
		names.stream().filter(n->n.startsWith("A")).forEach(n-> System.out.println(n));
		List<String> namesWithA = names.stream().filter(n->n.startsWith("A")).collect(Collectors.toList());
		System.out.println(namesWithA);
		names.stream().filter(n->n.length()>4).forEach(n-> System.out.println(n));
		names.stream().filter(n->n.startsWith("A")).limit(1).forEach(n-> System.out.println(n));
		names.stream().map(m->m.toUpperCase()).forEach(n-> System.out.print(n + " "));
		System.out.println("\nSorting ......");
		names.stream().map(m->m.toUpperCase()).sorted().forEach(n-> System.out.print(n + " "));
		System.out.println("\nSorting in reverse order ......");
		names.stream().map(m->m.toUpperCase()).sorted(Comparator.reverseOrder()).forEach(n-> System.out.print(n + " "));
		
		List<String> names1 = new ArrayList<String>();
		names1.add("Sumit");
		names1.add("Kiran");
		
		Stream<String> concat = Stream.concat(names.stream(), names1.stream());
		List<String> list = concat.toList();
		System.out.println("\n"+ list);
		list.stream().sorted().forEach(n-> System.out.print(n + " "));
		
		
		boolean anyMatch = names.stream().anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(anyMatch);
		

	}

}
