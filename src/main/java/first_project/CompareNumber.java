package first_project;

import java.util.*;

// Class to get a number from the user and echo back if the number
// is greater than or less than 10
@SuppressWarnings("javadoc")
public class CompareNumber {
	// Create the scanner object
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable to hold the number and user input
		int num_value = 10;
		int user_value;

		System.out.println("Enter a number: ");
		user_value = scanner.nextInt();
		if (num_value > user_value) {
			System.out.println(user_value + " is less than 10.");
		} else if (num_value == user_value) {
			System.out.println(user_value + " Is 10");
		} else {
			System.out.println(user_value + " is greater than 10");
		}
	}
}