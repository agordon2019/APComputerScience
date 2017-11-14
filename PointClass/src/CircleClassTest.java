/*
 * Circle Class Test
 * Aidan Gordon
 * 11/14/17
 * This program tests the Circle Class
 */

public class CircleClassTest {

	public static void main(String[] args) {
		//Tests all four constructors
		Point center = new Point(1.0, 1.0);
		Circle unitCircle = new Circle();
		Circle unitRaidus = new Circle(center);
		Circle centerOrigin = new Circle(2.0);
		Circle circle = new Circle(center, 2.0);
	}

}
