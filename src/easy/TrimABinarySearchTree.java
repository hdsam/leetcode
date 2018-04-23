package easy;

/*
 * 669. Trim a Binary Search Tree
 * 
 * Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

Example 1:
Input: 
    1
   / \
  0   2

  L = 1
  R = 2

Output: 
    1
      \
       2
Example 2:
Input: 
    3
   / \
  0   4
   \
    2
   /
  1

  L = 1
  R = 3

Output: 
      3
     / 
   2   
  /
 1
 * */

public class TrimABinarySearchTree {
	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public TreeNode trimBST(TreeNode root, int L, int R) {
			if (root == null) {
				return null;
			}
			if (root.val < L) {
				return trimBST(root.right, L, R);
			}
			if (root.val > R) {
				return trimBST(root.left, L, R);
			}
			root.left = trimBST(root.left, L, R);
			root.right = trimBST(root.right, L, R);
			return root;
		}

	}

	public static void inOrderTraverse(TreeNode node) {
		if (node != null) {
			inOrderTraverse(node.left);
			System.out.print(node.val + "\t");
			inOrderTraverse(node.right);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(9);

		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(4);

		root.right.left = new TreeNode(7);
		root.right.right = new TreeNode(10);

		root.left.left.right = new TreeNode(8);
		inOrderTraverse(root);
		System.out.println();

		Solution s = new TrimABinarySearchTree().new Solution();
		TreeNode res = s.trimBST(root, 3, 7);
		inOrderTraverse(res);
	}

}
