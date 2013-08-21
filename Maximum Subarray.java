//Maximum Subarray
     public int maxSubArray(int[] A) {
         // Start typing your Java solution below
         // DO NOT write main() function
    	 if (A.length == 0)
    		 return 0;
    	 
    	 int tmax = A[0];
    	 for(int i = 0; i < A.length; i++)
    	 {
    		 if (A[i] > tmax)
    			 tmax = A[i];
    	 }
    	 if (tmax < 0)
    		 return tmax;
    	 
    				 
    	 int max = A[0];
    	 int sum = 0;
    	 for (int i = 0; i < A.length; i++)
    	 {
    		 if (sum + A[i] < 0)
    			 sum = 0;
    		 else
    		 {
    			 sum += A[i];
    			 if (sum > max)
    				 max = sum;
    		 }
    		
    	 }
    	 
    	 return max;
         
     }