public class Solution {
    public int ladderLength(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        map.put(start, new ArrayList<String>());
        map.put(end, new ArrayList<String>());
        
        for (String s : dict)
            map.put(s, new ArrayList<String>());
            
        for (String s : map.keySet())
        {
            ArrayList<String> al = new ArrayList<String>();
            for (String t : map.keySet())
            {
                if (GetDistance(s, t) == 1)
                    al.add(t);
            }
            map.put(s, al);
        }
        
        ArrayList<String> all = new ArrayList<String>(map.get(start));
        ArrayList<String> second = new ArrayList<String>();
        HashSet<String> visited = new HashSet<String>();
        int steps = 0;
        while (all.size() != 0)
        {
            steps++;
            for(String s : all)
            {
                if (s.equals(end))
                    return steps+1;
                
                if (!visited.contains(s))
                {
                    visited.add(s);
                    second.addAll(map.get(s));
                }
            }
            all.clear();
            all = new ArrayList(second);
            
            second.clear();
        }
        
        return 0;
    }
    
    public int GetDistance(String s1, String s2)
    {
        int count = 0;
        for (int i= 0; i < s1.length(); i++)
        {
            if (s1.charAt(i) != s2.charAt(i))
                count++;
            
        }
        
        return count;
    }
}