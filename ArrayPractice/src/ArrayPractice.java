/*
 * Array In-Class Practice 
 * Aidan Gordon
 * 12/11/17
 */
public class ArrayPractice {

	public static void main(String[] args) {
		//Declares array named intArray
		int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		int greaterThanCounter = 0;
		
		//Prints each element of the array
		for (int counter = 0; counter < intArray.length; counter++) {
			System.out.print(intArray[counter] + " ");
		}
		
		//Prints blank line for formatting
		System.out.println();
		
		//Prints the values in an array in reverse
		for (int counter = intArray.length - 1; counter >= 0; counter--) {
			System.out.print(intArray[counter] + " ");
		}
		
		//Prints blank line for formatting
		System.out.println();
		
		//Prints the sum of all the integers in an integer array
		for (int counter = 0; counter < intArray.length; counter++) {
			sum += intArray[counter];
		}
		System.out.println(sum);
		
		//Finds an element in an array (determines if the number "7" is in the array
		boolean isInArray = false;
		for (int counter = 0; counter < intArray.length; counter++) {
			if (intArray[counter] == 7) {
				isInArray = true;
				break;
			} 
		}

		if (isInArray == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		//Determines the first location of an item in an array
		for (int counter = 0; counter < intArray.length; counter++) {
			if (intArray[counter] == 5) {
				System.out.println(counter);
				break;
			}
		}
		
		//Finds how many values are greater than 5 in an array
		for (int counter = 0; counter < intArray.length; counter++) {
			if (intArray[counter] > 5) {
				greaterThanCounter++;
			}
		}
		System.out.println(greaterThanCounter);
	}

}
