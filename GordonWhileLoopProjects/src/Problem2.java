/*
 * Problem 2 Project 4.6 Population Growth
 * Aidan Gordon
 * 10/12/17
 * This program allows the user to enter in a population the initial number of
 * organisms, the rate of growth, the number of hours the population takes to 
 * achieve this rate, and the number of hours the population grows.
 */

import java.util.Scanner; //Imports Scanner for user input
public class Problem2 {

	public static void main(String[] args) {
		//Declare variables for calculations and user input
		int initialPopulation, growthRate, numberHoursAchieved, numberHoursGrows;
		
		//Instantiates Scanner
		Scanner in = new Scanner(System.in);
		
		//Prompts user for initial population input
		System.out.print("Enter the intial number of organisms: ");
		initialPopulation = in.nextInt(); //Stores input in initalPopulation variable
		
		//Prompts user for growth rate input
		System.out.print("Enter growth rate of the population: ");
		growthRate = in.nextInt(); //Stores input in growthRate variable
		
		//Prompts user to input number of hours population takes to achieve growth rate
		System.out.print("Enter number of hours it takes to achieve the growth rate: ");
		numberHoursAchieved = in.nextInt(); //Stores input in numberHoursAchieved variable
		
		//Prompts user to input number of hours the population grows
		System.out.print("Enter number of hours the population grows: ");
		numberHoursGrows = in.nextInt(); //Stores input in numberHoursGrows variable
		
		//Close Scanner
		in.close();
		
		//Calculates predicted population
		while (numberHoursGrows >= numberHoursAchieved) { //while the specified number of hours the population grows is less than the number of hours it takes to achieve the growth rate
			initialPopulation *= growthRate; //Multiplies previous initial population by the growth rate to get new population 
			numberHoursGrows -= numberHoursAchieved; //subtracts number of hours achieved from the number of total hours it grows
		}
		System.out.println("The predicted population is " + initialPopulation + "."); //Prints the predicted population
		
	}

}
