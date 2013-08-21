public class Solution {

	int[][] minsum;

    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return minT(0, 0, triangle);
        
    }

    public int minT(int i, int j, ArrayList<ArrayList<Integer>> triangle)
    {
    	if (i == triangle.size() - 1)
    		return triangle.get(i).get(j);
    	else
    		return triangle.get(i).get(j) + min(minT(i+1,j, triangle), minT(i+1,j+1,triangle));
    }

    public int min(int a, int b)
    {
    	return a < b ? a : b;
    }
}