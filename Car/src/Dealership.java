/*
 * Dealership Class
 * 12/20/17
 * Aidan Gordon
 */

public class Dealership {
	//Declares the instance variables
	private String name = "";
	private Car[] cars;
	
	//Default constructor
	public Dealership() {
		name = "";
		cars = new Car[0];
	}
	
	//Constructor with given parameters
	public Dealership(String newName, Car[] newCars) {
		name = newName;
		cars = newCars;
	}
	
	//Accessor for name
	public String getName() {
		return name;
	}
	
	//Accessor for car array
	public Car[] getCars() {
		return cars;
	}
	
	//Mutator for name
	public void setName(String newName) {
		name = newName;
	}
	
	//Mutator for car array
	public void setCar(Car[] newCars) {
		cars = newCars;
	}
	
	//toString method that returns a string representation 
	public String toString() {
		String str = name + "\n";
		for (int i = 0; i < cars.length; i++) {
			str += cars[i];
		}
		return str;
	}
	
	//Determines if a car is in stock
	public boolean inStock(Car newCar) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].equals(newCar)) {
				return true;
			} 
		}
		return false;
	}
}
