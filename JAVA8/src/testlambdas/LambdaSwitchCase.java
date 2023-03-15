package testlambdas;

public class LambdaSwitchCase {
	
	
	static double calculate(String operator, double x, double y) {
		
		return switch (operator) {
		case "+" -> x+y;
		case "-" -> x-y;
		case "*" -> x*y;
		case "/" -> {
			if(y==0) {
				throw new IllegalArgumentException("Can't divide by 0");
			}
			yield x/y;
		}
		default -> throw new IllegalArgumentException("Unknown operation");
		};
	}


public static void main(String[] args) {
	calculate("+", 5, 0);
}

}