/*Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/
package githublab;
import java.util.Scanner;
public class PalindromeCheck {
	    // User-defined function to check if a string is a palindrome
	    public static boolean isPalindrome(String str) {
	        if (str == null) {
	            return false;
	        }

	        // Remove non-alphabetic characters and convert to lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

	        int left = 0;
	        int right = cleaned.length() - 1;

	        // Check characters from both ends
	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter a string to check if it's a palindrome: ");
	        String input = sc.nextLine();

	        // Check and display result
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome (ignoring case and punctuation).");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }
	        sc.close();
	    }
	}


