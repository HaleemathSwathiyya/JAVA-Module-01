package oopsday4.statictest;

public class StaticDemo2 {
	
	static int a;
	public static void method() { //this is an instance method so we need an object to access it so make this static
		
		System.out.println("from method" + a);
		//method2(); //not possible bcoz method2 is not static
	}
	
	public void method2() {
		
		System.out.println(a);
		method();
	}
	
	

}
