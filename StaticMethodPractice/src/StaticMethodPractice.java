
public class StaticMethodPractice {

	public static void main(String[] args) {
		//I pushed this to Git
		wholeLine(); //Top of the top box
		side(); //Side of top box
		side();
		side();
		wholeLine(); //Bottom of top box
		wholeLine(); //Top of bottom box
		side(); //Side of bottom box
		side();
		side();
		wholeLine(); //Bottom of bottom box
	}
	//Creates a whole line of asterisks
	public static void wholeLine(){
		System.out.println("***********" );
	}
	//Creates two asterisks that are spread out for the sides
	public static void side(){
		System.out.println("*         *");
	}
}
