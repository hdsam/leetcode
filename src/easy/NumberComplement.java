package easy;

/*
 * 476. Number Complement
 * 
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
 * 
 * */
public class NumberComplement {

	class Solution {
		public int findComplement(int num) {
			int sum=0;
			int n=0;
			while (num > 0) {
				sum+=(1<<n++)*((num&1)^1);
				num>>>=1;
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		Solution s = new NumberComplement().new Solution();
		System.out.println(s.findComplement(5));
		System.out.println(Integer.toBinaryString(-5));
		System.out.println(Integer.toBinaryString(~5));
		
	}
}
