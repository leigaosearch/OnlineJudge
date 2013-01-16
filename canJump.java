public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int pos=0;
        int min;
        int max;
        int nextPos;
        int nextVal;
        
        while(pos < A.length-1)
        {
            min = pos;
            max = pos + A[pos];
            nextPos = pos;
            nextVal = A[pos] + pos;
            
            if(max >= A.length-1) { return true; }
            
            
            for(int i=min; i<=max; i++)
            {
                if((A[i]+i) > nextVal)
                {
                    nextVal = A[i] + i;
                    nextPos = i;
                }
                
            }
            
            if(nextPos == pos) { return false; }
            else
            {
                pos = nextPos;
            }
        }
        return true;
        
    }
}
