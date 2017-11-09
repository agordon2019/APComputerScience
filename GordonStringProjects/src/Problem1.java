/*
 * Contains At Problem
 * Aidan Gordon
 * 10/30/17
 * This program accepts a string as input and the program determines if the string contains
 * "@cchs" in the string. The program will then print true or false if the string does or does not
 * contain "@cchs" in the string
 */

import java.util.Scanner; //Imports the scanner

public class Problem1 {

	public static void main(String[] args) {
		//Declares variable for user input
		String email;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts User for Input and stores user input in "email" variable
		System.out.print("Please enter a string: ");
		email = in.nextLine();
		
		//Goes to "containsAt" method to determine if entered string contains "@cchs"
		System.out.println(containsAt(email));
		
		//Closes Scanner
		in.close();
	}
	
	public static boolean containsAt(String email) {
		//If the index of "@cchs" exists
		if (email.indexOf("@cchs") >= 0) {
			return true; //Then return true
		} else { //Otherwise return false
			return false;
		}
	}
}
