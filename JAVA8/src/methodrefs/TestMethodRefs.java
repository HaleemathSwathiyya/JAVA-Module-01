package methodrefs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface Formula{
	
	public void m1();
}
class Some{
	
	public static void m2() {
		System.out.println("from m2...");
	}
}

class Other{
	Other(){
		System.out.println("from other constructor");
	}
	void m2() {
		System.out.println("from m2()");
	}
}

public class TestMethodRefs {

	public static void main(String[] args) {
		
		Formula f = Some :: m2; //method references in java8
		f.m1(); //m2's reference is passed to m1
		
		f = Other :: new; //constructor reference operator
		
		List<String> list = Arrays.asList("one","two","three","four","five");
		list.stream().forEach(System.out::println); //Example of instance method reference
	    List<Integer> intList = Arrays.asList(12,32,1323,11);
	    Optional<Integer> num = intList.stream().reduce(Math::max);	//static method reference
	    System.out.println(num.get());
	    		
	}

}














