/*
 * Create another constructor in Car that takes the Seat object.
 * Create a toString method for Car
 * Print out the car object as a whole : System.out.println(c); and see what happens
 */
public class Car {
	
	private Wheel wheels;
	private Engine engine;
	private Seat seats;
	private int x;
	
	Car() {
		
	}
	
	public String toString() {
		return "Car [wheels=" + wheels + ", engine=" + engine + ", x=" + x
				+ "]";
	}

	Car(Engine e, Wheel w, Seat s) {
		this.engine = e;
		this.wheels = w;
		this.seats = s;
		
	}

	
	/*
	 * public Engine(double cylinderCapacity, String engineType,
			int numberOfCylinders, double horsePower) {
	 */
	public static void main(String[] args) {
		
		//String material, String filter, String brand, String suitableSeason, boolean isInfantSafe, boolean isHeated
		Car c = new Car(new Engine(1.8, "Petrol", 5, 250), new Wheel(34.5, "Tata", 24), new Seat("Leather", "Cotton", "Honda", "Winter", true, true));
		c.engine.start();
	}

}