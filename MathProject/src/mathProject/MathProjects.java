package mathProject;

public class MathProjects implements mathFace {
	
	private int n;

	public int factorial() {
		
		int  fact=1;
		for(int i=1;i<=n;i++)
			fact = fact * i;
		System.out.println("Factorial is"+fact);
		
		// TODO Auto-generated method stub
		return fact;
	}

	public int primeOrNot() {
		
		boolean flag = false;
		for(int i=2;i<n/2;++i) {
			if(n%i == 0) {
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("is prime");
		else
			System.out.println("is not prime");

		return 0;
		// TODO Auto-generated method stub
		//return n;
	}

	@Override
	public int amstrong() {
		
		int a =0;
		while(n!=0) {
			int rem = 25%10;
			a = a+(rem*rem*rem);
			a = a/10;
		}
		if(n==a) {
			System.out.println("is amstrong");
		}
		else
			System.out.println("is not amstrong");
		
		// TODO Auto-generated method stub
		return 0;
	}

	public int evenOrodd() {
		
		if(n%2==0)
			System.out.println(n+"is even");
		else
			System.out.println(n+"is odd");
		// TODO Auto-generated method stub
		return 0;
	}
	

}

	

