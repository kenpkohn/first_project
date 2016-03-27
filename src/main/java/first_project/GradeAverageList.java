package first_project;

import java.util.*;

public class GradeAverageList {
	static double avgGrade;

	// Declaring our variables
	static double count;
	static boolean hasMoreNumbers = true;
	// Create the scanner object
	static Scanner scanner = new Scanner(System.in);
	static double totalSum;

	public static void main(String[] args) {
		while (hasMoreNumbers) {
			// Adds grade value to the totalSum of grades
			addGradeValue();
			// Sets the condition to the result of method that asks user
			// whether they want to continue
			hasMoreNumbers = askUserForMoreInput();
		}
		// Calculate the average for the grades supplied
		evaluateGrade();
		// Display the average grade calculated
		displayGrade();
	}

	/**
	 *
	 */
	private static void addGradeValue() {
		System.out.println("Enter grade value " + (count + 1) + "i");
		String input = scanner.nextLine();
		double num = Double.parseDouble(input);
		totalSum += num;
		count++;

	}

	/**
	 * @return
	 */
	private static boolean askUserForMoreInput() {
		while (true) {
			System.out.print("Would you like to continue? (Yes/y or (No/n}");
			String input = scanner.nextLine();
			if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y"))
				return true;
			else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
				return false;
			} else {
				// Let them know they entered an invalid entry
				System.out.println("Invalid entry:" + input);
			}
		}
	}

	/**
	 *
	 */
	private static void displayGrade() {
		System.out.println("Your average grade is: " + avgGrade);

	}

	/**
	 *
	 */
	private static void evaluateGrade() {
		avgGrade = totalSum / count;

	}
}