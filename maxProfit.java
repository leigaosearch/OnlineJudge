 public class Solution {
    public int maxProfit(int[] prices) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int maxSum = 0;
        int currentSum = 0;
        
        for(int i=1; i<prices.length; i++)
        {
            currentSum = currentSum + (prices[i] - prices[i-1]);
            
            if(currentSum > maxSum)
            {
                maxSum = currentSum;
            }
            
            if(currentSum < 0)
            {
                currentSum = 0;
            }
        }
        return maxSum;
        
    }
}
