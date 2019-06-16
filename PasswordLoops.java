package hackerrank;

import java.util.Scanner;

public class PasswordLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String username = "Yboz";

		String password = "Math12345";

		System.out.println("Enter your username");

		String username1 = input.nextLine().trim();

		System.out.println("Enter your password");
		String password1 = input.nextLine();

		int count = 0;

		while (count < 2 && ((!username1.equalsIgnoreCase(username)) || (!password1.equals(password)))) {

			System.out.println("Invalid username or password. Try again");
			System.out.println("Enter your username ");

			username1 = input.nextLine().trim();

			System.out.println("Enter your password");
			password1 = input.nextLine();
			count++;

		}
		if (username1.equalsIgnoreCase(username) && password1.equals(password)) {
			System.out.println("Successfully logged in");
		}

		else {
			System.err.println("You account has been locked after " + (count + 1)
					+ " failed attemps. Contact the system administration.");
		}
		input.close();
	}
}
