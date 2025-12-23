package Assignment1;

import java.util.Scanner;

public class MatrixOperations {

	// Addition of two matrices
	public static int[][] add(int[][] A, int[][] B) {
		int rows = A.length;
		int cols = A[0].length;
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = A[i][j] + B[i][j];
			}
		}
		return result;
	}

	// Subtraction of two matrices
	public static int[][] subtract(int[][] A, int[][] B) {
		int rows = A.length;
		int cols = A[0].length;
		int[][] result = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = A[i][j] - B[i][j];
			}
		}
		return result;
	}

	// Multiplication of two matrices
	public static int[][] multiply(int[][] A, int[][] B) {
		int rowsA = A.length;
		int colsA = A[0].length;
		int colsB = B[0].length;
		int[][] result = new int[rowsA][colsB];
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				for (int k = 0; k < colsA; k++) {
					result[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return result;
	}

	// Transpose of a matrix
	public static int[][] transpose(int[][] A) {
		int rows = A.length;
		int cols = A[0].length;
		int[][] result = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[j][i] = A[i][j];
			}
		}
		return result;
	}

	// Check if matrix is square
	public static boolean isSquare(int[][] A) {
		return A.length == A[0].length;
	}

	// Check if matrix is diagonal
	public static boolean isDiagonal(int[][] A) {
		if (!isSquare(A))
			return false;
		int n = A.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && A[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	// Check if matrix is identity
	public static boolean isIdentity(int[][] A) {
		if (!isSquare(A))
			return false;
		int n = A.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j && A[i][j] != 1)
					return false;
				if (i != j && A[i][j] != 0)
					return false;
			}
		}
		return true;
	}

	// Display matrix
	public static void display(int[][] A) {
		for (int[] row : A) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	// Main method with menu
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows and columns of matrix A: ");
		int rowsA = sc.nextInt();
		int colsA = sc.nextInt();
		int[][] A = new int[rowsA][colsA];

		System.out.println("Enter elements of matrix A:");
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsA; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter rows and columns of matrix B: ");
		int rowsB = sc.nextInt();
		int colsB = sc.nextInt();
		int[][] B = new int[rowsB][colsB];

		System.out.println("Enter elements of matrix B:");
		for (int i = 0; i < rowsB; i++) {
			for (int j = 0; j < colsB; j++) {
				B[i][j] = sc.nextInt();
			}
		}

		int choice;
		do {
			System.out.println("\n--- Matrix Operations Menu ---");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Transpose of Matrix A");
			System.out.println("5. Check if Matrix A is Square");
			System.out.println("6. Check if Matrix A is Diagonal");
			System.out.println("7. Check if Matrix A is Identity");
			System.out.println("8. Transpose of Matrix B");
			System.out.println("9. Check if Matrix B is Square");
			System.out.println("10. Check if Matrix B is Diagonal");
			System.out.println("11. Check if Matrix B is Identity");
			System.out.println("12. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (rowsA == rowsB && colsA == colsB) {
					System.out.println("Addition of A and B:");
					display(add(A, B));
				} else {
					System.out.println("Addition not possible (dimension mismatch).");
				}
				break;

			case 2:
				if (rowsA == rowsB && colsA == colsB) {
					System.out.println("Subtraction of A and B:");
					display(subtract(A, B));
				} else {
					System.out.println("Subtraction not possible (dimension mismatch).");
				}
				break;

			case 3:
				if (colsA == rowsB) {
					System.out.println("Multiplication of A and B:");
					display(multiply(A, B));
				} else {
					System.out.println("Multiplication not possible (dimension mismatch).");
				}
				break;

			case 4:
				System.out.println("Transpose of Matrix A:");
				display(transpose(A));
				break;

			case 5:
				System.out.println("Is Matrix A Square? " + isSquare(A));
				break;

			case 6:
				System.out.println("Is Matrix A Diagonal? " + isDiagonal(A));
				break;

			case 7:
				System.out.println("Is Matrix A Identity? " + isIdentity(A));
				break;

			case 8:
				System.out.println("Transpose of Matrix B:");
				display(transpose(B));
				break;

			case 9:
				System.out.println("Is Matrix B Square? " + isSquare(B));
				break;

			case 10:
				System.out.println("Is Matrix B Diagonal? " + isDiagonal(B));
				break;

			case 11:
				System.out.println("Is Matrix B Identity? " + isIdentity(B));
				break;

			case 12:
				System.out.println("Thanks for using the app...");
				break;

			default:
				System.out.println("Invalid choice! Try again.");
			}
		} while (choice != 12);

		sc.close();
	}
}