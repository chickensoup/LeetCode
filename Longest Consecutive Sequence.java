//Longest Consecutive Sequence
    public int longestConsecutive(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	HashSet<Integer> hs = new HashSet<Integer>();
    	for(int val:num)
    	{
    		if (!hs.contains(val))
    			hs.add(val);
    	}
    	
    	int maxcount = 0;
    	for(int val : num)
    	{
    		int ss = val;
    		int leftcount = 0, rightcount = 0;
    		if (!hs.contains(ss))
    			continue;
    		
    		if (hs.contains(ss))
    		{
    			ss++;
    			while (hs.contains(ss))
    			{
    				rightcount++;
    				hs.remove(ss);
    				ss++;
    			}
    			
    			ss = val;
    			ss--;
    			while(hs.contains(ss))
    			{
    				leftcount++;
    				hs.remove(ss);
    				ss--;
    			}
    			
    			if(leftcount+rightcount > maxcount)
    				maxcount = leftcount+rightcount;
    		}
    	}
    	
    	return maxcount;
    }