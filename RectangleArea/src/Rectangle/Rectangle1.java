package Rectangle;

public class Rectangle1 implements Shape {
	
	private double length1;
	private double breadth1;

	

	public double getLength1() {
		return length1;
	}

	public void setLength1(double length1) {
		this.length1 = length1;
	}

	public double getBreadth1() {
		return breadth1;
	}

	public void setBreadth1(double breadth1) {
		this.breadth1 = breadth1;
	}

	public Rectangle1(double length1, double breadth1) {
		super();
		this.length1 = length1;
		this.breadth1 = breadth1;
	}
	
	@Override
	public void area() {
		
		double RectangleArea = length1*breadth1;
		System.out.println("The area of Rectangle is" + RectangleArea);
		
		
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		Shape s = new Rectangle1(4,5);
		s.area();
	}
	


}

