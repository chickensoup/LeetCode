public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(prices.length <= 1)
        	return 0;

        int max = 0;
        for (int i = 1; i < prices.length; i++)
        {
        	int sum = maxProfit(prices, 0, i) + maxProfit(prices, i, prices.length - 1);

        	if (sum > max)
        		max = sum;
        }
        return max;


    }

    public int maxProfit(int[] prices, int start, int end)
    {
    	if (end - start == 0)
        	return 0;

        int min = prices[start], maxprofit = prices[start+1] - prices[start] > 0 ? prices[start+1] - prices[start] : 0;
        if (end - start == 1)
			return maxprofit;        	

        for (int i = start+1; i <= end; i++)
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