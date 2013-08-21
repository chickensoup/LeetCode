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
    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function        
        preOrder(root);
        
    }

    public void preOrder(TreeNode root)
    {
    	if (root == null)
    		return;

    	if (root.left != null)
    	{
    		preOrder(root.left);
    		TreeNode tail = root.left;
    		while (tail.right != null)
    			tail = tail.right;

    		tail.right = root.right;
    		root.right = root.left;
    		root.left = null;
    	}

    	preOrder(root.right);
    }
}