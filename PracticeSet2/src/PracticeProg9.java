
//Construct a List containing a pear, a banana, a tangerine, a strawberry and a blackberry inserted consecutively. Then extend your program to do the following:
//display the contents of the List in order of insertion using an Iterator;
//display the contents of the List in reverse order using a ListIterator;
//insert a second banana into the List in-between the tangerine and the strawberry; display contents again to confirm success.

import java.util.ArrayList;
import java.util.Collections;

public class PracticeProg9 {
	public static void main(String[] args) {
		ArrayList<String> newList = new ArrayList<String>();
		newList.add("Pear");
		newList.add("Banana");
		newList.add("Tangerine");
		newList.add("Strawberry");
		newList.add("Blackberry");
		System.out.println("Displaying List Elements:");
		System.out.println(newList);
		Collections.reverse(newList);
		System.out.println("After reversing:");
		System.out.println(newList);
		Collections.reverse(newList);
		System.out.println("After inserting another Banana:");
		newList.add(3, "Banana");
		System.out.println(newList);
	}
}
