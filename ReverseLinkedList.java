/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package githublab;
import java.util.*;
public class program1c2 {
	public static void main(String[] args) {
	LinkedList<String>	ls = new LinkedList<>();
	// Add colors to the list
	ls.add("Orange");
	ls.add("geen");
	ls.add("pink");
	ls.add("red");
	ls.add("Blue");
//	ListIterator<String> listIterator = ls.listIterator(ls.size());
//    while (listIterator.hasPrevious()) {
//        System.out.println(listIterator.previous());
//    }
	// Use descendingIterator to iterate in reverse order
	Iterator iterator =  ls.descendingIterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}
}
}
