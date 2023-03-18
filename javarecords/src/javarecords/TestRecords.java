package javarecords;

import java.util.HashMap;

public class TestRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person john = new Person ("John",30);
		Person sarah = new Person ("Sarah",25);
		
		System.out.println(john.name()); //prints "John"
		System.out.println(sarah.age()); //prints 30
		
		
		HashMap map = new HashMap();
	}

}
