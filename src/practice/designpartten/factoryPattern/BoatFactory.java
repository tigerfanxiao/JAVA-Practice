package practice.designpartten.factoryPattern;

public class BoatFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		return new Boat();
	}

}
