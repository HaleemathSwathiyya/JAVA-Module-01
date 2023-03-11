package oopsday1.setget;

public class CarFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Car benz = new Car();
		
//		"Yellow", 4000000, "Toyota", "Innova"
		
		benz.setColor("Red");
		benz.setBrand("benz");
		benz.setPrice(5000000);
		benz.setModel("SUV");
		
		System.out.println(benz.getColor());
		System.out.println(benz.getBrand());
		System.out.println(benz.getPrice());
		System.out.println(benz.getModel());
		
		
		
		
		
		
		
		
		
		
		// int length;
		// System.out.println(length);

		/*
		 * System.out.println(Integer.toHexString(benz.hashCode()));
		 * //System.out.println(benz.hashCode()); System.out.println(benz);
		 * System.out.println(benz.getColor()); System.out.println(benz.getBrand());
		 * System.out.println(benz.getPrice()); System.out.println(benz.getModel());
		 */

		// benz is an object defined class type
		// these types "benz" is not compatible with other types like int, float, double
		// e.tc.

		/*
		 * benz.color = "Grey"; benz.price = 5000000; benz.brand = "MercedesBenz";
		 * benz.model = "SUV"; System.out.println(benz.color);
		 * System.out.println(benz.price); System.out.println(benz.brand);
		 * System.out.println(benz.model);
		 */

		Car bmw = new Car();

		
//		"Brown",3000000,"bmw","suv5"
		
		bmw.setColor("Black");
		bmw.setBrand("BMW");
		bmw.setPrice(30000000);
		bmw.setModel("suv5");
		
		System.out.println(bmw.getColor());
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getModel());
		
		
	
		
		
		/*
		 * System.out.println(bmw.getColor()); System.out.println(bmw.getBrand());
		 * System.out.println(bmw.getPrice()); System.out.println(bmw.getModel());
		 */
		/*
		 * bmw.color = "Black"; bmw.price = 7000000; bmw.brand = "BMW"; bmw.model =
		 * "x350"; System.out.println("\n"); System.out.println(bmw.color);
		 * System.out.println(bmw.price); System.out.println(bmw.brand);
		 * System.out.println(bmw.model);
		 */
		// jag = "Hello";
		// benz = bmw;

		// TODO Auto-generated method stub

	}

}
