/*
 * Problem 5 Dice Sum Project
 * Aidan Gordon
 * 10/15/17
 * This project lets the user enter an integer and the program will simulate rolling two dice 
 * until the roll adds up to the entered integer
 */

import java.util.Scanner; //Imports scanner
public class Problem5 {

	public static void main(String[] args) {
		//Declares variables for calculations and user input
		int sum = 0;
		int diceRoll1 = 0;
		int diceRoll2 = 0;
		int enteredSum;
		
		//Instantiates Scanner 
		Scanner in = new Scanner(System.in);
		
		//Prompts user for input
		System.out.print("Desired Dice Sum: ");
		enteredSum = in.nextInt();
		
		if (enteredSum < 2 || enteredSum > 12) { //Determines if sum can be achieved with two dice
			System.err.println("Please enter a sum between 2 and 12."); //Displays error message if sum can't be achieved
		} else {
		while (sum != enteredSum) { //While the sum that is calculated does not equal the sum the user entered
			diceRoll1 = getRandInt(0,7); //Gets random integer for one dice roll
			diceRoll2 = getRandInt(0,7); //gets random integer for other dice roll
			sum = diceRoll1 + diceRoll2; //Adds up the dice rolls
			System.out.println(diceRoll1 + " and " + diceRoll2 + " = " + sum); //Prints the first dice roll and the second dice roll then their sum
		}
		}
		//Closes Scanner
		in.close();
	}
	
	//Generates and returns a random number between min and max
	public static int getRandInt(int max,int min)
	{
		return (int) (Math.random() * ((max - min) + 1) + min);
	}

}
