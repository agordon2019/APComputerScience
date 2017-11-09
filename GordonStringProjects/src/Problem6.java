/*
 * String BuildUp
 * Aidan Gordon 
 * 11/6/17
 * This program accepts a string as input and the program prints the entered string starting from 
 * the first letter and adding the next letter in the sequence until the whole string is printed
 */

import java.util.Scanner; //Imports Scanner
public class Problem6 {

	public static void main(String[] args) {
		//Declares variable for user input
		String str;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user for input and stores input in "str" variable
		System.out.print("Please enter a string: ");
		str = in.nextLine();
		
		//Closes Scanner
		in.close();
		
		//Goes to "stringBuildup" method to get the build up of the string then prints the result
		System.out.println(stringBuildup(str));
		
		
	}
	public static String stringBuildup(String str) {
		String strHolder = ""; //Declares new variable for the string in order to change
							   //the string but still store the original string
		
		//Creates for loop that gets the string from beginning of the string to the next character
		//as the counter increases and concatenating it with the previous string to get the String's
		//buildup
		for (int counter = 1; counter <= str.length(); counter++) {
			strHolder += str.substring(0, counter); //Gets string from the beginning to the counter
													//then adds it to the string from previous
													//counters
		}
		return strHolder; //Returns the string that has been keeping track of the buildup
	}
}
