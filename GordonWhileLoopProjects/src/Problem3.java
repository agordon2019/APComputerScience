/*
+-
 * Powers of 2 Problem
 * Aidan Gordon
 * 10/15/17
 * This program allows a user to input a number and the program calculates 2 to that entered power
 */

import java.util.Scanner; //imports Scanner
public class Problem3 {

	public static void main(String[] args) {
		//Declares variables for calculations
		int exponent = 0;
		int answer= 1;
		int counter = 0;
		
		//Instantiates Scanner
		Scanner in = new Scanner(System.in);
		
		//prompts user to enter the exponent for the first time
		System.out.print("Enter exponent: "); //Prompts user for input
		exponent = in.nextInt(); //Stores input in exponent variable
		
		while (exponent != -1) { //Continuously takes power of two until user's input is reached
			answer = (int) Math.pow(2, exponent); //Finds two to the power that the user specified
			System.out.println("2^" + exponent + " = " + answer); //Prints out calculated answer
			System.out.print("Enter exponent: "); //Prompts user for input
			exponent = in.nextInt(); //Stores input in exponent variable
		while (counter <= exponent) { 
				answer *= 2; //Multiplies previous answer by 2
				counter++; //increments counter
				System.out.println(answer);
			exponent = in.nextInt(); //Stores input in exponent variable
		}
		//Closes Scanner
		in.close();	
		}
	}
}

