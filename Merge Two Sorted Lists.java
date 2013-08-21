//Merge Two Sorted Lists
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         // Start typing your Java solution below
         // DO NOT write main() function
    	 if (l1 == null && l2 == null)
    		 return null;
    	 
    	 if (l1 == null)
    		 return l2;
    	 if (l2 == null)
    		 return l1;
    	 
    	 ListNode head = new ListNode(0);
    	 ListNode p = head;
    	 ListNode p1 = l1, p2 = l2;
    	 while (p1 != null && p2 != null)
    	 {
    		 if (p1.val < p2.val)
    		 {
    			 p.next = p1;
    			 p1 = p1.next;
    			 p = p.next;
    		 }
    		 else
    		 {
    			 p.next = p2;
    			 p2 = p2.next;
    			 p = p.next;
    		 }
    	 }
    	 
    	 while (p1 != null)
    	 {
    		 p.next = p1;
			 p1 = p1.next;
			 p = p.next;
    	 }
    	 
    	 while (p2 != null)
    	 {
    		 p.next = p2;
			 p2 = p2.next;
			 p = p.next;
    	 }
    	 
    	 return head.next;
     }