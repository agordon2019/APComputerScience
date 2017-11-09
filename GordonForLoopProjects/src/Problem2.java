/*
 * Average of user specified number of grades
 * Aidan Gordon
 * 10/23/17
 * This program allows the user to specify how many grades they want to enter, then the user
 * enters their grades and the program calculates the average of the entered grades
 */

import java.util.Scanner; //Imports Scanner
public class Problem2 {

	public static void main(String[] args) {
		//Declares variables for input and calculations
		int numGrades;
		double sum = 0;
		double grade;
		double average = 0;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts the user to input the number of grades they want to enter
		System.out.print("How many grades would you like to enter? ");
		numGrades = in.nextInt(); //Stores the number of grades the user entered in "numGrades" variable
		
		//closes Scanner
		in.close();
		
		//Creates for loop to make an iteration for each grade that the user wants to enter
		for (int counter = 1; counter <= numGrades; counter++) {
			System.out.print("Enter grade #" + counter + ": "); //Prompts user for input
			grade = in.nextDouble(); //Stores user entered grade in "grade" variable
			sum += grade; //Accumulates the sum based on entered grades
		}
		
		average = sum / numGrades; //Calculates the class average
		System.out.println("Your class average is: " + average); //Displays average
	}

}
