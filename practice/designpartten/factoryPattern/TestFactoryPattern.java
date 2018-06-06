package practice.designpartten.factoryPattern;

import org.junit.Test;

public class TestFactoryPattern {
	@Test
	public void TestFactory() {
		VehicleFactory vehicleFactory = new PlanFactory();
		Vehicle myVehicle = vehicleFactory.createVehicle();
		System.out.println(myVehicle.name);
		myVehicle.run();
	}

}
