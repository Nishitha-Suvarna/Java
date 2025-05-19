/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package githublab;
import java.util.*;
import java.util.Scanner;
public class CountSubstring {
	    // User-defined function to count occurrences of a substring
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        // Loop through the main string
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // Move past the last found occurrence
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter the main string: ");
	        String mainString = sc.nextLine();

	        System.out.print("Enter the substring to search: ");
	        String subString = sc.nextLine();

	        // Call the function and display result
	        int occurrences = countOccurrences(mainString, subString);
	        System.out.println("The substring \"" + subString + "\" appears " + occurrences + " time(s) in the main string.");

	        sc.close();
	    }
	}

