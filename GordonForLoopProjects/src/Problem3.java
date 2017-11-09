/*
 * Triangle Left with user specified size
 * Aidan Gordon
 * 10/23/17
 * This program prints a triangle of user specified size that is comprised of the natural
 * numbers starting from one and going to the user entered size number. This triangle begins
 * with the first integer on the left and continuing down and out from there
 */

import java.util.Scanner; //Imports Scanner
public class Problem3 {

	public static void main(String[] args) {
		//Declares variable for user input
		int size;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user for input and stores entered size in "size" variable
		System.out.print("Enter a size: ");
		size = in.nextInt();
		
		//Prints blank line for formatting
		System.out.println();
		
		//Goes to "triangleLeft" method to print a triangle of user specified size
		triangleLeft(size); 
		
		//Closes Scanner
		in.close();
	}
	
	public static void triangleLeft(int size) { //Creates new method to create triangle
		//Declares variable for new counter
		int counter;
		
		for (counter = 1; counter <= size; counter++) { //Creates iteration for each row of the triangle
			for (int count = 1; count <= counter; count++) { //Prints the counter based on the row number
				System.out.print(counter); //prints the counter
			}
			System.out.println(); //Skips to next line for next iteration
		}
	}

}
