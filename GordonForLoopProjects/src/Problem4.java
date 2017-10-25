import java.util.Scanner;

/*
 * Triangle Right
 * Aidan Gordon
 * 10/24/17
 * This program prints a triangle of user specified size that is comprised of the natural
 * numbers starting from one and going to the user entered size number. This triangle begins with
 * the first integer on the right and continuing to the left
 */
public class Problem4 {

	public static void main(String[] args) {
		//Declares variable for user input
		int size;
				
		//Instantiates the Scanner
		Scanner in = new Scanner(System.in);
				
		//Prompts user for input and stores entered size in "size" variable
		System.out.print("Enter a size: ");
		size = in.nextInt();
		
		//Prints blank line for formatting
		System.out.println();
				
		//Goes to "triangleLeft" method to print a triangle of user specified size
		triangleRight(size); 
				
		//Closes Scanner
		in.close();
	}
	
	public static void triangleRight(int size) {
		int counter;
		for (counter = 1; counter <= size; counter++) {
			for (int count = 1; count <= counter; count++) {
				System.out.print(counter);
			}
			System.out.println();
		}

	}
}
