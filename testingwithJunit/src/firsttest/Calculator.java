package firsttest;

public class Calculator {
	
	public int power(int b,int e) {
		int p=1;
		int i=1;
		
		if(b==0 || e==0) {
			return 0;
		}
		else {
			while(i<=e) { //rewriting the code to pass the test is called Re-factoring
				p*=b;
			}
		}
		return p;
	}
	
	public void add() {
        int x = 8; 
        
        int y = 4;
        
        int sum=Integer.sum(x,y);
        
        System.out.println("Sum is " + sum);
	}
	
	public void sub() {
		int a = 8;
		int b = 4;
			
	}

}
