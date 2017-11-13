/*
 * Cat Test (tests newly made method)
 * Aidan Gordon
 * 11/6/17
 */
public class CatTest {
	
	public static void main(String[] args) {
		//Creates new cat "josef" with name "josef" and age 4
		Cat josef = new Cat(4, "Josef");
		
		//Calls Meow method from cat class
		josef.meow();
		
		//Creates new cat "Steven" that is a copy of the cat Josef
		Cat steven = new Cat(josef);
		
		//Calls meow method from Cat class
		steven.meow();
		
		//Prints Josef's age by using accessor in cat class
		System.out.println(josef.getAge());
		
		//Prints Josef's name by using accessor in Cat class
		System.out.println(josef.getName());
		
		//Josef has a birthday so age is now 5
		josef.setAge(5);
		
		//Tests to see if his age changed
		System.out.println(josef.getAge());
		
		//josef has changed his name
		josef.setName("Vladmir");
		
		//tests to see if Josef's name changed
		System.out.println(josef.getName());
		
		//Celebrates the cat's birthday and increments his age by one
		josef.celebrateBirthday();
		
		//Tests to see if his age changed
		System.out.println(josef.getAge());
	}
}
