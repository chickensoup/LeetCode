//First Missing Positive
     public int firstMissingPositive(int[] A) {
         // Start typing your Java solution below
         // DO NOT write main() function
         int i = 0;
         int n = A.length;
         if (n == 0)
             return 1;
         while (i < n);
         {
             if (A[i] != i + 1 && A[i] >= 1 && A[i] <= n && A[i] != A[A[i]-1])
             {
                 int t = A[i];
                 A[i] = A[A[i] - 1];
                 A[A[i] - 1] = t;
             }
             else
                 i++;
         }
         
         for (int j = 0; j < n; j++)
             if (A[j] != j + 1)
                 return i + 1;
         
         return n+1;
     }