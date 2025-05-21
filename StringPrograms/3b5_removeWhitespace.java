/*Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
package githublab;
import java.util.Scanner;
public class removeWhitespace {
	


	    // User-defined function to remove all whitespace characters
	    public static String removeWhitespace(String str) {
	        if (str == null) {
	            return null;
	        }
	        // Use regular expression to replace all whitespace characters
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string with whitespace: ");
	        String input = sc.nextLine();

	        // Remove whitespace and display result
	        String result = removeWhitespace(input);
	        System.out.println("String without whitespace: " + result);

	        sc.close();
	    }
	}


