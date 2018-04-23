package easy;

public class MaxSubSequenceSum {
	public static int maxSubArray(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int sum = nums[0], temp = 0;
		for (int i = 0; i < nums.length; i++) {
			temp += nums[i];
			if (temp > sum) {
				sum = temp;
			}
			if (temp < 0) {
				temp = 0;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] nums= {-3,-2,0,-1};
		int max = maxSubArray(nums);
		System.out.println(max);
	}
}
