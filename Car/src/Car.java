/*
 * Car Class
 * Aidan Gordon
 * 12/20/17
 */

public class Car {
	//Declares instance variables
	private String model = "";
	private String make = "";
	private String color = "";
	private int year = 0;
	
	//Default Constructor
	public Car() {
		model = "";
		make = "";
		color = "";
		year = 0;
	}
	
	//Constructor with given parameters
	public Car(int newYear, String newMake, String newModel, String newColor) {
		model = newModel;
		make = newMake;
		color = newColor;
		year = newYear;
	}
	
	//Accessor for Make
	public String getMake() {
		return make;
	}
	
	//Accessor for Model
	public String getModel() {
		return model;
	}
	
	//Accessor for Color
	public String getColor() {
		return color;
	}
	
	//Accessor for Year
	public int getYear() {
		return year;
	}
	
	//Mutator for Make
	public void setMake(String newMake) {
		make = newMake;
	}
	
	//Mutator for Model
	public void setModel(String newModel) {
		model = newModel;
	}
	
	//Mutator for Color
	public void setColor(String newColor) {
		color = newColor;
	}
	
	//Mutator for Year
	public void setYear(int newYear) {
		year = newYear;
	}
	
	//toString method that returns a string representation of the car
	public String toString() {
		return year + make + model + color;
	}
	
	//Equals method to determine if two cars are the same
	public boolean equals(Car car) {
		if (car.make.equals(make) && car.model.equals(model) && car.color.equals(color)
				&& car.year == year) {
			return true;
		} else {
			return false;
		}
			
	}
}
