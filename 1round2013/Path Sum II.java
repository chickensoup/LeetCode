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
    
	public static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root == null)
        	return result;

        result.clear();
        if (root != null)
        {
        	pathSumList(root, sum, new ArrayList<Integer>());
        }

        return result;
        
    }

    public void pathSumList(TreeNode root, int sum, ArrayList<Integer> list)
    {
    	
    	if (root != null && root.left == null && root.right == null)
    	{
    		ArrayList<Integer> ll = new ArrayList<Integer>(list);
    		if (root.val == sum)
    		{
    			ll.add(root.val);
    			result.add(ll);
    		}	
    	}

    	if (root.left != null)
        {
        	ArrayList<Integer> ll = new ArrayList<Integer>(list);
        	ll.add(root.val);
        	pathSumList(root.left, sum-root.val, ll);
        }

        if (root.right != null)
        {
        	ArrayList<Integer> ll = new ArrayList<Integer>(list);
        	ll.add(root.val);
        	pathSumList(root.right, sum-root.val, ll);
        }
        	
    }
}