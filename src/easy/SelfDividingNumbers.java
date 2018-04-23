package easy;

import java.util.ArrayList;
import java.util.List;

/*
 * A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input: 
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:
The boundaries of each input argument are 1 <= left <= right <= 10000.
 * 
 */
public class SelfDividingNumbers {

	class Solution {
		public List<Integer> selfDividingNumbers(int left, int right) {
			List<Integer> resultNumbers = new ArrayList<Integer>();
			for (; left <= right; left++) {
				int temp = left;
				int rem=temp%10;
				while (rem!=0&&left%rem==0) {
					temp = temp / 10;
					rem=temp%10;
				}
				if (temp == 0) {
					resultNumbers.add(left);
				}
			}
			return resultNumbers;
		}
	}

	public static void main(String[] args) {
		Solution s=new SelfDividingNumbers().new Solution();
		List<Integer> nums=s.selfDividingNumbers(1, 6000);
		System.out.println(nums);

	}

}
