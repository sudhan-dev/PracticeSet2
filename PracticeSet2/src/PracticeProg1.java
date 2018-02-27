
//To print leap years between 1990 to 2010

import java.util.Scanner;

public class PracticeProg1 {

	static int year;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Progaram displays leap years between 1990 and 2010");
		for (year = 1990; year <= 2010; year++) {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				System.out.println(year + " " + "is a leap year");
		}
		sc.close();
	}
}
