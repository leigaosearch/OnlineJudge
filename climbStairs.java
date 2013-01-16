public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function

        int total = 0;
        int x = 0;
        int y = 1;
        

        while(n > 0)
        {
            total = x + y;
            x = y;
            y = total;
            n--;  
        }
        
        
        return total;
    }
}
