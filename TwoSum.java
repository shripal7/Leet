package aleeta;

/* Given an array of integers, return indices of the two numbers such that they add up to a 
 * specific target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.*/

import java.util.*;

class TwoSum {
	private static Scanner n;

	public int[] twoSum(int[] nums, int target) {

		int[] k = new int[2];
		int count = 0;
		for (int i = 0; (i < (nums.length-1)); i++) {
			k[0] = i;
			count = nums[i];

			for (int j = i + 1; j < nums.length; j++) {
				if (target == (nums[j] + count)) {
					k[1] = j;
					return (k);
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {

		int[] k = new int[2];
		n = new Scanner(System.in);
		int array_size = n.nextInt();
		int[] num = new int[array_size];
		for (int i = 0; i < array_size; i++) {
			num[i] = n.nextInt();
		}
		int target = n.nextInt();
		k = (new TwoSum().twoSum(num, target));
		System.out.println(k[0]);
		System.out.println(k[1]);

	}
}
