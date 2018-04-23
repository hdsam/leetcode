package easy;

import java.util.Arrays;

public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
		int i = 0, j = 0;
		while (j < nums.length) {
			if (nums[i] < nums[j]) {
				nums[i+1]=nums[j];
				i++;
			}else {
				j++;
			}
			
		}
		return i+1;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1 };
		System.out.println(Arrays.toString(nums));
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
}
