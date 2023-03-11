package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Andra Pradesh", "TamilNadu", "Telangana", "Kerala", "Karnataka");
		
		Consumer<String> consumer = (str) -> {
			System.out.println(str);
		};
		
		consumer.accept("I'm doing great");
		for(String str: strings) {
			consumer.accept(str);
		}
		printStrings(strings,consumer);

	} //main ends
	
	public static void printStrings(List<String> strings, Consumer<String> c) {
		for(String str: strings) {
			c.accept(str);
		}
	}

}
