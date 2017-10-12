/* While Loop Practice
 * Aidan Gordon
 * 10/10/17
 * This program accomplishes different tasks by using while loops
 */
public class WhileLoopPractice {

	public static void main(String[] args) {
		//Tests stars method with sample values
		stars(2);
		stars(3);
		stars(10);
		stars(-1);
		
		//Declares variables for each of the tasks
		int counter = 10;
		int cntr = 1;
		int increment = 9;
		
		//Prints Liftoff sequence starting at 10 and counting down
		while (counter >= 2) {
			System.out.print(counter + "...");
			counter--;
		}
		System.out.println(counter + "...Liftoff!");
		
		//Prints out all the odd numbers from 1-100 
		while (cntr < 100) {
			System.out.println(cntr);
			cntr += increment;
		}
	}
	
	//Prints out a specified number of stars in a row
	public static void stars(int numberStars) {
		//Declares counter variable
		int counter = 1;
		
		//Prints specified number of stars 
		while (counter <= numberStars) {
			System.out.print("*");
			counter++;
		}
		System.out.println(); //Prints a blank line for formatting
	}
}
