package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * 496. Next Greater Element I
 * 
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.

Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]
Explanation:
    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
    For number 1 in the first array, the next greater number for it in the second array is 3.
    For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
Example 2:
Input: nums1 = [2,4], nums2 = [1,2,3,4].
Output: [3,-1]
Explanation:
    For number 2 in the first array, the next greater number for it in the second array is 3.
    For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
 * 
 * Note:
All elements in nums1 and nums2 are unique.
The length of both nums1 and nums2 would not exceed 1000.
 * 
 * */
public class NextGreaterElementI {

	class Solution {
		public int[] nextGreaterElement(int[] nums1, int[] nums2) {
			int[] ans = new int[nums1.length];
			for (int i = 0; i < ans.length; i++) {
				ans[i] = getNextGreaterElement(nums2, nums1[i]);
			}
			return ans;
		}

		private int getNextGreaterElement(int[] nums2, int a1) {
			int i = 0;
			while (i < nums2.length && nums2[i] != a1)
				i++;
			while (i < nums2.length && nums2[i] <= a1)
				i++;
			return i < nums2.length ? nums2[i] : -1;
		}
	}

	// 2,6,3,5,1,4
	class Solution2 {
		public int[] nextGreaterElement(int[] nums1, int[] nums2) {
			int[] ans = new int[nums1.length];
			Map<Integer, Integer> resultMap = new HashMap<>();
			Stack<Integer> stack = new Stack<>();
			for (int i : nums2) {
				while (!stack.isEmpty() && stack.peek() < i) {
					resultMap.put(stack.pop(), i);
				}
				stack.push(i);
			}
			for (int i = 0; i < nums1.length; i++) {
				ans[i] = resultMap.getOrDefault(nums1[i], -1);
			}
			return ans;
		}
	}

	public static void main(String[] args) {
		Solution s = new NextGreaterElementI().new Solution();
		Solution2 s2 = new NextGreaterElementI().new Solution2();
		int[] nums1 = { 2, 4 };
		int[] nums2 = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(s.nextGreaterElement(nums1, nums2)));
		int[] a1 = { 4, 1, 2 };
		int[] a2 = { 1, 3, 4, 2 };
		System.out.println(Arrays.toString(s2.nextGreaterElement(a1, a2)));
	}

}
