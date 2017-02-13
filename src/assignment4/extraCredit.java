package assignment4;

import java.util.*;

public class extraCredit {
	public static ArrayList<Integer> missingNumber(int[] nums) {
		int i, j;
		for (i = 0; i < nums.length; i++) {
			for (j = nums.length - 1; j > i; j--) {
				if (nums[i] >= nums[j])
					return null;
			}
		}
		ArrayList<Integer> originalList = new ArrayList<Integer>();
		ArrayList<Integer> missingList = new ArrayList<Integer>();
		for (i = 0; i < nums.length; i++) {
			originalList.add(nums[i]);
		}

		for (i = 0; i < originalList.size(); i++) {
			if (originalList.get(i) != i) {
				missingList.add(i);
				originalList.add(i, i);
			}
		}
		return missingList;
	}

	public static void moveZeroes(int[] nums) {
		// below is an ArrayList method. If this is assumed to be the "copy
		// array" method, you can move to next method of this function
		int i;
		int counter = 0;
		ArrayList<Integer> originalList = new ArrayList<Integer>();
		for (i = 0; i < nums.length; i++) {
			originalList.add(nums[i]);
			if (nums[i] != 0)
				counter++;
		}
		i = 0;
		while (i < counter) {
			if (originalList.get(i) != 0)
				i++;
			else {
				originalList.add(originalList.get(i));
				originalList.remove(i);
			}
		}
		System.out.println("remove 0 list:" + originalList);
	}

	// below is method 2:
	public static void moveZeroes2(int[] nums) {
		int i, j, k, counterZeroes = 0;
		for (i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 0)
				counterZeroes++;
		}
		for (j = 0; j < counterZeroes; j++) {
			for (i = 0; i < nums.length - 1; i++) {
				if (nums[i] == 0) {
					k = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = k;
				}
			}
		}
		System.out.print("(in method 2) remove 0 list:");
		for (i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println(" ");
	}

	public static int thirdMax(int[] nums) {
		int i, j, k, key;
		int sameNumberCounter = 0;
		int n = nums.length;
		for (i = 0; i < n - 1; i++) { // generate a descend ordered array
			for (j = i + 1; j < n; j++) {
				if (nums[i] < nums[j]) {
					k = nums[i];
					nums[i] = nums[j];
					nums[j] = k;
				}
			}
		}
		for (i = 0, key = 0; i < n - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				sameNumberCounter++; // count the same number in an ordered array
				key = i;// key is used to memorize the same number's index
			} 
		}
		if (n < 3 + sameNumberCounter)
			return nums[0];// no third max number, return the max number
		else {
			if (key >= 2)
				return nums[2]; // if the same number is after nums[2], it does
								// no impact to the result, just input
								// nums[2],which is the third one in this decend
								// array
			else
				return nums[2 + sameNumberCounter];// if the same number is
													// before nums[2], we have
													// to consider about the
													// same-number-counter
		}
	}

	public static void main(String[] args) {
		int[] ls1 = { 1, 2, 4, 8 };
		System.out.println(missingNumber(ls1));
		int[] ls2 = { 1, 3, 9 };
		System.out.println(missingNumber(ls2));
		int[] ls3 = { 0, 2, 7, 4 };// wrong condition test: input not in an
									// ascend order
		System.out.println(missingNumber(ls3));
		int[] ls4 = { 0, 2, 2, 4 };// wrong condition test: input not identical
		System.out.println(missingNumber(ls4));

		int[] mz1 = { 2, 4, 0, 8, 9, 0, 0, 2, 5 };// test the condition:multiple
													// zeroes in the list
		moveZeroes(mz1);
		moveZeroes2(mz1);
		int[] mz2 = { 0, 3, 4, 0, 2, 0, 0, 0, 4 };
		moveZeroes(mz2);
		moveZeroes2(mz2);
		int[] tm1 = { 3, 2, 4, 2, 5, 6 };
		int[] tm2 = { 3, 2, 1 };
		int[] tm3 = { 1, 2 };
		int[] tm4 = { 2, 2, 3, 1 };
		System.out.println("The third max or max number is: " + thirdMax(tm1));
		System.out.println("The third max or max number is: " + thirdMax(tm2));
		System.out.println("The third max or max number is: " + thirdMax(tm3));
		System.out.println("The third max or max number is: " + thirdMax(tm4));

	}

}
