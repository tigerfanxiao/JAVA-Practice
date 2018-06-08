package practice.designpartten.factoryPattern;

import org.junit.Test;

public class TestFactoryPattern {
	@Test
	public void TestFactory() {
		// we can change any transport method by just change an instance of Factory
		VehicleFactory vehicleFactory = new PlaneFactory();
		Vehicle myVehicle = vehicleFactory.createVehicle();
		System.out.println(myVehicle.name);
		myVehicle.run();
	}

}
