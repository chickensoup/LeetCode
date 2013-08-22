public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> list = new ArrayList<String>();

        for(String s : strs)
        {
        	if (isAnagrams(s))
        		list.add(s);
        }
        
        return list;
    }

    private boolean isAnagrams(String s)
    {
    	if (s.length() == 0)
    		return false;
    	for (int i = 0, j = s.length() - 1; i < j; i++, j--)
    	{
    		if (s.charAt(i) != s.charAt(j))
    			return false;
    	}
    	return true;
    }
}