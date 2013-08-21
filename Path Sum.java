/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null)
        	return false;
        
    	boolean rootb = false, leftb = false, rightb = false;
    	if (root != null && root.right == null && root.left == null)
    		return (root.val == sum);

        if (root.left != null)
        {
        	leftb = hasPathSum(root.left, sum-root.val);
        	if (leftb)
        		return true;
        }	

        if (root.right != null)
        {
        	rightb = hasPathSum(root.right, sum-root.val);
        	if (rightb)
        		return true;
        }

        return false;
    }
}