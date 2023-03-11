package exceptiondemo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Program task begins");
		try {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
//		int a = 10;
//		int b = 0;
		int c = a/b; // Point of Exception
		System.out.println(c);
		}
		catch(ArithmeticException e) {
		
			System.out.println("Cannot / by zero");
		}catch(InputMismatchException e) {
			System.out.println("Invalid input format");
		}
		
		System.out.println("Program completed task");

	}

}
