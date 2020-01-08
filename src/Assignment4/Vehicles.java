package Assignment4;

import java.util.*;

public class Vehicles  {
	public static void main(String[] args) {
		Collection<Car1> vehicles = new HashSet<Car1>();
		
		//vehicles.add(new Bicycle()); Illegal
		vehicles.add(new Car1());
		vehicles.add(new RacingCar());
		
		for (Object obj : vehicles) {
			Car1 c = (Car1) obj;
			System.out.println(c.toString() + " emits " + c.getCO2Level() + " g CO2 / km");
		}
	}
}
/**

*/