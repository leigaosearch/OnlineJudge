public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        boolean negFlag = false;
        int reverse = 0;
        
        if(x < 0)
        {
            negFlag = true;
            x = -x;
        }
        
        while(x != 0)
        {
          reverse = reverse * 10;
          reverse = reverse + x%10;
          x = x/10;
        }
    
        
        if(negFlag) { reverse = -reverse; }
        
        return reverse;
    }
}
