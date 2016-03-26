package first_project;

import java.util.*;

@SuppressWarnings("javadoc")
public class NumToMonth {
	// Create the scanner object
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Define the variable for default month
		int user_mon = 1;

		System.out.println("Enter the number for a month: ");
		// Ask the user for a number of month
		String input = scanner.nextLine();
		user_mon = Integer.parseInt(input);

		// Using switch for the multiple conditions
		switch (user_mon) {

		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid month number");
			break;
		}
	}

}
