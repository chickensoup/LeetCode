/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null)
        	return null;

        if (head.next == null)
        	return head;

        ListNode thead = new ListNode(head.val + 1);
        thead.next = head;
        ListNode pre = thead;
        ListNode cur = head;
        while (cur != null && cur.next != null)
        {
            if (cur.val != cur.next.val)
            {
                pre.next = cur;
                cur = cur.next;
            }
            else
            {
                int temp = cur.val;
                while (cur != null && cur.val == temp)
                    cur = cur.next;

                pre.next = cur;
            }
        }

        

        return thead.next;
        
    }
}