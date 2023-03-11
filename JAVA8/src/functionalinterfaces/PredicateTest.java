package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTest { //the predicate always talks about a condition - whether a given condition is true or false.
	public static void main(String[] args) {
		
	
	List<String> strings = Arrays.asList("Andra Pradesh", "TamilNadu", "Telangana", "Kerala", "Karnataka");
	
	Predicate<String> p = (String str) -> {
		return str.length() > 10;
	};
	System.out.println(p.test("Holla!"));
	for(String str: strings)
		System.out.println(p.test(str));
	desiredLength(strings,p);
	
	
	}
	public static void desiredLength(List<String> strings, Predicate<String> p) {
		for(String str: strings)
			System.out.println(p.test(str));
	
	}
}


