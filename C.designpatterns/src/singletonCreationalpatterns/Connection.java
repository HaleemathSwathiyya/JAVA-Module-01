package singletonCreationalpatterns; //cSingleton

public class Connection {
	
	static Connection con;
	
	private Connection() {
		
	}
	
	public static Connection getConnection() {
		
		return new Connection();          // not singleton
		
//		if(con != null)
//			return con;
//		
//		else
//			con = new Connection();       //is singleton
//		return con;
	}

}
