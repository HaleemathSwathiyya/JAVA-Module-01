package oopsday3;

public class Compare {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		//comparing primitives
		int a = 10;
		int b = 35;
		
		boolean result = a==b; //are they same/equal
		System.out.println(result); //false
		//comparing objects 1.comparig references 2.comparing members
		
		result = r1==r2;
		System.out.println(result); //false
		
		result = t1==t2;
		System.out.println(result); //false
		
//		result = r1==t1;
//		System.out.println(result); //incompatible operand types
		 
		//when two objects are compared, it's trying to compare it's hashcode
		//objects created using "new" will have new hashcode
		// TODO Auto-generated method stub
		
		Rectangle r3 = r1;
		result = r3 == r1;
		System.out.println(result); //true
		System.out.println(r1.hashCode());
		System.out.println(r3.hashCode());
		
		System.out.println(r2.hashCode());
		
		result = r1.equals(r2);
		System.out.println(result); //false
		
		result = r1.equals(r3);
		System.out.println(result); //true
		
		//this is not applicable for primitives
		
		r1.setLength(35.5);
		r1.setBreadth(75.45);
		
		r2.setLength(35.5);
		r2.setBreadth(75.45);
		
		if(r1.getBreadth()==r2.getBreadth() && r1.getLength()==r2.getLength())
			System.out.println("same length and breadth");
		else
			System.out.println("don't have same length and breadth");
		
		t1.setS1(35.5);
		t1.setS2(45.75);
		t1.setS3(65.5);
		
		if(r1.getLength() == t1.getS1())
			System.out.println("length and S1 are same");
		else
			System.out.println("length and S1 are not same");
		
		//we are not comparing objects r1 and t1.
		//we are comparing data members of two objects.
		
		
		

	}

}
