package exceptiondemo;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
//		System.out.println("Begins");
//		int b = Integer.parseInt(args[0]); //"10" , "20"
//		int a = Integer.parseInt(args[1]); //"10" "Ten"
//		String name = args[2];
//		int data[] = {a,b};
//		System.out.println("Completed");
		
		
		System.out.println("Begins");
		try {
		int b = Integer.parseInt(args[0]); //"10" , "20"
		int a = Integer.parseInt(args[1]); //"10" "Ten"
		int c = b/a + a*b;
		String name = args[2]; // "10"
		int data[] = {a,b};
		}catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}catch (NumberFormatException e) {
			
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("completed..");
		
	}

}
