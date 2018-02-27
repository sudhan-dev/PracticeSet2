//to demonstrate the use of equals method of Object class and compare its functionality with ( = = ) operator.

public class PracticeProg3 {

	public static void main(String[] args) {

		String str = new String("Hello");
		String strn = new String("Hello");
		String s1 = "Hi";
		String s2 = "Hi";
		if (str.equals(strn))
			System.out.println("Using str .equals strn.Both the strings are equal");
		else
			System.out.println("Using str .equals strn.Both strings are unequal");
		if (str == strn)
			System.out.println("Using str == strn.Both the strings are equal");
		else
			System.out.println("Using str == strn.Both strings are unequal");
		if (s1.equals(s2))
			System.out.println("Using s1 .equals s2.Both the strings are equal");
		else
			System.out.println("Using s1 .equals s2.Both strings are unequal");
		if (s1 == s2)
			System.out.println("Using s1 == s2.Both the strings are equal");
		else
			System.out.println("Using s1 == s2.Both strings are unequal");
	}
}
