/*
 * Our First Class
 * Aidan Gordon
 * 11/6/17
 */
public class Cat {
	//Instance Variables
	private int age;
	private String name;
	
	//Default Constructor
	public Cat() {
		name = "";
		age = 0;
	}
	
	//Copy Constructor
	public Cat(Cat copyCat) {
		age = copyCat.age;
		name = copyCat.name;
	}
	
	//Constructor Method - called when we make a new instance of an object
	public Cat(int newAge, String newName) {
		age = newAge;
		name = newName;
	}
	
	//Accessor to get the Cat's Age
	public int getAge() {
		return age;
	}
	
	//Accessor to get the Cat's name
	public String getName() {
		return name;
	}
	
	//Mutator for Age
	public void setAge(int newAge) {
		age = newAge;
	}
	
	//Mutator for name  
	public void setName(String newName) {
		name = newName;
	}
	
	//Behaviors of A Cat (methods)
	
	//Cat behavior meows and says name
	public void meow() {
		System.out.println("Meow! I'm " + name);
	}
	
	//Cat has a birthday (behavior)
	public void celebrateBirthday() {
		age += 1;
	}
	
}
