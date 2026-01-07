package Assignment01;

import java.util.Arrays;

public class StringOperations {
	public static void main(String[] args) {
		String str = "  Hello World  ";
		String str2 = "Hello World";

		// length()
		System.out.println("Length: " + str.length());

		// isEmpty()
		System.out.println("Is Empty: " + str.isEmpty());

		// charAt()
		System.out.println("Character at index 1: " + str.charAt(1));

		// toString()
		System.out.println("ToString: " + str.toString());

		// equals()
		System.out.println("Equals str2: " + str.equals(str2));

		// compareTo()
		System.out.println("CompareTo str2: " + str.compareTo(str2));

		// contains()
		System.out.println("Contains 'World': " + str.contains("World"));

		// indexOf()
		System.out.println("IndexOf 'o': " + str.indexOf('o'));

		// lastIndexOf()
		System.out.println("LastIndexOf 'o': " + str.lastIndexOf('o'));

		// startsWith()
		System.out.println("StartsWith 'He': " + str.trim().startsWith("He"));

		// endsWith()
		System.out.println("EndsWith 'ld': " + str.trim().endsWith("ld"));

		// matches() (regex)
		System.out.println("Matches regex '.*World.*': " + str.matches(".*World.*"));

		// substring()
		System.out.println("Substring(2,7): " + str.substring(2, 7));

		// toLowerCase()
		System.out.println("LowerCase: " + str.toLowerCase());

		// trim()
		System.out.println("Trim: '" + str.trim() + "'");

		// replace()
		System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

		// split()
		String[] parts = str.trim().split(" ");
		System.out.println("Split: " + Arrays.toString(parts));

		// join()
		String joined = String.join("-", parts);
		System.out.println("Join: " + joined);

		// valueOf()
		int num = 123;
		String numStr = String.valueOf(num);
		System.out.println("ValueOf int: " + numStr);

		// Demonstrating StringBuffer
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Buffer");
		System.out.println("StringBuffer: " + sb);

		// Demonstrating StringBuilder
		StringBuilder sbuilder = new StringBuilder("Hello");
		sbuilder.append(" Builder");
		System.out.println("StringBuilder: " + sbuilder);
	}
}