/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package githublab;
import java.util.*;
public class ExtractColors {
	public static void main(String[] args) {
	List<String> ls = new ArrayList<>();
		
        // Add colors to the list
	ls.add("Orange");
	ls.add("geen");
	ls.add("pink");
	ls.add("red");
	ls.add("Blue");
	System.out.println(ls);
	// Extract 1st and 2nd elements (index 0 and 1)
	System.out.println("using sublist:");
	System.out.println(ls.subList(0,2));
}
}
