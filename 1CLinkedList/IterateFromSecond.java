/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package githublab;
import java.util.*;
public class IterateFromSecond {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>	ls = new LinkedList<>();
		// Create a LinkedList of colors
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		// Create a ListIterator starting from index 2
		Iterator iterator = ls.listIterator(2);
		while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}

}
}
