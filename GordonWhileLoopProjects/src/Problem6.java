/*
 * Problem 6 Collatz Sequence
 * Aidan Gordon
 * 10/15/17
 * This program takes a number as input  and prints the following process: if it is even the number 
 * is divided by two and if it is odd then the number is multiplied by 3 then one is added to it.
 * The program continues this process until the pattern reaches one.
 */

import java.util.Scanner; //Imports Scanner
public class Problem6 {

	public static void main(String[] args) {
		//Declares variables for number
		int number;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user to input a number
		System.out.print("Starting number: ");
		number = in.nextInt();
		
		System.out.print(number + "\t"); //Starts the pattern by printing the input then adding a tab for formatting
		while (number != 1) { //while the number does not equal 1 (because once it does equal one the program should end)
			if (number % 2 == 1) { //if number is odd
				number = number * 3 + 1; //multiplies the number by 3 then adds one to it and stores it back in the number variable
				System.out.print(number + "\t"); //Prints out the number then adds a tab for formatting
			}
			if (number % 2 == 0) { //if number is even
				number /= 2; //divides number by 2 and stores it back in number variable
				System.out.print(number + "\t"); //Prints out the number then adds a tab for formatting
			}
		}
		//Closes Scanner
		in.close();
	}

}
