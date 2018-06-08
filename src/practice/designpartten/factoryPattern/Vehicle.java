/*
 * this abstract class is the super call for all vehicle, all the subclass has run method
 */
package practice.designpartten.factoryPattern;

public abstract class Vehicle implements Moveable {
	public String name = "Vehicle";
	public abstract void run();
	
}
