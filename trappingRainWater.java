public class Solution {
    public int trap(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
     
     
       
        int previousHighest = 0;
        int nextHighest = 0;
        int waterHeld = 0;
        
        
        for(int i=0; i<A.length; i++)
        {
            nextHighest = 0;
            
            for(int x=i+1; x<A.length; x++)
            {
                if(A[x] > nextHighest) { nextHighest = A[x]; }
            }
            
            if((Math.min(previousHighest, nextHighest) - A[i]) > 0)
            {
                waterHeld += (Math.min(previousHighest, nextHighest) - A[i]);
            }
            
            if(A[i] > previousHighest)
            {
                previousHighest = A[i];
            }
        }
        
        return waterHeld;
     
    }
}
