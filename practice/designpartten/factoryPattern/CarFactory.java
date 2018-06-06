package practice.designpartten.factoryPattern;

public class CarFactory extends VehicleFactory{

	@Override
	public Vehicle createVehicle() {
		return new Car();
	}
	
}
