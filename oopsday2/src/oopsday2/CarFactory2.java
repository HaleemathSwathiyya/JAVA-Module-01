package oopsday2;

public class CarFactory2 {

	public static void main(String[] args) {
		
		 // CarIface car =  new CarIface(); // we can't use it like this
		
		//CarIface  car; //creating a reference of it. //not refering to any object
		 CarIface car = new Car(5000,500,0,false); //interface only comes on left side so they will not be able to see the method.
		 car.start();
		 car.honk();
		 car.moove();
		 car.stop();
		 
		 
		  
		// TODO Auto-generated method stub

	}

}
