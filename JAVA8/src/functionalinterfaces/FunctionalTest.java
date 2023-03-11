package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Andra Pradesh", "TamilNadu", "Telangana", "Kerala", "Karnataka");
		Function<String,Integer> f = (str) -> {
			                                    return str.length();
			                                    };
			                                    
	    Function<String,String> f1 = (str) -> {
				                                    return str.toUpperCase();
				                                    };
	    Function<String,String> f2 = (str) -> {
					                                    return str.toLowerCase();
					                                    };
	   Function<String,String> f3 = (str) -> {
						                                    return str.toUpperCase();
						                                    };
	   			                                    
			                                    
//Function for Upper case
//Function for Lower case //Function for reverse
         printLength(strings,f);
         printUpper(strings,f1);
         printLower(strings,f2);
		printReverse(strings,f3);
		
         
 //printUppercase
 //printLowercase
 //printRverse

	}//main ends

public static void printLength(List<String> strings, Function<String,Integer>fRef) {
        	 for(String str : strings) {
             	System.out.println(fRef.apply(str));
             }
}
        	 
 public static void printUpper(List<String> strings, Function<String, String> f1) {
            	 for(String str : strings) {
                 	System.out.println(f1.apply(str));
                 }
        	
        }
 public static void printLower(List<String> strings, Function<String, String> f2) {
	 for(String str : strings) {
     	System.out.println(f2.apply(str));
     }

}
 public static void printReverse(List<String> strings, Function<String, String> f3) {
	 for(String str : strings) {
     	System.out.println(f3.apply(str));
     }

}

}	


