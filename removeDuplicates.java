public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(A.length == 0) { return 0; }
        
        int current = A[0];
        int pos = 1;
        
        for(int i=1; i<A.length; i++)
        {
            if(A[i] == current) { }
            else
            {
                A[pos] = A[i];
                pos++;
                current = A[i];
            }
        }
        
        return pos;
        
    }
}
