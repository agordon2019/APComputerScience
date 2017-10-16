/*
 * Problem 4 Guessing Number
 * Aidan Gordon
 * 10/15/17
 * This program generates a random number and allows the user to guess that number 
 * and then gives the user feedback based on their guess. Then the program displays their
 * correct guess and how many guesses it took to get there
 */

import java.util.Scanner; //Imports Scanner

public class Problem4 {

	public static void main(String[] args) {
		//Declares variables for guesses and numbers
		int counter = 0;
		int randomNumber;
		int userGuess = 0;
		
		//Gets random number using "getRandInt" method
		randomNumber = getRandInt(1,100);
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		while (userGuess != randomNumber) {
			System.out.print("Guess an integer 1-100: ");
			userGuess = in.nextInt();
			counter++;
			if (userGuess > randomNumber) {
				System.out.println("Guess is too high.");
			} else if (userGuess < randomNumber) {
				System.out.println("Guess is too low.");
			}
		}
		//Closes Scanner
		in.close();
		
		//Displays the number, number of guesses, and a congratulatory message
		System.out.println("Congratulations! You got it! The number was " + randomNumber + "." + "\nIt took you " + counter + " guesses to get it right." );
	}
	//Generates and returns a random number between min and max
			public static int getRandInt(int max,int min)
			{
				return (int) (Math.random() * ((max - min) + 1) + min);
			}

}
