/*
 * Without Ends
 * 11/5/17
 * Aidan Gordon
 * This program accepts a String as input and prints the entered string without the first and last
 * character. If the string isn't long enough to do this then the program prints and empty string
 */

import java.util.Scanner; //imports Scanner
public class Problem2 {

	public static void main(String[] args) {
		//Declares variable for user input
		String str = "";
		
		//Instantiates the Scanner 
		Scanner in = new Scanner(System.in);
		
		//Prompts user for input and stores input in "str" variable
		System.out.print("Please enter a string: ");
		str = in.nextLine();
		
		//Closes the Scanner
		in.close();
		
		//Goes to "withoutEnds" method to take the first and last character off the entered string
		System.out.println(withoutEnds(str)); //Prints the new string
		
	}
	
	public static String withoutEnds(String str) {
		//If the string is less than two characters 
		if (str.length() <= 2) {
			return ""; //Returns the empty string
		} else {
			//Returns string without first and last character
			return str.substring(1, str.length() - 1); 					
		}
		
		
	}
}
