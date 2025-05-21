/*Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
package githublab;
import java.util.Scanner;
public class reverseString {
	

	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        if (str == null) {
	            return null;
	        }

	        String reversed = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed += str.charAt(i); // Concatenate characters in reverse order
	        }

	        return reversed;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter a string to reverse: ");
	        String input = sc.nextLine();

	        // Call the reverse function and print result
	        String result = reverseString(input);
	        System.out.println("Reversed string: " + result);

	        sc.close();
	    }
	}


