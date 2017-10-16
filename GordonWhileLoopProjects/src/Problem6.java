/*
 * Problem 6 Collatz Sequence
 * Aidan Gordon
 * 10/15/17
 * This program takes a number as input  and prints the following process: if it is even the number 
 * is divided by two and if it is odd then the number is multiplied by 3 then one is added to it.
 * The program continues this process until the pattern reaches one.
 */

import java.util.Scanner; //Imports Scanner
public class Problem6 {

	public static void main(String[] args) {
		//Declares variables for number
		int number;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user to input a number
		System.out.print("Starting number: ");
		number = in.nextInt();
		
		System.out.print(number + "\t");
		while (number != 1) {
			if (number % 2 == 1) {
				number = number * 3 + 1;
				System.out.print(number + "\t");
			}
			if (number % 2 == 0) {
				number /= 2;
				System.out.print(number + "\t");
			}
		}
	}

}
