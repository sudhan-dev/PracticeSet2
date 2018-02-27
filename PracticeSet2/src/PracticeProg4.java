// Use the override equals method of Integer with two different object wrapping same primitive int value ( like - 10).
// demonstrate the difference in the output from Previous program

public class PracticeProg4 {

	public static void EqualCal(int a, int b) {
		if (a == b)
			System.out.println("The values are equal");
		else
			System.out.println("The values are unequal");
	}

	public static void main(String[] args) {
		int x = 10;
		Integer X = new Integer(x);
		int y = 10;
		Integer Y = new Integer(y);
		// AssignNew a = new AssignNew();
		EqualCal(x, X);
		EqualCal(y, Y);
		EqualCal(x, y);
		EqualCal(X, Y);
	}
}
