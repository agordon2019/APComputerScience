/*
 * Powers of 2 Problem
 * Aidan Gordon
 * 10/15/17
 * This program allows a user to input a number and the program calculates 2 to that entered power
 */

import java.util.Scanner; //imports Scanner
public class Problem3 {

	public static void main(String[] args) {
		//Declares variables for calculations
		int exponent;
		int counter = 1;
		int answer= 1;
		
		//Instantiates Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user for input
		System.out.print("Enter exponent: ");
		exponent = in.nextInt(); //Stores input in exponent variable
		
		//Closes Scanner
		in.close();
		
		//Displays error message if input is less than 0
		if (exponent < 0) {
			System.err.print("Please enter an integer exponent greater than 0");
		} else {
		//Calculates 2 to the entered exponent
		while (counter <= exponent) { //Continuously takes power of two until user's input is reached
			answer *= 2; //Multiplies previous answer by 2
			counter++; //Increments counter
		}
		System.out.println(answer); //Prints the calculation
		}
	}

}
