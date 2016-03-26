// Write a program that can ask the user for a grade value
// and print the associated grade letter.

package first_project;

import java.util.*;

@SuppressWarnings("javadoc")
public class GradeValue {

	// Create the scanner object
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Define the variable for the user input
		System.out.println("Enter your grade please: ");
		String input = scanner.nextLine();
		double user_gpa = Double.parseDouble(input);

		if (user_gpa <= 0) {
			System.out.println("Did you even attend the class?!?!" + " You totally flunked with an F!!");

		} else if (user_gpa <= 1) {
			System.out.println("You barely made it with an D!" + " You should take this class again");

		} else if (user_gpa <= 2) {
			System.out.println("You did OK with a C." + " You should take this class again");

		} else if (user_gpa <= 3) {
			System.out.println("You did good with a B.");

		} else if (user_gpa <= 4) {
			System.out.println("You did great. You earned an A!" + " Good Job!");
		} else
			System.out.println("You are totally lying. EOL.");
	}
}