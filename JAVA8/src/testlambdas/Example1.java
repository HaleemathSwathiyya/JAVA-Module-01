package testlambdas;

interface Shape {
	double area();
}

interface Math{
	double power(int b, int e);
}

public class Example1 {

	public static void main(String[] args) {
		
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("from run method");
			}
		};
		
		
		
		Runnable r = ()->{
			for(int i=0;i<5;i++) {
				System.out.println("in run method");
			}
		};

		Math m = (int b, int e) -> {
			int p =1;
			for(int i=1;i<=e;i++) {
				p *= b;
			}
			return p;
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r11 = ()->{
			for(int i =0;i<5;i++)
			{
				System.out.println("in run method");
			}
		};
		
		Thread t = new Thread(r11);
		t.start();
		
		
		
//	factorial f = (int c)-> 
//		{
//			int result =1;
//			
//			for(int i =1;i<=c;i++) {
//				 result = result*i;
//			}
//			return result;
//			
//		};
//		int result = f.fact(5);
//		System.out.println(result);
		
			
		
		Math m1 = ( int b ,int  e)-> {
			
			int p =1;
			for (int i=0;i<=e;i++) {
				p *=b;
			}
			return p;
			
		};
		double p = m1.power(2,3);
		System.out.println(p);
		
		Shape s = ()-> {
			return 0.0;
			};
		
		double result1 = s.area();
		System.out.println(result1);
		
		
//		Shape s = () -> {
//			return 0.0;
//		};
//		
//		double result = s.area();
//		System.out.println(result);
		
		
		
	}

}
