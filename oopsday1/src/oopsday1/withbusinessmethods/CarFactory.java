package oopsday1.withbusinessmethods;

public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car benz  = new Car("Yellow", 4000000, "Toyota", "Innova");
		
		benz.start();
		benz.changeGear(1);
		benz.stop();
		
		
		
		//benz is an object defined class type		
		// these types "benz" is not compatible with other types like int, float, double e.tc.
		
		/*
		 * benz.color = "Grey"; benz.price = 5000000; benz.brand = "MercedesBenz";
		 * benz.model = "SUV"; System.out.println(benz.color);
		 * System.out.println(benz.price); System.out.println(benz.brand);
		 * System.out.println(benz.model);
		 */
		
		Car bmw = new Car("Brown",3000000,"bmw","suv5");
		
		bmw.start();
		bmw.changeGear(2);
		bmw.stop();
		
		
		
		
		/*
		 * bmw.color = "Black"; bmw.price = 7000000; bmw.brand = "BMW"; bmw.model =
		 * "x350"; System.out.println("\n"); System.out.println(bmw.color);
		 * System.out.println(bmw.price); System.out.println(bmw.brand);
		 * System.out.println(bmw.model);
		 */
		// jag = "Hello";
		//benz = bmw;
		
		
		// TODO Auto-generated method stub

	}

}
