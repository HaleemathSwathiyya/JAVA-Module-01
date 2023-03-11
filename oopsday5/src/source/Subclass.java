package source;

public class Subclass extends Parent {
	
	public Subclass() {
		
		//System.out.println(a); a is not accessible since it is private
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
