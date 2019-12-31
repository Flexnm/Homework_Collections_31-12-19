package collectionHomework;

import java.util.HashMap;
import java.util.Scanner;

public class HashM1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String text = scan.next();

		HashMap<Character, Integer> letters = new HashMap<Character, Integer>();

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (letters.containsKey(c)) {
				letters.put(c, letters.get(c) + 1);
			} else {
				letters.put(c, 1);
			}
		}
		System.out.println(letters);
		scan.close();
	}
}