//Edit Distance
     public int minDistance(String word1, String word2) {
         // Start typing your Java solution below
         // DO NOT write main() function
     	int n1 = word1.length(), n2 = word2.length();
 		if (n1 == 0)
 			return n2;
 		if (n2 == 0)
 			return n1;
 		
 		int[][] r = new int[n1+1][n2+1];
 		for (int i = 0; i < n1 + 1; i++)
 			r[i] = new int[n2 + 1];
 		char[] c1 = word1.toCharArray();
 		char[] c2 = word2.toCharArray();
 		
 		for (int i = 0; i <= n1; i++)
 			r[i][0] = i;
 		for (int j = 0; j <= n2; j++)
 			r[0][j] = j; 		
 		
 		for (int i = 1; i <= n1; i++)
 		{
 			for (int j = 1; j <= n2; j++)
 			{
 				if (c1[i-1] == c2[j-1])
 					r[i][j] = r[i-1][j-1];
 				else
 					r[i][j] = min( min(r[i-1][j], r[i][j-1]), r[i-1][j-1] ) + 1;
 			}
 		}
 		
 		return r[n1][n2];
         
     }
     
     private static int min(int num1, int num2)
     {
    	 return (num1 < num2) ? num1 : num2;
     }