package oopsday1;

public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car benz  = new Car(); //benz is an object defined class type		
		// these types "benz" is not compatible with other types like int, float, double e.tc.
		
		benz.color = "Grey";
		benz.price = 5000000;
		benz.brand = "MercedesBenz";
		benz.model = "SUV";
		System.out.println(benz.color);
		System.out.println(benz.price);
		System.out.println(benz.brand);
		System.out.println(benz.model);
		
		Car bmw = new Car();
		bmw.color = "Black";
		bmw.price = 7000000;
		bmw.brand = "BMW";
		bmw.model = "x350";
		System.out.println("\n");
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);
		
		// jag = "Hello";
		benz = bmw;
		
		
		// TODO Auto-generated method stub

	}

}
