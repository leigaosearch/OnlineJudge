public class Solution {
    public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        boolean[] numbers = new boolean[A.length+2];
        numbers[0] = true;
        
        for(int i=0; i<A.length; i++)
        {
            if((A[i] > 0) && (A[i] < A.length+2))
            {
                numbers[A[i]] = true;
            }
        }
        
        for(int x=0; x<A.length+2; x++)
        {
            if(numbers[x] == false) { return x; }
        }
        
        return 0;
    }
    
    
    
}
