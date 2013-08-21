public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        rowIndex = rowIndex+1;
        ArrayList<Integer> list = new ArrayList<Integer>(rowIndex);

        int[] num = new int[rowIndex];

        num[0] = 1;

        int i = 2;
        if (rowIndex > 1)
        {
            num[1] = 1;

            for (; i < rowIndex; i++)
            {
                int j = i;
                num[j] = 1;
                j--;
                for (; j > 0; j--) 
                {
                   num[j] = num[j]+num[j-1];
                }
            }
        }

        for (int j = 0; j < rowIndex; j++)
        {
        	list.add(num[j]);
        }

        return list;
    }
}