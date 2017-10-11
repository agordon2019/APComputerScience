/*
 * Unique Digits Homework Problem
 * Aidan Gordon
 * This program takes a three digit integer and returns true if the digits
 * of the integer are unique and returns false if they aren't unique
 */
public class UniqueDigits {
	
	public static void main(String[] args) {
		//tests the uniqueDigits method without getting input 
		System.out.println(uniqueDigits(232));
		System.out.println(uniqueDigits(432));
		System.out.println(uniqueDigits(567));
		System.out.println(uniqueDigits(888));
		System.out.println(uniqueDigits(123));
		System.out.println(uniqueDigits(433));
		System.out.println(uniqueDigits(905));
	}

	public static boolean uniqueDigits(int threeDigitInteger) {
		
		//Declares variables to store digits in
		int digit1, digit2, digit3;
		
		//calculates individual digits of the integer
		digit1 = threeDigitInteger / 100;
		digit2 = threeDigitInteger / 10 - (digit1 * 10);
		digit3 = threeDigitInteger - (digit2 * 10) - (digit1 * 100);
		
		//Determines if the digits are unique and returns true or false accordingly
		if (digit1 != digit2 && digit1!= digit3 && digit2 != digit3) {
			return true; //determines that none of the digits are the same and thus returns true
		} else {
			return false;  //determines that at least two of the digits are equal and thus returns false
		}
	}
}
