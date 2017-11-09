/*
 * Yak Removed
 * Aidan Gordon
 * 11/6/17
 * This program removes the unlucky string of character "yak" from any entered string
 */

import java.util.Scanner; //Imports Scanner
public class Problem5 {

	public static void main(String[] args) {
		//Declares Variable for input
		String str;
		
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user for input and stores input in "str" variable
		System.out.print("Please enter a string: ");
		str = in.nextLine();
		
		//Closes Scanner
		in.close();
		
		//Goes to "noYak" method to remove any "yak" string of characters in the entered string
		System.out.println(noYak(str));
		
	}
	public static String noYak(String str) {
		//While there is still a "yak" string of characters in the string
		while (str.indexOf("yak") >= 0) {
			//Omits the first "yak" characters that occur and goes back to condition to
			//check if there is another occurence of the string of characters
			str = str.substring(0, str.indexOf("yak")) + str.substring(str.indexOf("yak") + 3);
		}
			return str; //Returns the string after all the "yak"s have been removed
	}
}
