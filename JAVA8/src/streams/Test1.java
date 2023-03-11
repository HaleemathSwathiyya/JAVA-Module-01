package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList(); //iterator, for loop , forEach do explicit navigation
		list.add("sun");                          //stream perform implicit navigation           
		list.add("moon");
		list.add("jupiter");
		list.add("uranus");
		list.add("pluto");
		list.add("mars");
		list.add("venus");
		
		Predicate<String> p = (str) -> {
		  return str.length()>3 || str.length()<10;
		};
		
		long count = list.stream().filter(p).count();
		System.out.println(count);
		
		Function<String,String> f = (str) -> {
			return str.toLowerCase();
		};
		
		List<String> outList = list.stream().map(f).collect(Collectors.toList());
		System.out.println(outList);
		
		Consumer<String> c = (str) -> {
			System.out.println(str);
		};
		list.stream().forEach(c);
		
		list.stream().filter(p).map(f).forEach(c);
		
		list.stream().forEach(System.out::println);
		
		List<String> outList1 = list.stream().map((str) -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(outList1);
		
		
//		//OR
		long counts = list.stream().filter((str) -> str.length() > 3).count();
		System.out.println(count);	
		
		
		
	}

}
