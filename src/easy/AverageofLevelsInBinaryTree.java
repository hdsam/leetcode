package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * 637. Average of Levels in Binary Tree
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
Example 1:
Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
Explanation:
The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 * 
 * The range of node's value is in the range of 32-bit signed integer.
 * */

public class AverageofLevelsInBinaryTree {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public List<Double> averageOfLevels(TreeNode root) {
			List<Double> list = new ArrayList<>();
			Queue<TreeNode> queue = new LinkedList<>();
			queue.add(root);
			double sum;
			while (!queue.isEmpty()) {
				TreeNode p = null;
				int i = 0;
				sum = 0.0;
				int size = queue.size();
				while (i < size && !queue.isEmpty()) {
					p = queue.poll();
					sum += p.val;
					if (p.left != null) {
						queue.add(p.left);
					}
					if (p.right != null) {
						queue.add(p.right);
					}
					i++;
				}
				list.add(sum / size);
			}
			return list;
		}

	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		Solution s = new AverageofLevelsInBinaryTree().new Solution();
		System.out.println(s.averageOfLevels(root));

	}

}
