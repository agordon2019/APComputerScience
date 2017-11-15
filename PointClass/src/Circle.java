/*
 * Circle Class
 * Aidan Gordon
 * 11/14/17
 * This is a class made to model a circle in the x-y plane
 */

public class Circle {
	//Declares Instance Variables
	private double radius;
	private Point center = new Point();
	
	//Default Constructor
	public Circle() {
		center.setX(0);
		center.setY(0);
		radius = 1;
	}
	
	//Constructor for just a given radius
	public Circle(double newRadius) {
		center.setX(0);
		center.setY(0);
		radius = newRadius;
	}
	
	//Constructor for just a given center
	public Circle(Point newCenter) {
		radius = 1;
		center.setLocation(newCenter.getX(), newCenter.getY());
	}
	
	//Constructor for a given center and radius
	public Circle(Point newCenter, double newRadius) {
		radius = newRadius;
		center.setLocation(newCenter.getX(), newCenter.getY());
	}
	
	//Accessor for the radius
	public double getRadius() {
		return radius;
	}
	
	//Accessor for center point
	public Point getCenter() {
		return center;
	}
	
	//Mutator for radius
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	//Mutator for center point
	public void setCenter(Point newCenter) {
		center = newCenter;
	}
	
	//Method that determines whether or not a point lies within the circle
	public boolean inCircle(Point p) {
		//Gets the distance between the center point and the given point and checks if it is
		//less than the radius of the circle
		if (center.distance(p) <= radius) {
			return true; //returns true because point is inside circle
		} else {
			return false;//returns false because point is outside circle
		}
	}
	
	public String toString() {
		return "Raidus: " + radius + " Center: " + center.toString();
	}
}
