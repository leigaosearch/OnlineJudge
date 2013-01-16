public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        
        if(n == 1) { return 1; }
        else if(n == 2) { return 2; }
        else{
            return (climbStairs(n-1)+climbStairs(n-2));
        }
    }
}
