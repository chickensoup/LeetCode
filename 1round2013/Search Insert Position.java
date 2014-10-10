public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int start = 0, end = A.length - 1, mid;
        while (start < end)
        {
        	mid = (start + end) / 2;
        	if (A[mid] == target)
        		return mid;
        	else if (A[mid] > target)
        		end = mid;
        	else
        		start = mid;
        }

        if (A[start] < target)
        	return start + 1;
        else
        	return start - 1;
        
    }
}