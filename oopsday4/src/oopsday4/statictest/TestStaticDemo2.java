package oopsday4.statictest;

public class TestStaticDemo2 {
	
	 {TestStaticDemo2.main(null);}
	
	//int a = 10;
	public static void main(String[] args) {
		
		//System.out.println(a);
		
		StaticDemo2 d1 = new StaticDemo2();
		
		d1.method();
		
		StaticDemo2.method();
		
		double result = Math.PI * 2 * 5.5 * 5.5;
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
	}

}
