/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package githublab;
import java.util.Scanner;
public class program3c2 {
	


	    // User-defined function to truncate a string and add ellipsis
	    public static String truncate(String str, int maxLength) {
	        if (str == null) {
	            return null;
	        }

	        if (maxLength < 3) {
	            return "..."; // Minimum 3 characters needed for ellipsis
	        }

	        if (str.length() <= maxLength) {
	            return str; // No need to truncate
	        }

	        return str.substring(0, maxLength - 3) + "..."; // Truncate and add "..."
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        System.out.print("Enter maximum length: ");
	        int maxLength = sc.nextInt();

	        // Truncate and display result
	        String result = truncate(input, maxLength);
	        System.out.println("Truncated string: " + result);

	        sc.close();
	    }
	}


