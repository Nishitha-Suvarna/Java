/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
package githublab;
import java.util.*;
public class program1b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		// Add colors to the list
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println("Before sorting:");
		System.out.println(ls);
		// Sort the list
		Collections.sort(ls);
		System.out.println("After sorting:");
		System.out.println(ls);
	}


}
