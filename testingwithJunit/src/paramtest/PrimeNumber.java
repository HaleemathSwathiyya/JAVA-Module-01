package paramtest;

public class PrimeNumber {
	
	public boolean Validate(int n) {
		
		  if(n==0||n==1){  
			   return false;      
			  }else{ 
				
			   int f=0;
			   for(int i=2;i<=n;i++){      
			    if(n%i==0){        
			     f=1;      
			     break;      
			    }      
			   }      
			   if(f==0)  //{ System.out.println(n+" is prime number"); }  
			  return true;
			return false;
	}
		

}
	
}
