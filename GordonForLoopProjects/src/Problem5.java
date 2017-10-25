/*
 * Addition and O's Output
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
		
		
		//Closes Scanner
		in.close();
	}
}
