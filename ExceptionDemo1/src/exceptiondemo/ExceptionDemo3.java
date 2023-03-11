package exceptiondemo;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		System.out.println("Pgm test begins");
		try {
			System.out.println("entered try...");
			int c = 10/0;
			System.out.println("from try after exception...");
			
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("from catch..."); //never leave catch blocks empty
			
		}
		finally {
			System.out.println("from finally...");
		}
	System.out.println("Pgm task completed");
	

	}

}
