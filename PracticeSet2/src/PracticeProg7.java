
//program to take the content from user through keyboard and save that content to a file using Buffered Streams.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PracticeProg7 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			System.out.println("Enter text to write in file");
			String s = sc.nextLine();
			BufferedWriter bw = new BufferedWriter(new FileWriter("D://NewFile.txt"));
			bw.write(s);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
