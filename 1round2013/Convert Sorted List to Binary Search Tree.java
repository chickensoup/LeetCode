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
        if (head == null)
        	return null;

       	TreeNode root = null;
       	ListToBST(head, root);
       	return root;


        
    }
	
	void ListToBST(ListNode head, TreeNode root)
	{
		if (head == null)
			return;

		int length = ListLength(head);
		ListNode pre = head;
		ListNode cur = head;
		int i = 0;
		while (i < length / 2)
		{
			pre = cur;
			cur = cur.next;
			i++;
		}

		root = new TreeNode(cur.val);
		pre.next = null;

		if (i == 0)
			return;

		ListToBST(head, root.left);
		ListToBST(cur.next, root.right);
	}
	

	int ListLength(ListNode head)
	{
		int count = 0;
		ListNode p = head;
		while (p != null)
		{
			p = p.next;
			count++;
		}

		return count;
	}
}