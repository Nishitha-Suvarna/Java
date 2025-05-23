/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
package githublab;
import java.util.*;
public class DeleteNthColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		// Add colors to the list
		ls.add("Orange");
		ls.add("green");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		int n=1;
		System.out.println(ls);
		System.out.println("Removing the nth Element:"+ls.remove(n));
		System.out.println(ls);
	}

}
