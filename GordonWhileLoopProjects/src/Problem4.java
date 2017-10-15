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
		int counter = 1;
		int randomNumber;
		int userGuess = 0;
		
		//
	}
	//Generates and returns a random number between min and max
			public static int getRandInt(int max,int min)
			{
				return (int) (Math.random() * ((max - min) + 1) + min);
			}

}
