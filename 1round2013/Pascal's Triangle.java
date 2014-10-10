public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(numRows);
        if (numRows == 0)
            return list;

        int[][] num = new int[numRows][numRows];

        num[0][0] = 1;

        if (numRows > 1)
        {
            num[1][0] = 1;
            num[1][1] = 1;

            for (int i = 2; i < numRows; i++)
            {
                int j = 0;
                num[i][j] = 1;
                j++;
                for (; j < i; j++) 
                {
                   num[i][j] = num[i-1][j-1] + num[i-1][j]; 
                }
                num[i][j] = 1;
            }
        }
        
        for (int i = 0; i < numRows; i++)
        {
            ArrayList<Integer> ll = new ArrayList<Integer>(i+1);
            for (int j = 0; j <= i; j++)
            {
                ll.add(num[i][j]);
            }
            list.add(ll);
        }

        return list;
    }
}