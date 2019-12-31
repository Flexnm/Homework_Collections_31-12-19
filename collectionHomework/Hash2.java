package collectionHomework;

import java.util.HashSet;

public class Hash2 {
	public static void main(String[] args) {

		HashSet<Integer> nums = new HashSet<Integer>();

		while (nums.size() < 10) {
			nums.add((int) (Math.random() * 21));
		}
		System.out.println(nums);

		int counter = 0;
		for (Integer num : nums) {
			if (num < 10) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}