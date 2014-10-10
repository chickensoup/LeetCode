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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (head == null)
        	return null;

        if (m == n)
        	return head;

        ListNode outer1, outer2, inner1, inner2;
        ListNode p, q;
        p = head;
        int index = 1;
        for (;index < m; index++)
        	p = p.next;

        outer1 = p;
        inner1 = p.next;

        

        
    }
}