package collectionHomework;

import java.util.HashSet;

public class Hash1 {
	public static void main(String[] args) {

		HashSet<String> strings1 = new HashSet<String>();
		HashSet<String> strings2 = new HashSet<String>();

		String[] list = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve" };

		while (strings1.size() < 7) {
			strings1.add(list[(int) (Math.random() * 12)]);
		}

		while (strings2.size() < 7) {
			strings2.add(list[(int) (Math.random() * 12)]);
		}

		System.out.println(strings1);
		System.out.println(strings2);

		for (String string : strings1) {
			if (strings2.contains(string)) {
				System.out.println(string);
			}
		}
	}
}