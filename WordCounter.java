package githublab;
import java.util.Scanner;
public class WordCounter {
	

	

	    // User-defined function to count words
	    public static int countWords(String input) {
	        // Trim leading/trailing whitespace and check for empty string
	        if (input == null || input.trim().isEmpty()) {
	            return 0;
	        }

	        // Split the string using one or more spaces as delimiter
	        String[] words = input.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input string from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Count and display the number of words
	        int wordCount = countWords(input);
	        System.out.println("Number of words in the string: " + wordCount);

	        scanner.close();
	    }
	}


