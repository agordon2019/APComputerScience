/*
 * Triangle Right
 * Aidan Gordon
 * 10/24/17
 * This program prints a triangle of user specified size that is comprised of the natural
 * numbers starting from one and going to the user entered size number. This triangle begins with
 * the first integer on the right and continuing to the left
 */

import java.util.Scanner; //imports the Scanner
public class Problem4 {

	public static void main(String[] args) {
		//Declares variable for user input
		int size;
				
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
				
		//Prompts user for input and stores entered size in "size" variable
		System.out.print("Enter a size: ");
		size = in.nextInt();
				
		//Goes to "triangleLeft" method to print a triangle of user specified size
		triangleRight(size); 
				
		//Closes Scanner
		in.close();
	}
	
	public static void triangleRight(int size) {
		int counter; //Declares variable for counter so it can be used in multple locations
		int sizeControl = size; //Declares variable for the size so the variable can change but the
								//original size value is still stored
		int count; //Declares variable for count so it can be used in multiple locations
		for (counter = 0; counter <= size; counter++) { //Creates for loop to make an iteration for 
														//each row of the triangle
			for (count = 1; count <= sizeControl; count++) { //Creates a for loop to print the correct
													//number of spaces based on the user entered size
				System.out.print(" "); //Prints a space repeatedly to push the first integer to the
									//right in order to make the triangle go to the right
			}
		    for (int counterPrintCounter = size - counter + 1; counterPrintCounter <= size;
		    		counterPrintCounter++) { //Creates a for loop to print the correct number of
		    						//integers after the correct number of spaces have been printed
		    	System.out.print(counter); //Prints the counter consecutively based on iteration
			}
				sizeControl -= 1; //Decreases the size that is needed for the next iteration 
				System.out.println(); //skips to the next line for next iteration
			}

	}
}
