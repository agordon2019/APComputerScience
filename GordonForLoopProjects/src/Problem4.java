/*
 * Problem 4 Right Justified Triangle of Integers
 * Aidan Gordon
 * 10/18/17
 * This program prints 
 */

import java.util.Scanner; //Imports Scanner
public class Problem4 {

	public static void main(String[] args) {
		//Declares variable for user input
		int size;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user for input
		System.out.print("Enter a size: ");
		size = in.nextInt(); //Gets user input and stores it in size variable
		
		System.out.println(); //Prints blank line for formatting
		
		//Goes to triangleLeft method to print the triangle of the user specified size
		triangleLeft(size);
		
		//Closes Scanner
		in.close();
	}
	public static void triangleLeft(int size) {
		 for (int counter = 1; counter <= size; counter++) {
				for (int counter1 = 1; counter1 <= size; counter1++) {
			}
		}
	}
}
