/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return convert(head);

        
    }

    private TreeNode convert(ListNode head)
    {
    	int len = listLength(head);
    	if (len == 0)
    		return null;
    	if (len == 1)
    	{
    		TreeNode root = new TreeNode(head.val);
    		root.left = null;
    		root.right = null;
    		return root;
    	}

    	ListNode cur = head, pre = null;
    	int index = 1;
    	while (index < (len + 1) / 2)
    	{
    		pre = cur;
    		cur = cur.next;
    		index++;
    	}

    	TreeNode root = new TreeNode(cur.val);
    	TreeNode right = null, left = null;
    	if (pre != null)
    	{
    		pre.next = null;
    		left = convert(head);
    	}

    	if (cur.next != null)
    		right = convert(cur.next);

    	root.left = left;
    	root.right = right;
    	return root;
    	
    }

    private int listLength(ListNode head)
    {
    	if (head == null)
    		return 0;

    	int len = 0;
    	ListNode p = head;
    	while (p != null)
    	{
    		len++;
    		p = p.next;
    	}
    	return len;
    }
}