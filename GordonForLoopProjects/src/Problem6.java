/*
 * Credit Card Number Check
 * Aidan Gordon
 * 10/24/17
 * This program uses an actual algorithm used by credit card companies to determine whether
 * or not an entered 8 digit credit card number is a valid credit card number
 */

import java.util.Scanner;//Imports the Scanner
public class Problem6 {

	public static void main(String[] args) {
		//Declares variables for user input and digits
		int creditCardNumber;
		int digit;
		int digitDoubled1;
		int digitDoubled2;
		int sumDoubledDigits = 0;
		int sumEveryOther = 0;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user to enter credit card number and stores input in creditCardNumber variable
		System.out.print("Enter an 8-digit credit card number: ");
		creditCardNumber = in.nextInt();
		
		//Closes Scanner
		in.close();
		
		for (int counter = 1; counter <= 8; counter++) { //Creates for loop to do calculations with every digit
			digit = creditCardNumber % 10; //Calculates right most digit 
			creditCardNumber /= 10; //Moves number right to the right to prepare for next iteration in order to find next digit
			
			if (counter % 2 == 0) { //Uses if statement to do some calculations on every other digit
				digit *= 2; //multiplies digit by 2
				if (digit >= 10) { // if the new digit is greater than 10
					digitDoubled1 = digit % 10; //Calculates ones digit
					digitDoubled2 = digit / 10; //calculates tens digit
					sumDoubledDigits += digitDoubled1 + digitDoubled2; //Accumulates sum of every doubled digit
				} else { //digit is less than 10 so the number is the same as the digit
				sumDoubledDigits += digit; //Adds the number to the accumulating sum
		}
			
		} else { //Continues if statement that does calculations with every other digit
			sumEveryOther += digit; //Accumulates the sum of every other digit beginning with the ones digit
		}
		
		}
		if ((sumEveryOther + sumDoubledDigits) % 10 == 0) { //If when added together the two sums are divisible by 10
			System.out.println("Your number is valid. ");//Displays message saying number is valid because 
														//the two sums are divisible by 10
		} else { //Determined that the sums aren't divisible by 10
			System.out.println("Your number is invalid...uh oh."); //displays comical message that the entered number isn't valid
		}
	}
}