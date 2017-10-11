/*
 * Conditional Statement Practice Homework #3 and #4
 * Aidan Gordon
 * This program creates a new method to find the absolute value of a number with out using
 * the math class and then uses that method to calculate which of three integers has the 
 * greatest absolute value
 */


public class ConditionalStatementsHW3and4 {

	public static void main(String[] args) {
		//Tests the absValue method without getting input
		System.out.println(absValue(2));
		System.out.println(absValue(5));
		System.out.println(absValue(10));
		System.out.println(absValue(0));
		System.out.println(absValue(-2));
		System.out.println(absValue(-6));
		System.out.println(absValue(-11));
		
		//Tests the findLargest Method
		System.out.println(findLargest(2,3,4));
		System.out.println(findLargest(4,3,2)); //Tests for random positive integers
		System.out.println(findLargest(2,4,3));
		System.out.println(findLargest(7,6,2));
		System.out.println(findLargest(15,-6,-20));
		System.out.println(findLargest(20,-4,2));
		System.out.println(findLargest(-20,-10,5)); //Tests with negative integers
		System.out.println(findLargest(-20,-30,5));
		System.out.println(findLargest(30,-40,5));
		System.out.println(findLargest(2,-1,0)); //Tests with zero
		System.out.println(findLargest(-2,-1,0));
		System.out.println(findLargest(2,2,1));
		System.out.println(findLargest(-3,3,0));
		System.out.println(findLargest(0,3,3)); //Tests with integers that have equal absolute values
		System.out.println(findLargest(3,0,-3));
	}
	
	//Method that calculates absolute value of a number without using the Math class
	public static int absValue(int number) {
		//Determines whether number is greater than 0 or not
		if (number >= 0) { //number is greater than 0
			return number; //so the number itself is its absolute value and thus returns number
		} else { //number must be less than 0
			return number - number - number; //takes the number and does a calculation to get the value
		                                     //back to 0 then adds the number again to get the number's absolute value
		                                     //but the calculation using subtraction to add the numbers because the number's value is negativr
		}
	}
	public static int findLargest(int a, int b, int c) {
		//Declares new variables for the absolute value of the integers
		int absA, absB, absC;
		//Calculates absolute values using previously made absValue method
		absA = absValue(a);
		absB = absValue(b);
		absC = absValue(c);
		
		//Determines which integer is the largest and prints it
		if (absA >= absB && absA >= absC) { //Determines the absolute value of integer a is greater and returns it
			return a;
		} else if (absB >= absA && absB >= absC) { //determines that the absolute value of b is greater and returns it
			return b;
		} else { //determines that the absolute value of c is larger by process of elimination and returns it
			return c;
		}
	}
}
