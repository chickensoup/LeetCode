public class Solution {
    public int romanToInt(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int result = 0;
        for (int i 0 ; i < s.length(); i++)
        {

        }
    }

    private int toNum(char c)    
    {    
        switch(c)    
        {    
            case 'I':    
                return 1;    
            case 'V':    
                return 5;    
            case 'X':    
                return 10;    
            case 'L':    
                return 50;    
            case 'C':    
                return 100;    
            case 'D':    
                return 500;    
            case 'M':    
                return 1000;    
            default:    
                return 0;    
        }    
    }
}