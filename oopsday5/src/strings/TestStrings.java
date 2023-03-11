package strings;

public class TestStrings {
	
	public static void main(String[] args) {
		
		byte bytes[] = {65, 66, 67, 68, 69};
		
		String str = new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str = "Welcome to UST Global";
		bytes = str.getBytes();
		for(byte b: bytes) {
			
			System.out.println(b);
		}
		
		char chars[] = {'U', 'S', 'T', ' ', 'G'};
		
		str = new String(chars);
		System.out.println(str);
		
		str.getChars(0, chars.length-1, chars, 0);
		for(char c: chars) {
			
			System.out.println(c);
		}
		
//		String string = new String("She sells sea shells in sea shore");
//		//String s = string;
//		int count = 0;
//		for(int i=0;i<string.length();i++) {
//			if(string.charAt(i)=='s' || string.charAt(i)=='S')
//				count++;
//		}
//		System.out.println(count);
// [] means regular expression.		
		String string = new String("She sells sea shells in sea shore");
		
		String words[] = string.split(" ");
		System.out.println(words.length);
		
		for(String word: words) {
			
			System.out.println(word);
		}
		
		string = new String("Cartoon");
		System.out.println(string.startsWith("Car"));
		System.out.println(string.endsWith("toon"));
		
		int apos = string.indexOf('a');
		int tpos = string.indexOf('t');
		
		String string2 = string.substring(apos, tpos);
		System.out.println(string2);
		string2 = string.substring(tpos);
		System.out.println(string2);
		
		string = new String("madamdam");
		//int mpos = -1;
		int dpos = string.lastIndexOf('d');
		System.out.println(dpos);
//		string2 = string.substring(mpos, dpos);
		string2 = string.substring(dpos, string.length());
		System.out.println(string2);
		
//		String email = new String("aneeta.roy@ust.com");
//		String words[] = email.split("[.]");
//		System.out.println(words.length);
//		
//		for(String word: words) {
//			
//			System.out.println(word);
//		}
		
		String str1 = new String("welcome");
		String str2 = new String("welcome");
		//String str2 = new String("WELCOME");
		//String str2 = new String("weLCOME");
	
		
		boolean result = str1.equals(str2); //here equals method is overridden so it looks for content rather than hash code
		//boolean result = str1.equalsIgnoreCase(str2);
		System.out.println(result);
		
		//int val = str1.compareTo(str2);
		int val = str2.compareTo(str1);
		System.out.println(val);
		
		string = "Diehard";
		System.out.println(string.toLowerCase());
		System.out.println(string); //In java, strings are immutable - means you cannot append any character which is a limitation. string does not support reversing which is clarified by StringBuilder and StringBuffer method.
		System.out.println(string.toUpperCase());
		System.out.println(string);
		
	    // "16-11-477/6/A/3 Hyderabad 500036"
		string = "16-11-477/6/A/3 Hyderabad 500036";
		int d=0, l=0;
		int ndl =0;
		for(int i=0; i < string.length(); i++) {
			
			char c = string.charAt(i);
			if (Character.isDigit(c)) {
				d++;
			}
			else if(Character.isLetter(c)){
				l++;
			}
			else
				ndl++;
		}
		System.out.println(d);
		System.out.println(l);
		System.out.println(ndl);
		
		
		       
	}

}
