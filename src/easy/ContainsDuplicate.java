package easy;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		int res = nums[0];
		boolean repeated = false;
		for (int i = 1; i < nums.length; i++) {
			if ((nums[i] & res) == res) {
				repeated = true;
				break;
			}
		}
		return repeated;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(containsDuplicate(nums));

	}

}
