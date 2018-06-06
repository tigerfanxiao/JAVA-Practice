package practice.designpartten.factoryPattern;

public class PlaneFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		return new Plane();
	}

}
