package cFactoryMethod;

public class UseVehicleFactory {
	
	public static void main(String[] args) {
		
		VehicleIface seltos  = VehicleFactory.newInstance("Seltos");
		seltos.honk();
		
		VehicleIface xcross = VehicleFactory.newInstance("XCross");
		xcross.move();
		
	}

}
