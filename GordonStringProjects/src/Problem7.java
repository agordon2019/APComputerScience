/*
 * Reverse Name
 * Aidan Gordon
 * 11/6/17
 * This program accepts a name as input and the porgram prints thaat name in the reverse order 
 */

import java.util.Scanner; //Imports Scanner
public class Problem7 {

	public static void main(String[] args) {
		//Declares variable for user input
		String name;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user for input and stores input in "name" variable
		System.out.print("Please enter your first and last name: ");
		name = in.nextLine();
		
		//Closes Scanner
		in.close();
		
		//Goes to "processName" method to print the entered name in reverse order
		processName(name);
	}
	public static void processName(String str) {
		//Declares variables for the first and last name
		String firstName;
		String lastName;
		
		//Gets the first name and last name from the whole string
		firstName = str.substring(0, str.indexOf(" "));
		lastName = str.substring(str.indexOf(" ") + 1);
		
		//Prints the names in reverse order
		System.out.println("Your name in reverse order is " + lastName + ", " + firstName + ".");
	}
}
