
//program to Iterate through all elements of collection using Enumeration and Iterator Interface and remove an element of each collection using these Interface.
//a. ArrayList
//b. HashSet
//c. HashMap
//d. Hashtable

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class PracticeProg6 {
	public static void main(String[] args) {
		Iterator<String> iterator;
		ArrayList<String> al = new ArrayList<String>();
		al.add(0, "0");
		al.add(1, "1");
		al.add(2, "2");
		System.out.print("Collection data (Array List): ");
		iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		al.remove(1);
		System.out.print("After removing: ");
		iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		HashSet<String> hs = new HashSet<String>();
		hs.add("K");
		hs.add("E");
		hs.add("E");
		hs.add("R");
		System.out.print("Collection data(Has Set): ");
		iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		hs.remove("E");
		System.out.print("After removing: ");
		iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Hi");
		hm.put(2, "Hello");
		System.out.println(" Map Elements");
		System.out.print("\t" + hm);
		System.out.println();
		hm.remove(2);
		System.out.print("After removing: ");
		System.out.println(" Map Elements");
		System.out.print("\t" + hm);

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "One");
		ht.put(2, "Two");
		ht.put(3, "Three");
		System.out.println();
		System.out.println("From Hashtable:");
		Enumeration<String> e = ht.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		ht.remove(3);
		System.out.println("After removing: ");
		Enumeration<String> e1 = ht.elements();
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}

}
