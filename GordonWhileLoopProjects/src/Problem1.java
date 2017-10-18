/*
 * Problem 1 While Loop Projects
 * Aidan Gordon
 * 10/12/17
 * This program adds up consecutive numbers until the sum is greater than 1 million
 */

public class Problem1 {

	public static void main(String[] args) {
		//Declares variable for calculations
		int sum = 0, counter = 0;
		
		//Determines how many consecutive integers you add
		//before the sum is greater than 1 million
		while (sum < 1000000) { //While the sum is less than 1 million
			counter++; //Increments counter 
			sum += counter; //Accumulates the sum of the first "n" integers until the sum is over 1 million
		}
		//Prints the counter which is the the number that makes the sum over 1 million
		System.out.println(counter);
	}

}
