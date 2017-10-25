/*
 * Credit Card Number Check
 * Aidan Gordon
 * 10/24/17
 * This program uses an actual algorithm used by credit card companies to determine whether
 * or not an entered 8 digit credit card nuumber is a valid credit card number
 */

import java.util.Scanner;//Imports the Scanner
public class Problem6 {

	public static void main(String[] args) {
		//Declares variables for user input
		int creditCardNumber; 
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user to enter credit card number and stores input in creditCardNumber variable
		System.out.print("Enter an 8- digit credit card number: ");
		creditCardNumber = in.nextInt();
		
		//Closes Scanner
		in.close();
	}

}
