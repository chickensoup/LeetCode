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
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return convert(num, 0, num.length);
        
    }

    private TreeNode convert(int[] num, int start, int len)
    {
    	if (len == 0)
    		return null;
    	if (len == 1)
    	{
    		TreeNode root = new TreeNode(num[start]);
    		root.left = null;
    		root.right = null;
    		return root;
    	}

    	int leftlen = (len + 1) / 2 - 1;
    	TreeNode root = new TreeNode(num[start + leftlen]);
    	if (leftlen == 0)
    		root.left = null;
    	else
    	{
    		root.left = convert(num, start, leftlen);
    	}
    	root.right = convert(num, start + leftlen + 1, len - leftlen - 1);
    	return root;

    }
}