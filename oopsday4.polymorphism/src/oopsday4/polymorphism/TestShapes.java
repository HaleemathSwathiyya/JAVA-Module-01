package oopsday4.polymorphism;

public class TestShapes {

	public static void main(String[] args) {
		
		Shape s = new Rectangle();
		double result = s.area();
		System.out.println(result);
		
		s = new Circle(65.87);
		result = s.area();
		System.out.println(result);
		
		s = new Square(55);
		result = s.area();
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
