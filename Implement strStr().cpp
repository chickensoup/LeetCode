class Solution {
public:
    char *strStr(char *haystack, char *needle) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int needlelen = strlen(needle);
        int haystacklen = strlen(haystack);
        if (needlelen == 0)
            return haystack;
            
        char *p = haystack;
        while (*p != '\0')
        {
            if (haystacklen < needlelen)
        		return NULL;
        	if (cmp(p, needle))
        		return p;
        	p++;
        	haystacklen--;
        }
        return NULL;
    }

    bool cmp(char *s, char *ne)
    {
    	while (*s != '\0' && *ne != '\0')
    	{
    		if (*s == *ne)
    		{
    			s++;
    			ne++;
                continue;
    		}	
    		else
    			return false;
    	}
    	if (*ne == '\0')
    		return true;
    	else
    		return false;
    }
};