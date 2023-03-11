package userdefinedobjects;

import java.util.Collection;
import java.util.HashMap;
//import java.util.*;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		String str = "Some collection implementations have restrictions have on the elements that they may have contain some collection ";
//				+ "For example, some implementations prohibit null elements, and some have restrictions on "
//				+ "the types of their elements. "
//				+ "Attempting to add an ineligible element throws an unchecked exception, typically NullPointerException or "
//				+ "ClassCastException. Attempting to query the presence of an ineligible element may throw an exception, or "
//				+ "it may simply return false; some implementations will exhibit the former behavior and some will exhibit the latter. "
//				+ "More generally, attempting an operation on an ineligible element whose completion would not result in the insertion "
//				+ "of an ineligible element into the collection may throw an exception or it may succeed, at the option of the "
//				+ "implementation. Such exceptions are marked as in the specification for this interface.";
		String words[] = str.split(" ");
		System.out.println(words);
		System.out.println(words.length);
		
HashMap<String, Integer> cnt = new HashMap<>();
		
		for (String i : words) {
			
			Integer z = cnt.get(i);
			
			if(z==null) {
				cnt.put(i, 1);
			}
			
			else {
				cnt.put(i, z+1);
			}
			
		}
		System.out.println(cnt);
		
		int i = 12321;
		String str12 = i + "";
		StringBuilder sb = new StringBuilder(str12);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
		boolean result = str12.equals(sb.toString());
		System.out.println(result);
		
//		HashMap<String,String> str1 = new HashMap<>();
//		String st = str1.put("have","one");
//		//System.out.println(str);
//		st = str1.put("have","two");
//		if(st!=null) {
//			System.out.println(st);
//		}else {
//			System.out.println(st + "is null");
//		}
		
		int n=10;
		String s = new String("10");
		Integer integer = new Integer("10");
		String sint = s.valueOf(i);
		int m = Integer.parseInt(s);
		
		
		String s2 = integer.toString();
		//integer = s2.intValue();
		
	
	}
	
}
		