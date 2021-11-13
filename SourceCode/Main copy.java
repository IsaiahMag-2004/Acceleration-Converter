/**
 Taking in the varibales required, converts velocity, and time to the acceleration of an object (Object can be: Person, or thing)
 @author Isaiah Magana
 
 Main.java
*/
import java.util.Scanner;

public class Main {
	/**
	 Main method to run program
	*/
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double initial_velocity, final_velocity, acceleration, time;
	String units;
	
	System.out.println("Enter the final velocity of the object");
	final_velocity = input.nextDouble();
	System.out.println("Enter the inital velocity of the object");
	initial_velocity = input.nextDouble();
	System.out.println("Enter the change in time");
	time = input.nextDouble();
	System.out.println("Enter the units your gonna be using");
	units = input.next();

	acceleration = Math.round((final_velocity - initial_velocity) / time * 100) / 100.0;

	System.out.println("The objects acceleration is " + acceleration + units);			

	}
}
