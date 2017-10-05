/*
 * 
 * Aidan Gordon
 * 10/2/17
 * This program finds the largest of two integers without using the Math class
 */

public class IfStatementPractice {

	public static void main(String[] args) {
		//Goes to greatestInt method to find the largest integers of the two numbers
		System.out.println(greatestInt(7, 2));
		System.out.println(greatestInt(6, 3));
		System.out.println(greatestInt(4, 9));
		System.out.println(greatestInt(-100, -76));
		//finds quotient and remainder of integer division
		System.out.println(quotient(2,7) + " r" + remainder(2,7));
		System.out.println(quotient(7,2) + " r" + remainder(7,2));
		System.out.println(quotient(2,7) + " r" + remainder(7,2));
		System.out.println(quotient(7,2) + " r" + remainder(2,7));
		System.out.println(quotient(2,7) + " r" + remainder(2,7));
		System.out.println(quotient(2,7) + " r" + remainder(2,7));
	}
	//Finds the greatest of two integers using if-else statements
	public static int greatestInt(int num1,int num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	//Project4.1
	
	//Method that calculates ONLY the quotient of two numbers
	public static int quotient(int num1, int num2) {
		int largerInt;
		int smallerInt; //Declares variables for integers
		int quotient;
		largerInt = greatestInt(num1, num2); //Gets larger integer
		smallerInt = Math.min(num1, num2); //Gets smaller integer
		quotient = largerInt / smallerInt; //Calculates quotient
		return quotient;
	}
	
	//Method that calculates ONLY the remainder of two numbers
	public static int remainder(int num1, int num2) {
		int largerInt;
		int smallerInt; //Declares variables for integers
		int remainder;
		largerInt = greatestInt(num1, num2); //Gets larger integer
		smallerInt = Math.min(num1, num2); //Gets smaller integer
		remainder = largerInt % smallerInt; //Calculates remainder
		return remainder;
	}
	
	//Project4.2
	
		public static boolean rightTriangle(int leg1, int leg2, int hypotenuse) {
			if (hypotenuse == Math.sqrt((leg1* leg1) + (leg2 *leg2))) {
				return true;
			} else {
				return false;
			}
			
		}
		
		//Project 4.3
}
