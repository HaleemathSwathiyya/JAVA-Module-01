package source.use.mod;

import source.mod.HelloWorld;

public class UseHelloWorld {
	
	public static void main(String[] args) {
		
		var x = "anil";
		var y = 23.75;
		var z = 'c';
		
		try {
			HelloWorld world = new HelloWorld();
			world.message();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
                                           

