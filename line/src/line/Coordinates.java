package line;

import java.util.*;

public class Coordinates {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinates of first point");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		Pointline P1 = new Pointline(x1,y1);
		
		System.out.println("Enter coordinates of second point");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		Pointline P2 = new Pointline(x2,y2);
		
		System.out.println("straight line");
		int x = P1.getX();
		int y = P2.getX();
		Linearray m1 = new Linearray();
		m1.calLine(x,y);
		
		// TODO Auto-generated method stub

	}

}
