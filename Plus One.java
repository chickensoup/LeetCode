public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (digits.length == 0)
        {
        	int[] result = new int[1];
        	result[0] = 1;
        	return result;
        }

        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; i--)
        {
        	digits[i - 1] += (digits[i] / 10);
        	digits[i] = digits[i] % 10;
        }

        if (digits[0] < 10)
        	return digits;
        else
        {
        	int[] result = new int[digits.length + 1];
        	result[0] = digits[0] / 10;
        	digits[0] = digits[0] % 10;
        	for (int i = 1; i <= digits.length; i++)
        		result[i] = digits[i - 1];
        	return result;
        }
        
    }
}