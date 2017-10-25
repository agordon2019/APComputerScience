/*
 * Sum of the Squares up to an Integer
 * Aidan Gordon
 * 10/23/17
 * This program takes in an integer as a parameter and 
 * calculates the sum of the squares up to the entered integer
 */

import java.util.Scanner; //Imports Scanner
public class Problem1 {

	public static void main(String[] args) {
		//Declares variable for user input 
		int number;
		int sum; 
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user for input
		System.out.print("Enter a number: ");
		number = in.nextInt(); //Stores input in "number" variable
		
		//Goes to "sumSquares" method to find the sum of squares from one to the entered integer
		sum = sumSquares(number);
		
		//Prints the result of the calculation
		System.out.println("The sum of the squares up to " + number + ": " + sum);
	}
	
	public static int sumSquares(int num) { //Creates a new method to calculate the sum of the squares up to a user specified parameter
		//Declares variable for calculation
		int sum = 0;
		
		for (int counter = 1; counter <= num; counter++) {
		 sum += Math.pow(counter, 2);	
		}
		return sum;
	}
}
