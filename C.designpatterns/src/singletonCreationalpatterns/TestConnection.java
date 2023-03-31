package singletonCreationalpatterns;

public class TestConnection {
        
	// make reference static, make constructor private , create the instance only one and after that return the same object.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Connection con1 = Connection.getConnection();
//		Connection con2 = Connection.getConnection();
		
		for(int i=1;i<=10;i++) {
			
			Connection con1 = Connection.getConnection();
			Connection con2 = Connection.getConnection();
			
         
		if(con1.hashCode() == con2.hashCode()) 
			System.out.println("Connection is Singleton");
		else
			System.out.println("Connection is not Singleton");
		
	}

   } 
}
