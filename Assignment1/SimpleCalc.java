package Assignment1;

import java.util.Scanner;

public class SimpleCalc {

	// Method for Addition
	public static int add(int a, int b) {
		return a + b;
	}

	// Method for Subtraction
	public static int subtract(int a, int b) {
		return a - b;
	}

	// Method for Multiplication
	public static int multiply(int a, int b) {
		return a * b;
	}

	// Method for Division
	public static double divide(int a, int b) {
		if (b == 0) {
			System.out.println("Division by zero is not allowed!");
			return 0;
		}
		return (double) a / b;
	}

	// Method for Remainder
	public static int remainder(int a, int b) {
		if (b == 0) {
			System.out.println("Division by zero is not allowed!");
			return 0;
		}
		return a % b;
	}

	// Method for Square
	public static int square(int a) {
		return a * a;
	}

	// Method for Cube
	public static int cube(int a) {
		return a * a * a;
	}

	// Method for Absolute Value
	public static int absolute(int a) {
		return (a < 0) ? -a : a;
	}

	// Main method with menu-driven program
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Simple Calculator Menu ---");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Remainder");
			System.out.println("6. Square");
			System.out.println("7. Cube");
			System.out.println("8. Absolute Value");
			System.out.println("9. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter two numbers: ");
				int a1 = sc.nextInt();
				int b1 = sc.nextInt();
				System.out.println("Result: " + add(a1, b1));
				break;

			case 2:
				System.out.print("Enter two numbers: ");
				int a2 = sc.nextInt();
				int b2 = sc.nextInt();
				System.out.println("Result: " + subtract(a2, b2));
				break;

			case 3:
				System.out.print("Enter two numbers: ");
				int a3 = sc.nextInt();
				int b3 = sc.nextInt();
				System.out.println("Result: " + multiply(a3, b3));
				break;

			case 4:
				System.out.print("Enter two numbers: ");
				int a4 = sc.nextInt();
				int b4 = sc.nextInt();
				System.out.println("Result: " + divide(a4, b4));
				break;

			case 5:
				System.out.print("Enter two numbers: ");
				int a5 = sc.nextInt();
				int b5 = sc.nextInt();
				System.out.println("Result: " + remainder(a5, b5));
				break;

			case 6:
				System.out.print("Enter a number: ");
				int a6 = sc.nextInt();
				System.out.println("Square: " + square(a6));
				break;

			case 7:
				System.out.print("Enter a number: ");
				int a7 = sc.nextInt();
				System.out.println("Cube: " + cube(a7));
				break;

			case 8:
				System.out.print("Enter a number: ");
				int a8 = sc.nextInt();
				System.out.println("Absolute Value: " + absolute(a8));
				break;

			case 9:
				System.out.println("Thank you for using the app...");
				break;

			default:
				System.out.println("Invalid choice! Try again.");
			}
		} while (choice != 9);

		sc.close();
	}
}