package Assignment1;

import java.util.Scanner;

public class ArrayOperations {
	private static int[] arr = new int[100]; // fixed size array
	private static int size = 0; // current number of elements

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n--- Array Operations Menu ---");
			System.out.println("1. Insert Single Element");
			System.out.println("2. Insert Multiple Elements");
			System.out.println("3. Delete Element");
			System.out.println("4. Linear Search");
			System.out.println("5. Binary Search (Array must be sorted)");
			System.out.println("6. Find Maximum Value");
			System.out.println("7. Count Even and Odd Numbers");
			System.out.println("8. Perform Insertion Sort");
			System.out.println("9. Display Array");
			System.out.println("10. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter element to insert: ");
				int element = sc.nextInt();
				insert(element);
				break;

			case 2:
				insertMultiple(sc);
				break;

			case 3:
				System.out.print("Enter element to delete: ");
				int delElement = sc.nextInt();
				delete(delElement);
				break;

			case 4:
				System.out.print("Enter element to search (Linear): ");
				int searchElement = sc.nextInt();
				linearSearch(searchElement);
				break;

			case 5:
				System.out.print("Enter element to search (Binary): ");
				int binElement = sc.nextInt();
				binarySearch(binElement);
				break;

			case 6:
				findMax();
				break;

			case 7:
				countEvenOdd();
				break;

			case 8:
				insertionSort();
				System.out.println("Array sorted using Insertion Sort.");
				break;

			case 9:
				display();
				break;

			case 10:
				System.out.println("Thank you for using the app...");
				break;

			default:
				System.out.println("Invalid choice! Try again.");
			}
		} while (choice != 10);

		sc.close();
	}

	// Insert single element safely
	public static void insert(int element) {
		if (size >= arr.length) {
			System.out.println("Array is full. Cannot insert more elements.");
			return;
		}
		arr[size++] = element;
		System.out.println("Element inserted successfully.");
	}

	// Insert multiple elements safely
	public static void insertMultiple(Scanner sc) {
		System.out.print("How many elements do you want to insert? ");
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println("Please enter a positive count.");
			return;
		}
		if (size + n > arr.length) {
			System.out.println("Not enough space. You can insert up to " + (arr.length - size) + " more elements.");
			return;
		}

		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			int element = sc.nextInt();
			arr[size++] = element;
		}
		System.out.println(n + " elements inserted successfully.");
	}

	// Delete element
	public static void delete(int element) {
		int pos = -1;
		for (int i = 0; i < size; i++) {
			if (arr[i] == element) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			System.out.println("Element not found.");
			return;
		}
		for (int i = pos; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;
		System.out.println("Element deleted successfully.");
	}

	// Linear Search
	public static void linearSearch(int element) {
		for (int i = 0; i < size; i++) {
			if (arr[i] == element) {
				System.out.println("Element found at position: " + (i + 1));
				return;
			}
		}
		System.out.println("Element not found.");
	}

	// Binary Search (requires sorted array)
	public static void binarySearch(int element) {
		int left = 0, right = size - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == element) {
				System.out.println("Element found at position: " + (mid + 1));
				return;
			} else if (arr[mid] < element) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		System.out.println("Element not found.");
	}

	// Find Maximum Value
	public static void findMax() {
		if (size == 0) {
			System.out.println("Array is empty.");
			return;
		}
		int max = arr[0];
		for (int i = 1; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum value in array: " + max);
	}

	// Count Even and Odd Numbers (fixed)
	public static void countEvenOdd() {
		if (size == 0) {
			System.out.println("Array is empty.");
			System.out.println("Even count: 0");
			System.out.println("Odd count: 0");
			return;
		}
		int even = 0, odd = 0;
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even count: " + even);
		System.out.println("Odd count: " + odd);
	}

	// Insertion Sort
	public static void insertionSort() {
		for (int i = 1; i < size; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	// Display Array
	public static void display() {
		if (size == 0) {
			System.out.println("Array is empty.");
			return;
		}
		System.out.print("Array elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}