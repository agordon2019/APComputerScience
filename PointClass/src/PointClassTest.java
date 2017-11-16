/*
 * Point Class Test 
 * Aidan Gordon
 * 11/11/17
 * This program tests the point class
 */
public class PointClassTest {

	public static void main(String[] args) {
		//Creates new Points using Point class
		Point point1 = new Point();
		Point origin = new Point();
		Point point3 = new Point(4.0, 4.0);
		Point point2 = new Point(1.0, 2.0);
		Point quadrant1 = new Point(2.0, 2.0);
		Point quadrant2 = new Point(-2.0, 2.0);
		Point quadrant3 = new Point(-2.0, -2.0);
		Point quadrant4 = new Point(2.0, -2.0);
		Point quadrant0 = new Point(0.0, 2.0);
		
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
		System.out.println(point1);
		
		//Tests equals Method
		point2.setLocation(4.0, 4.5); //Sets point 2 equal to point one in order to get true
		System.out.println(point1.equals(point2));
		
		//Tests quadrant method
		System.out.println(quadrant1.quadrant());
		System.out.println(quadrant2.quadrant());
		System.out.println(quadrant3.quadrant());
		System.out.println(quadrant4.quadrant());
		System.out.println(quadrant0.quadrant());
		
		//Tests the isVertical method
		System.out.println(quadrant1.isVertical(quadrant4));
		
		//Tests flip method
		point2.flip();
		System.out.println(point2);
		
		//Tests rotate method
		point2.setLocation(1.0, 1.0);
		point2.rotate(Math.PI/2.0, 0, 0);
		System.out.println(point2);
		
		//Tests manhattan distance method
		System.out.println(point2.manhattanDistance(origin));
		
		//Tests slope method
		System.out.println(point2.slope(origin));
		System.out.println(quadrant2.slope(origin));
		
		//Tests collinear method
		System.out.println(origin.isCollinear(point2, point3));
	}
}
