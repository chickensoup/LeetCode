public int lengthOfLastWord(String s) {
         // Start typing your Java solution below
         // DO NOT write main() function
         int length = 0;
         if (s.length() == 0)
             return 0;
    	 int i = s.length() - 1;
    	 while (i >= 0 && s.charAt(i) == ' ')
    		 i--;
    	 
    	 while (i >= 0 && s.charAt(i) != ' ')
    	 {
    		 i--;
    		 length++;
    	 }
    	 
    	 return length;
     }