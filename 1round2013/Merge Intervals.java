public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
         // Start typing your Java solution below
         // DO NOT write main() function
    	 ArrayList<Interval> result = new ArrayList<Interval>();
    	 if (intervals.size() == 0)
    		 return result;
    	 
    	 Collections.sort(intervals, new Comparator(){
    		 public int compare(Object o1, Object o2)
             {
            	 return (((Interval)o1).start - ((Interval)o2).start);
             }
    	 });
    	 
    	 Interval cc = new Interval(intervals.get(0).start, intervals.get(0).end);
    	 for (Interval ss : intervals)
    	 {
    		 if (ss.start <= cc.end && ss.end >= cc.end && ss.start >= cc.start)
    			 cc.end = ss.end;
    		 else if (ss.start >= cc.start && ss.end <= cc.end)
    			 cc.end = cc.end;
    		 else
    		 {
    			 result.add(cc);
    			 cc = new Interval(ss.start, ss.end);
    		 }
    		
    	 }
		 result.add(cc);
    
    	 return result;
     }