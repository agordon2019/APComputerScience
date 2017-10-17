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
		int exponent = 0;
		int counter = 1;
		int answer= 1;
		
		//Instantiates Scanner
		Scanner in = new Scanner(System.in);
		
		while (exponent != -1) { //Continuously takes power of two until user's input is reached
			counter = 1; //Resets counter variable
			answer = 1; //Resets answer variable
			System.out.print("Enter exponent: "); //Prompts user for input
			exponent = in.nextInt(); //Stores input in exponent variable
		while (counter <= exponent) { 
				answer *= 2; //Multiplies previous answer by 2
				counter++; //increments counter
			}
			}
	//Closes Scanner
	in.close();	
	}
	}

