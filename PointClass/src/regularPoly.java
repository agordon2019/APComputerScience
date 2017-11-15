/*
 * Regular Polygon Class
 * Aidan Gordon
 * 11/15/17
 * This program is a class for a regular polygon
 */
public class regularPoly {
	//Declares instance variables
	private int numSides;
	private double sideLength;
	
	//Constructor with default side length one
	public regularPoly(int newNumSides) {
		numSides = newNumSides;
		sideLength = 1.0;
	}
	
	//Constructor for given side length and number of sides
	public regularPoly(int newNumSides, double newSideLength) {
		numSides = newNumSides;
		sideLength = newSideLength;
	}
	
	//Accessor for number of sides
	public int getNumSides() {
		return numSides;
	}
	
	//Accessor for side length
	public double getSideLength() {
		return sideLength;
	}
	
	//Mutator for number of sides
	public void setNumSides(int newNumSides) {
		numSides = newNumSides;
	}
	
	//Mutator for side length
	public void setSideLength(double newSideLength) {
		sideLength = newSideLength;
	}
	
	//Method that converts the polygon to a string
	public String toString() {
		return "Side Length: " + sideLength + "Number of Sides: " + numSides;
	}
	
	//Method that determines whether or not two polygons are the same
	public boolean equals(regularPoly polygon) {
		//Determines if the side length and number of sides are the same
		if (sideLength == polygon.sideLength && numSides == polygon.numSides) {
			return true; //returns true because the number of sides and the side length of
						 //both polygons are the same
		} else {
			return false; //returns false because polygons aren't the same
		}
	}
}
