/*
 * Double A Project
 * Aidan Gordon
 * 11/6/17
 * This program takes in a string as input and determines whether or not the first "a" in the 
 * program is immediately followed by another "a"
 */

import java.util.Scanner; //Imports Scanner
public class Problem4 {

	public static void main(String[] args) {
		//Declares Variable for user input
		String str;
		
		//Instantiates Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts User for Input and stores input in "str" variable
		System.out.print("Please enter a string: ");
		str = in.nextLine();
		
		//closes Scanner
		in.close();
		
		//Goes to "doubleA" method to check if the first "a" in the string is immediately followed
		//by another "a" and then prints the result
		System.out.println(doubleA(str));
		

	}
	
	public static boolean doubleA(String str) {
		//Checks if the substring from the index of "a" (or the first instance where the character
		//"a" is) to the index Of "a" + 2 (or the next character) is equal to "aa"
		if (str.substring(str.indexOf("a"), str.indexOf("a") + 2).equals("aa")) {
			return true; //Returns true if the substring of the index of "a" and the next character
						 //is equal to "aa"
		} else {
			return false; //Otherwise returns false
		}
	}
}
