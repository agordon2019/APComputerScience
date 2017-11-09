/*
 * + and O's Output
 * Aidan Gordon
 * 10/24/17
 * This program prints out a design of alternating addition symbols and O's and the design's
 * width and height are defined by user entered parameters
 */
import java.util.Scanner; //Imports the Scanner
public class Problem5 {
	
	public static void main(String[] args) {
		//Declares variables for user input
		int width;
		int height;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user for input and stores input in variables
		System.out.print("Enter a width: ");
		width = in.nextInt();
		System.out.print("Enter a height: ");
		height = in.nextInt();
		
		//Prints blank line for formatting
		System.out.println();
		
		//Goes to design creation method to print design 
		designCreation(width, height);
		
		//Closes Scanner
		in.close();
	}
	public static void designCreation(int width, int height) { //Creates new method to make design		
		//Declares variables for counters
		int counterRows;
		int counterHeight;
		
		//Creates for loop for the iteration of each row 
		for (counterHeight = 1; counterHeight <= height; counterHeight++) { 
			
			if (counterHeight % 2 == 0) { //Jumps to a different for loop every other iteration
										//in order to alternate symbols going down the columns
				
			//Creates new for loop print out alternating "+" and "O" beginning with "O" 
			//because in order for this loop to run the row must be even
			for (counterRows = 1; counterRows <=  width; counterRows++) {
																	
				if (counterRows % 2 == 0) { //if iteration is even
					System.out.print("+"); //prints plus symbol
				} else { //if iteration is odd
					System.out.print("O"); //Prints O
				}
			}
			} else { //When the row is an odd row number this iteration will run
				
				//Creates for loop for a row with alternating "+" and "O" however this one begins
				//with "+" because the row is odd
				for (counterRows = 1; counterRows <=  width; counterRows++) {
					
					if (counterRows % 2 == 0) { //if iteration is even (opposite of other for loop
												//in order to alternate symbols
						System.out.print("O"); //prints O
					} else { //if iteration is odd
						System.out.print("+"); //prints "+"
					}
			}
		
		
			}	
			System.out.println(); //Prints blank line to skip to next line in order to begin iteration for next row
		}
	}
}
