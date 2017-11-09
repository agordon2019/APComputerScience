/*
 * Print Reverse
 * Aidan Gordon
 * 11/7/17
 * This program accepts a string as input and the program reprints that string in the reverse order
 */

import java.util.Scanner; //Imports Scanner
public class Problem8 {

	public static void main(String[] args) {
		//Declares variable for input
		String str;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts User for input and stores the input in "str" variable
		System.out.print("Please enter a string: ");
		str = in.nextLine();
		
		//Closes Scanner
		in.close();
		
		//Goes to "printReverse" method to print the entered String in reverse
		System.out.println(printReverse(str));
		
	}
	public static String printReverse(String str) {
		String reverseString = ""; //Instantiates reverseString
		//Initializes counter at the last index of the string in order to get character at the last
		//index and then decreases the counter to get each character until the "0" index
		for (int counter = str.length() - 1; counter >= 0; counter--) {
			reverseString += "" + str.charAt(counter); 
			//Gets the characters of the string in reverse order and concatenates them with the
			//empty string in order to concatenate all of them into the reverse string
		}
		
		return reverseString; //Returns the reverseString
	}
}
