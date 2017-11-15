/*
 * Point Class Test 
 * Aidan Gordon
 * 11/11/17
 * This program tests the point class
 */
public class PointClassTest {

	public static void main(String[] args) {
		//Creates two new Points using Point class
		Point point1 = new Point();
		Point point2 = new Point(1.0, 2.0);
		
		//Tests Accessor for X and Y Coordinates and the Constructor with Points
		System.out.println(point2.getX() + ", " + point2.getY());
		
		//Test Accessor for X and Y Coordinates and the Default Constructor
		System.out.println(point1.getX() + ", " + point1.getY());
		
		//Tests Mutator for X Coordinate
		point1.setX(2.5);
		
		//Tests Mutator for Y Coordinate
		point1.setY(1.2);
		
		//Shows if Mutator worked by printing new Point
		System.out.println(point1.getX() + ", " + point1.getY());
		
		//Tests Distance 
		System.out.println(point1.distance(point2));
		
		//Tests Set Location Method
		point1.setLocation(2.0,  3.0);
		
		System.out.println(point1.getX() + ", " + point1.getY());
		
		//Tests Translation Method
		point1.translate(2.0, 1.5);
		
		System.out.println(point1.getX() + ", " + point1.getY());
		
		//Tests toString method
		System.out.println(point1.toString());
		
		//Tests equals Method
		point2.setLocation(4.0, 4.5); //Sets point 2 equal to point one in order to get true
		System.out.println(point1.equals(point2));
	}
}
