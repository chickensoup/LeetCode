//Add Binary
     public String addBinary(String a, String b) {
         // Start typing your Java solution below
         // DO NOT write main() function
    	 int aindex = a.length() - 1;
    	 int bindex = b.length() - 1;
    	 String c = new String();
    	 int pre = 0, cur = 0;
    	 while (aindex >= 0 && bindex >= 0)
    	 {
    		 cur = (a.charAt(aindex) - '0') + (b.charAt(bindex) - '0') + pre;
    		 pre = cur / 2;
    		 cur = cur % 2;
    		 c = (char)(cur +'0') + c;
    		 aindex--;
    		 bindex--;
    	 }
    	 
    	 while (aindex >= 0)
    	 {
    		 cur = (a.charAt(aindex) - '0') + pre;
    		 pre = cur / 2;
    		 cur = cur % 2;
    		 c = (char)(cur +'0') + c;
    		 aindex--;
    	 }
    	 
    	 while (bindex >= 0)
    	 {
    		 cur = (b.charAt(bindex) - '0') + pre;
    		 pre = cur / 2;
    		 cur = cur % 2;
    		 c = (char)(cur +'0') + c;
    		 bindex--;
    	 }
    	 
    	 if (pre > 0)
    	 {
    		 c = (char)(pre + '0') + c;
    	 }
    	 
    	 return c;
         
     }