/*Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
package githublab;
import java.util.Scanner;
public class program3c3 {
	


	    // User-defined function to check if the string is numeric
	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) {
	            return false;
	        }

	        for (int i = 0; i < str.length(); i++) {
	            if (!Character.isDigit(str.charAt(i))) {
	                return false; // Found a non-digit character
	            }
	        }

	        return true; // All characters are digits
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Check and display result
	        if (isNumeric(input)) {
	            System.out.println("The string contains only numeric characters.");
	        } else {
	            System.out.println("The string does NOT contain only numeric characters.");
	        }

	        sc.close();
	    }
	}

