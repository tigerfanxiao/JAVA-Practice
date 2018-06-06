package practice.designpartten.factoryPattern;

public class PlanFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		return new Plane();
	}

}
