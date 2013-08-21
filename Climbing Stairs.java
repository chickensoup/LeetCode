//Climbing Stairs
     public int climbStairs(int n) {
         // Start typing your Java solution below
         // DO NOT write main() function
         //f(n)=f(n-1)+f(n-2)+2;
         if (n == 0)
             return 0;
         if (n == 1)
        	 return 1;
         if (n == 2)
        	 return 2;
         
         int f1 = 1, f2 = 2;
         int f = 0;
         int count = 2;
         while(count < n)
         {
        	 f = f1 + f2;
        	 f1 = f2;
        	 f2 = f;
        	 count++;
         }
         
         return f;
     }