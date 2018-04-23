package easy;


/*
 * 485. Max Consecutive Ones
 * 
 * Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
 *0,1,0,1,0,1,1,0,1
 * */
public class MaxConsecutiveOnes {

	class Solution {
		public int findMaxConsecutiveOnes(int[] nums) {
			int count = 0;
			int step = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 1) {
					step++;
				} else {
					step = 0;
				}
				count = Math.max(count, step);
			}
			return count==1?0:count;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 0};
		Solution s = new MaxConsecutiveOnes().new Solution();
		System.out.println(s.findMaxConsecutiveOnes(nums));

	}

}
