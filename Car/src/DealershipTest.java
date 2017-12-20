/*
 * Dealership Test Class
 * Aidan Gordon
 * 12/20/17
 */
public class DealershipTest {

	public static void main(String[] args) {
		
		//Declares cars to put in dealership
		Car car1 = new Car(2014, "Honda", "Accord", "White");
		Car car2 = new Car(2015, "Toyota", "Camry", "Red");
		Car car3 = new Car(2013, "Honda", "Civic", "Blue");
		
		//Put cars in the array
		Car[] carArray = {car1, car2, car3};
		
		//Creates a new dealership using the array
		Dealership dealer = new Dealership("Joyal's Cars", carArray);
		
		//Print the dealer info
		System.out.println(dealer);
		
		//Create your own dream car
		Car dreamcar = new Car(2015, "Toyota", "Camry", "Red");
		
		//Check if dealer has our dreamcar in stock
		System.out.println(dealer.inStock(dreamcar));
	}
}
