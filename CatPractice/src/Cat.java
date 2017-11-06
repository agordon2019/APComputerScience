/*
 * Our First Class
 * Aidan Gordon
 * 11/6/17
 */
public class Cat {
	//Instance Variables
	private int age;
	private String name;
	
	//Constructor Method - called when we make a new instance of an object
	public Cat(int newAge, String newName) {
		age = newAge;
		name = newName;
	}
	
	//Behaviors of A Cat (methods)
	public void meow() {
		System.out.println("Meow! I'm " + name);
	}
}
