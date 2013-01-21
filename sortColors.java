public class Solution {
    public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
        
        for(int i=0; i<A.length; i++)
        {
            if(A[i] == 0) { redCount++; }
            else if(A[i] == 1) { whiteCount++; }
            else if(A[i] == 2) { blueCount++; }
        }
        
        int pos = 0;
        
        while(redCount > 0)
        {
            A[pos] = 0;
            redCount--;
            pos++;
        }
        
        while(whiteCount > 0)
        {
            A[pos] = 1;
            whiteCount--;
            pos++;
        }
        
        while(blueCount > 0)
        {
            A[pos] = 2;
            blueCount--;
            pos++;
        }
        
    }
}
