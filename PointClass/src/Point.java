/*
 * Point Class Method Practice
 * 11/11/17
 * Aidan Gordon
 * This is a class made for any point on the coordinate system
 */

public class Point {
	//Declares Instance Variables
	private double x;
	private double y;
	
	//Default Constructor
	public Point() {
		x = 0.0;
		y = 0.0;
	}
	
	//Constructor With Points
	public Point(double newX, double newY) {
		x = newX;
		y = newY;
	}
	
	//Accessor To Get X Coordinate
	public double getX() {
		return x;
	}
	
	//Accessor To Get Y Coordinate
	public double getY() {
		return y;
	}
	
	//Mutator to Change X Coordinate
	public void setX(double newX) {
		x = newX;
	}
	
	//Mutator to Change Y Coordinate 
	public void setY(double newY) {
		y = newY;
	}
	
	//Method that Gets Distance
	public double distance(Point p) {
		return Math.sqrt((Math.pow(p.getX() - x, 2.0)) + Math.pow((p.getY() - y), 2.0));
	}
	
	//Method That Sets Location
	public void setLocation(double newX, double newY) {
		x = newX;
		y = newY;
	}
	
	//Method that translates a point
	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}
	
	//Method that changes point into a String
	public String toString() {
		return x + ", " + y;
	}
	
	//Method that returns whether or not the two points are equal
	public boolean equals(Point p) {
		//DONT NEED TO USE GET X OR Y BECAUSE WE ARE INSIDE POINT CLASS	
		if (p.x == x && p.y == y) {
			return true;
		} else {
			return false;
		}
		
	}
	
	//Method that returns what quadrant the point is in
	public String quadrant() {
		if (x > 0 && y > 0) { //Determines that the point is in Quadrant I
			return "Quadrant I"; //Returns Quadrant I
		} else if (x < 0 && y > 0) { //Determines that the point is in Quadrant II
			return "Quadrant II"; //returns Quadrant II
		} else if (x < 0 && y < 0) { //Determines that the point is in Quadrant III
			return "Quadrant III"; //Returns Quadrant III
		} else if (x > 0 && y < 0) { //Determines that the point is in Quadrant IV
			return "Quadrant IV"; //Returns Quadrant 4
		} else { //Determines that One of the points must be on an axis
			return "0"; //Returns 0
		}
	}
	
	//Method that returns whether or not two points are vertical
	public boolean isVertical(Point p) {
		if (p.x == x) { //Determines if the x values of the two points are equal
			return true; //Returns true if x values are equal
		} else {
			return false; //Returns false otherwise
		}
	}
	
	//Method that returns a point with its swapped and negated x and y values
	public void flip() {
		double originalX = x;
		x = -y; //Negates the y value and makes it the point's x value
		y = -originalX; //Negates the x value and makes it the point's y value
	}
	
	//Method that rotates the point a given degrees
	public void rotate(double angle, int xCenter, int yCenter) {
		//Rotates x coordinate
		x = Math.cos(angle) * (x - xCenter) - Math.sin(angle)*(y - yCenter) + xCenter;
		//Rotates y coordinate
		y = Math.sin(angle) * (x - xCenter) - Math.cos(angle)*(y - yCenter) + xCenter;
	}
	
	//Method that returns the Manhattan distance between two points
	public double manhattanDistance(Point point) {
		//calculates the manhattan distance by finding the difference between the x and y values
		return (Math.abs(x - point.x) + Math.abs(y - point.y));
	}
	
	//Method that returns the slope between two points
	public double slope(Point point) {
		//calculates the slope
		return (y - point.y) / (x - point.x);
	}
	
	//Method that returns whether or not a point is collinear with two given points
	public boolean isCollinear(Point point1, Point point2) {
		//Determines if the slopes from the point to the first and second point are equal
		if (this.slope(point1) - this.slope(point2) <= .00001) {
			return true; //returns true because the points are collinear
		} else {
			return false; //returns false otherwise
		}
	}
}
