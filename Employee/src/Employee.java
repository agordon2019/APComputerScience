/*
 * Employee Class Midterm Project
 * Aidan Gordon
 * 1/8/17
 * This code defines a class to represent an employee
 */

public class Employee {
	//Declares instance variables for the employee class
	private String firstName;
	private String lastName;
	private boolean salaried;
	private double wage;
	private double earnings;
	private double vacationTime;
	
	//Constructor given a first name, last name, boolean for salaried and a wage\
	public Employee(String newFirstName, String newLastName, boolean newSalaried, double newWage) {
		firstName = newFirstName;
		lastName = newLastName;
		salaried = newSalaried;
		wage = newWage;
		earnings = 0.0;
		vacationTime = 0.0;
	}
	
	//Constructor given a first name and a last name
	public Employee(String newFirstName, String newLastName) {
		firstName = newFirstName;
		lastName = newLastName;
		salaried = false;
		wage = 11.0;
		earnings = 0.0;
		vacationTime = 0.0;
	}
	
	//Constructor given a first name, last name, and a boolean for salaried
	public Employee(String newFirstName, String newLastName, boolean newSalaried) {
		firstName = newFirstName;
		lastName = newLastName;
		salaried = newSalaried;
		//Determines whether the new employee is salaried and sets their wage accordingly
		if (newSalaried == true) {
			wage = 50000.0;
		} else {
			wage = 11.0;
		}
		earnings = 0.0;
		vacationTime = 0.0;
	}
	
	//Accessor for first name
	public String getFirstName() {
		return firstName;
	}
	
	//Accessor for last name
	public String getLastName() {
		return lastName;
	}
	
	//Accessor for salaried
	public boolean getSalaried() {
		return salaried;
	}
	
	//Accessor for wage
	public double getWage() {
		return wage;
	}
	
	//Accessor for earnings
	public double getEarnings() {
		return earnings;
	}
	
	//Accessor for vacation time
	public double getVacationTime() {
		return vacationTime;
	}
	
	//Mutator for first name
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	//Mutator for last name
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	//Mutator for salaried
	public void setSalaried(boolean newSalaried) {
		salaried = newSalaried;
	}
	
	//Mutator for wage
	public void setWage(double newWage) {
		wage = newWage;
	}
	
	//Mutator for earnings
	public void setEarnings(double newEarnings) {
		earnings = newEarnings;
	}
	
	//Mutator for vacation time 
	public void setVacationTime(double newVacationTime) {
		vacationTime = newVacationTime;
	}
	
	//toString method that displays a string representation of the employee
	public String toString() {
		if (salaried == true) {
			return "Name: " + lastName + ", " + firstName + "; salaried; $" + wage + 
			"/yr; earnings: $" + earnings + "; vacation time: " + vacationTime + " hour(s)";
		} else {
			return "Name: " + lastName + ", " + firstName + "; hourly; $" + wage + 
			"/hr; earnings: $" + earnings + "; vacation time: " + vacationTime + " hour(s)";
		}
	}
	
	//Method that pays the employee given the amount of time the employee worked
	public void pay(int hours) {
		//Determines if the employee is salaried and pays the employee accordingly
		if (salaried == true) {
			earnings += wage/52;
		} else {
			//Determines if the employee needs to be paid for overtime
			if (hours <= 40) {
				earnings += (wage * hours);
			} else {
				earnings += (wage * 40) + (wage * 1.5 * (hours - 40));
			}
		}
		//Increments vacation time
		vacationTime += 1.89;
	}
	
	//Method that subtracts a given amount of time that the employee was on vacation
	//from their allotted vacation time which represents the employee taking a vacation
	public void takeVacation(double hours) {
		if (vacationTime >= hours) {
			vacationTime -= hours;
		} else {
			System.err.println("You do not have enough hours to take a vacation. I'd"
					+ "talk to your manager.");
		}
	}
}
