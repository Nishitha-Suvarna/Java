/*Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
package githublab;
import java.util.*;
public class LinkedListDisplay {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		// Display elements with their positions using l_listobj.get(p)
		for(int i=0;i<ls.size();i++) {
			System.out.println("index: "+i+" value:"+ls.get(i));
		}
	}
}
