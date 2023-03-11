package optionals;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		//optional means we want to test null without using "null" keyword. it is used to remove null exceptions
		
		String str = null;
		String str2 = "hello";
		//Optional<String> optional = Optional.of(str); //we use "of" when the object is not null.
		
		//System.out.println(optional.get());
		//Optional<String> optional2 = Optional.ofNullable(str); // returns "is null"
		Optional<String> optional2 = Optional.ofNullable(str);
		//if(optional2.isPresent())
		if(optional2.isPresent())
			//System.out.println(optional.get());
			System.out.println("value is present" + optional2.get());
		else
			//System.out.println("its null" );
			System.out.println("is null" + optional2.orElse("str not initialised"));

	}

}
