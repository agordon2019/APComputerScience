/*
 * ArrayList Projects
 * Aidan Gordon
 * 2/8/18
 */

import java.util.*; //Imports all classes from java.util
public class GordonArrayListProjects {

	public static void main(String[] args) {
		//Creates a new ArrayList for testing
		List<String> list = new ArrayList<String>();
		list.add("the");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		
		List<String> fig = new ArrayList<String>();
		fig.add("I");
		fig.add("like");
		fig.add("fig");
		fig.add("FIG");
		
		List<String> plurals = new ArrayList<String>();
		plurals.add("button");
		plurals.add("buttons");
		plurals.add("dogs");
		plurals.add("cat");
		
		//Tests addStars method
		addStars(list);
		System.out.println(list);
		System.out.println(); //Prints a blank line for formatting
		
		//Tests removeStars method
		removeStars(list);
		System.out.println(list);
		System.out.println(); //Prints a blank line for formatting
		
		//Tests the reverseList method
		reverseList(list);
		System.out.println(list);
		System.out.println(); //Prints a blank line for formatting
		
		//Tests the removeFig method
		removeFigs(fig);
		System.out.println(fig);
		System.out.println(); //Prints a blank line for formatting
		
		//Tests the reverseCapitalizePlurals method
		reverseCapitalizePlurals(plurals);
		System.out.println(plurals);
		System.out.println(); //Prints a blank line for formatting
		
		//Tests the removeEvenLength method
		removeEvenLength(plurals);
		System.out.println(plurals);
		System.out.println(); //Prints a blank line for formatting
	}
	
	//Method for problem 1 that adds a star after each element in a given ArrayList
	public static void addStars(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.add(i + 1, "*");
			i++;
		}
	}
	
	//Method for problem 2 that removes a star after each element in a given ArrayList
	public static void removeStars(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.remove(i + 1);
		}
	}
	
	//Method for problem 3 that reverses the elements of an ArrayList
	public static void reverseList(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			list.add(list.get(list.size() - 1 - i));
			i++;
		}
		int listSize = list.size();
		for (int i = 1; i <= listSize / 2; i++) {
			list.remove(0);
		}
	}
	
	//Method for problem 4 that removes all instances of the word "Fig" in a given ArrayList
	public static void removeFigs(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i).toLowerCase();
			if (str.equals("fig")) {
				list.remove(i);
				i--;
			}
		}
	}
	
	//Method for problem 5 that replaces every word ending with an "s" in an ArrayList of strings
	//with its uppercased and reversed version
	public static void reverseCapitalizePlurals(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.endsWith("s")) {
				list.set(i, reverseString(list.get(i)).toUpperCase());
			}
		}
	}
	
	//Method that reverses a string for use in problems
	public static String reverseString(String str) {
		String newStr = "";
		for (int i = str.length(); i > 0; i--) {
			newStr += str.substring(i - 1, i);
		}
		return newStr;
	}
	
	//Method for problem 6 that removes all Strings in a given ArrayList that have an even length
	public static void removeEvenLength(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.length() % 2 == 0) {
				list.remove(i);
				i--;
			}
		}
	}
	
	//Method for problem 7 that
}
