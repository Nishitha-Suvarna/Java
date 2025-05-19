/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
package githublab;
import java.util.*;
public class InsertAtEnd {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ls = new LinkedList<>();
		// Add some initial colors
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println(ls);
		// Insert "Pink" at the end using offerLast()
		ls.addLast("pink");
		System.out.println(ls);
	
	}
}
