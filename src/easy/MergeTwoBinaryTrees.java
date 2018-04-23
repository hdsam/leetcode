
package easy;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 617. Merge Two Binary Trees
 * 
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.
 */
public class MergeTwoBinaryTrees {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	        TreeNode p = null;
	       Queue<TreeNode> queue=new LinkedList<>(); 
	        queue.add(t1);
	        queue.add(t2);
	        while(!queue.isEmpty()){
	            TreeNode n1=queue.poll();
	            TreeNode n2=queue.poll();
	           p=mergeTwoNodes(n1, n2);
	           queue.add(n1.left);
	           queue.add(n2.left);
	           queue.add(n1.right);
	           queue.add(n2.right);
	            
	        }
			return p;
	        
	    }

		public TreeNode mergeTwoNodes(TreeNode t1, TreeNode t2) {
			TreeNode newNode = null;
			if (t1 == null && t2 == null) {
				newNode = null;
			}
			newNode = new TreeNode(0);
			if (t1 != null) {
				newNode.val += t1.val;
			}
			if (t2 != null) {
				newNode.val += t2.val;
			}
			return newNode;
		}

	}

	public static void main(String[] args) {
		

	}

}
