package githublab;
import java.util.*;
public class program1c2 {
	public static void main(String[] args) {
	LinkedList<String>	ls = new LinkedList<>();
	ls.add("Orange");
	ls.add("geen");
	ls.add("pink");
	ls.add("red");
	ls.add("Blue");
//	ListIterator<String> listIterator = ls.listIterator(ls.size());
//    while (listIterator.hasPrevious()) {
//        System.out.println(listIterator.previous());
//    }
	Iterator iterator =  ls.descendingIterator();
	while (iterator.hasNext()) {
		System.out.println(iterator.next());
		}
}
}
