package oopsday5;

public class TestFinal {
	
	//trying to access a variable which is not defined is called "forward reference".
	//when memory allocation happens to static and instant members.
	int a = b; //b is forward reference
	static int b = 10;
	final double pie = 3.14; //final is compile-time constant , it can have n copies whereas static only have one copy
	public static void main(String[] args) {
		
	}

}
//when methods are overriding, we cannot make it final that is final methods cannot be overridden
//final classes cannot have sub-classes that is it cannot be extended
//final data members can have n number of copies.
// if static - final is used it is common to all methods and we cannot make any changes in it.
