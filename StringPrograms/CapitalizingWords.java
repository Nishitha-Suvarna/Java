/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
package githublab;
import java.util.Scanner;
public class CapitalizingWords {
	

	

	    // User-defined function to capitalize each word
	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        String[] words = str.trim().split("\\s+"); // split on one or more spaces
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                // Capitalize first letter and append the rest
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1).toLowerCase())
	                           .append(" ");
	            }
	        }

	        return capitalized.toString().trim(); // remove trailing space
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter a sentence: ");
	        String input = sc.nextLine();

	        // Capitalize and display result
	        String result = capitalizeWords(input);
	        System.out.println("Capitalized Sentence: " + result);

	        sc.close();
	    }
	}


