package first_project;

public class LoopWithEvenNumbers {

	public static void main(String[] args) {
		// Print a message to the user about the loop
		System.out.println("We are going to count from 1 to 100 By 2\'s.");
		for (int i = 0; i <= 100; i = i + 2) {
			if (i % 2 == 0) {
				System.out.println("The number is even " + i);
			}
		}
	}
}