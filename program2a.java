/*2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/
package githublab;
import java.util.*;
import java.util.Scanner;
public class program2a {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // String Creation and Basic Operations
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        System.out.println("\n--- Basic Operations ---");
	        System.out.println("Original String: " + input);
	        System.out.println("Length: " + input.length());
	        System.out.println("First Character: " + input.charAt(0));
	        System.out.println("Last Character: " + input.charAt(input.length() - 1));

	        // String Comparison
	        System.out.print("\nEnter another string to compare: ");
	        String compareStr = sc.nextLine();

	        System.out.println("\n--- String Comparison ---");
	        System.out.println("Equals: " + input.equals(compareStr));
	        System.out.println("EqualsIgnoreCase: " + input.equalsIgnoreCase(compareStr));
	        System.out.println("CompareTo: " + input.compareTo(compareStr));

	        // String Searching
	        System.out.print("\nEnter a substring to search: ");
	        String search = sc.nextLine();

	        System.out.println("\n--- String Searching ---");
	        System.out.println("Contains: " + input.contains(search));
	        System.out.println("Index of substring: " + input.indexOf(search));

	        // Substring Operations
	        System.out.println("\n--- Substring Operations ---");
	        if (input.length() >= 5) {
	            System.out.println("Substring(0, 5): " + input.substring(0, 5));
	        } else {
	            System.out.println("String is too short for substring(0, 5).");
	        }

	        // String Modification
	        System.out.println("\n--- String Modification ---");
	        System.out.println("To Uppercase: " + input.toUpperCase());
	        System.out.println("To Lowercase: " + input.toLowerCase());
	        System.out.println("Replace 'a' with '@': " + input.replace('a', '@'));

	        // Whitespace Handling
	        String spaced = "   Hello World!   ";
	        System.out.println("\n--- Whitespace Handling ---");
	        System.out.println("Original: \"" + spaced + "\"");
	        System.out.println("Trimmed: \"" + spaced.trim() + "\"");

	        // String Concatenation
	        System.out.println("\n--- String Concatenation ---");
	        String concatResult = input.concat(" - Java Demo");
	        System.out.println("Concatenated String: " + concatResult);

	        // String Splitting
	        System.out.println("\n--- String Splitting ---");
	        String csv = "apple,banana,grape,orange";
	        String[] fruits = csv.split(",");
	        System.out.println("Splitting \"apple,banana,grape,orange\":");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }

	        // StringBuilder Demo
	        System.out.println("\n--- StringBuilder Demo ---");
	        StringBuilder sb = new StringBuilder("Welcome");
	        sb.append(" to Java");
	        sb.insert(7, " User");
	        sb.replace(0, 7, "Hello");
	        System.out.println("Modified StringBuilder: " + sb.toString());

	        // String Formatting
	        System.out.println("\n--- String Formatting ---");
	        String name = "Alice";
	        int age = 25;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println(formatted);

	        // Email Validation
	        System.out.print("\nEnter email to validate: ");
	        String email = sc.nextLine();

	        System.out.println("\n--- Email Validation ---");
	        boolean isValid = email.contains("@") && email.endsWith(".com") && email.startsWith("user");
	        System.out.println("Is email valid (starts with 'user', contains '@', ends with '.com')? " + isValid);

	        sc.close();
	    }
	}


