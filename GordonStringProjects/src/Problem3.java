/*
 * Three Characters
 * 11/5/17
 * Aidan Gordon
 * This program accepts an index and a string as an input. The program then prints the entered
 * string but starting from the entered index and it only can contain three characters. If the
 * entered index isn't small enough to get three characters then the program prints the first 
 * three characters of the entered String
 */

import java.util.Scanner; //Imports Scanner
public class Problem3 {

	public static void main(String[] args) {
		//Declares variable for user input
		String str;
		int index;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts the user for string and stores string in "str" variable
		System.out.print("Please enter a string: ");
		str = in.nextLine();
		
		while (str.length() < 3) { //Checks to see if entered String is long enough
			System.out.println("Your string is not long enough.");
			System.out.print("Please enter a string: "); //Reprompts user to enter string
			str = in.nextLine(); //Updates "str" variable with user input
		}
		
		//Prompts user for index and stores entered index in "index" variable
		System.out.print("Please enter an index: ");
		index = in.nextInt();
		
		//Closes Scanner
		in.close();
		
		//Goes to threeChars method to complete problem then prints results
		System.out.println(threeChars(str, index));
		
	}
	public static String threeChars(String str, int index) {
		//Determines if you can get three characters from the given string and index
		if (str.length() - 3 < index) {
			return str.substring(0, 3); //Returns the first three character if it isn't possible
		} else {
			return str.substring(index, index + 3);
			//Otherwise it returns the substring starting at the index that the user entered 
			//and continuing for the next three characters 
		}
		
	}
}
