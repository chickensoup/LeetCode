public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int i = 0, j = s.length() - 1;
        while (i < j)
        {
        	char ci = Character.toLowerCase(s.charAt(i));
        	while ( (i < j) && isNotalphanumeric(c))
        	{
        		i++;
        		ci = Character.toLowerCase(s.charAt(i));
        	}

        	char cj = Character.toLowerCase(s.charAt(j));
        	while ( (i < j) && isNotalphanumeric(c))
        	{
        		j--;
        		cj = Character.toLowerCase(s.charAt(j));
        	}

        	if (i >= j)
        		return true;
        	else if (ci != cj)
        		return false;
        	else
        	{
        		i++;
        		j--;
        	}
        }

        return true;
    }

    private boolean isNotalphanumeric(char c)
    {
    	return !((ci >= 'a' && ci <= 'z') || (ci >= '1' && ci <= '9'));
    }
}