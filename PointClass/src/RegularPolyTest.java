/*
 * Regular Poly Test
 * Aidan Gordon
 * 11/15/17
 * This program tests accessors, mutators, and methods in the regular poly class
 */
public class RegularPolyTest {

	public static void main(String[] args) {
		//Tests constructors
		regularPoly unitTriangle = new regularPoly(3);
		regularPoly triangle2 = new regularPoly(3, 2.0);
		
		//tests Accessor for the number of sides
		System.out.println(unitTriangle.getNumSides());
		
		//tests accessor for the side length
		System.out.println(triangle2.getSideLength());
		
		//Tests mutator for number of sides
		unitTriangle.setNumSides(4);
		System.out.println(unitTriangle.getNumSides());
		
		//Tests mutator for side length
		triangle2.setSideLength(3.0);
		System.out.println(triangle2.getSideLength());
	}

}
