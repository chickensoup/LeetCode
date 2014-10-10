public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (prices.length <= 1)
        	return 0;

        int min = prices[0], maxprofit = prices[1] - prices[0] > 0 ? prices[1] - prices[0] : 0;
        for (int i = 1; i < prices.length; i++)
        {
            if (prices[i] - min > maxprofit)
            {
                maxprofit = prices[i] - min;
            }
            else if (prices[i] < min)
                min = prices[i];
        }

        return maxprofit;

    }
}