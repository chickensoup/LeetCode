public class Solution {
    public boolean isScramble(String s1, String s2) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if (s1.length() != s2.length())
    		return false;

    	int len = s1.length();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        boolean[][][] result = new boolean[len][len][len];
        for (int i = 0; i < len; i++)
        {
        	for (int j = 0; j < len; j++)
        	{
        		result[0][i][j] = (c1[i] == c2[j]);
        	}
        }

        for (int k = 2; k <= len; k++)
        {
        	for (int i = len - k; i >= 0; i--)
        	{
        		for (int j = len - k; j >= 0; j--)
        		{
        			boolean b = false;
        			for (int m = 0; m < k && !b; m++)
        			{
        				b = (result[m][i][j] && result[k-m][i+m][j+m]) || (result[m][i][j+k-m] && result[k-m][i+m][j]);
        			}
        			result[k][i][j] = b;
        		}
        	}
        }
        return result[len - 1][0][0];
        
    }
}