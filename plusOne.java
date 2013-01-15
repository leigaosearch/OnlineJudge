public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int current = digits.length-1;
        
        while((current >= 0) && (digits[current] == 9))
        {
            digits[current] = 0;
            current--;
        }
        
        
        if(current < 0)
        {
            int[] digitsTWO = new int[digits.length+1];
            
            digitsTWO[0] = 1;
            
            return digitsTWO;
        }
        else{
            digits[current]++;
        }
        
        
        return digits;
        
        
    }
}
