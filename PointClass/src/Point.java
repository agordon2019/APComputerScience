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
}
