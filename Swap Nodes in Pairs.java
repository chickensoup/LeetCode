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
    public ListNode swapPairs(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null || head.next == null)
            return head;

        ListNode fakehead = new ListNode(0);
        fakehead.next = head;
        ListNode pre = fakehead, cur1 = head, cur2 = head.next, next = cur2.next;
        while (true)
        {
        	pre.next = cur2;
        	cur2.next = cur1;
        	cur1.next = next;

        	pre = cur1;
        	if (pre.next != null)
        		cur1 = pre.next;
        	else
        		break;

        	if (cur1 != null && cur1.next != null)
        		cur2 = cur1.next;
        	else
        		break;

        	next = cur2.next;
        }

        return fakehead.next;
    }
}