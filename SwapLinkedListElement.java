/*Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
Collections.swap(l_list, 0, 2))*/
package githublab;
import java.util.*;
public class program1c5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println("Before swapping");
		System.out.println(ls);
		 // Swap the first (index 0) and third (index 2) elements
		Collections.swap(ls, 0,2);
		System.out.println("After swapping");
		System.out.println(ls);
	}
}
