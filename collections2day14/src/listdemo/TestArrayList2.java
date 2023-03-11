package listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String>();
		//colors.add(new Object());
		//colors.add(new Double("10.10"));
		
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Orange");
		colors.add(null);
		
		String str = colors.get(3);
		System.out.println(colors.size());
	}

}
