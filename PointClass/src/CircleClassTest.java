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
		Point circleTestCenter = new Point(12.0, 2.0);
		Point origin = new Point();
		Circle unitCircle = new Circle();
		Circle unitRadius = new Circle(center);
		Circle centerOrigin = new Circle(2.0);
		Circle circle = new Circle(center, 2.0);
		Circle inCircleTest = new Circle(circleTestCenter, .5);
		
		//Tests accessor for radius
		System.out.println(circle.getRadius());
		
		//Tests accessor for center point
		System.out.println(circle.getCenter().toString());
		
		//Tests mutator for radius
		circle.setRadius(3.0);
		System.out.println(circle.getRadius());
		
		//Tests mutator for center point
		Point newCenter = new Point(2.0, 2.0);
		circle.setCenter(newCenter);
		System.out.println(circle.getCenter().toString());
		
		//Tests the "inCircle" method
		System.out.println(unitCircle.inCircle(origin));
		System.out.println(unitCircle.inCircle(center));
		System.out.println(centerOrigin.inCircle(center));
		System.out.println(centerOrigin.inCircle(newCenter));
		System.out.println(unitRadius.inCircle(newCenter));
		System.out.println(inCircleTest.inCircle(circleTestCenter));
		
		//Tests to String method
		System.out.println(unitCircle.toString());
	}

}
