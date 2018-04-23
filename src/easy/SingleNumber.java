package easy;

/*
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * 
 * */
public class SingleNumber {
	class Solution {
		public int singleNumber(int[] nums) {
			int ans=nums[0];
			for (int i = 1; i < nums.length; i++) {
				ans^=nums[i];
			}
			return ans;
		}
	}

	public static void main(String[] args) {
		int[] a = {1,2,2,3,1,5,5,3,6};
		Solution s = new SingleNumber().new Solution();
		System.out.println(s.singleNumber(a));
	}
}
