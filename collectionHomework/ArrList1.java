package collectionHomework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList1 {
	public static void main(String[] args) {

		int max = 0;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> strings = new ArrayList<String>();
		System.out.println("Input 5 strings: ");
		while (strings.size() < 5) {
			String text = scan.next();
			strings.add(text);
			if (text.length() > max) {
				max = text.length();
			}
		}
		System.out.println("Longest Strings are of length " + max + ", and those are:");
		for (int i = 0; i < strings.size(); i++) {
			if (strings.get(i).length() == max) {
				System.out.println(strings.get(i));
			}
		}

		System.out.println(strings);
		scan.close();
	}
}
