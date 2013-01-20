public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        if(A.length == 0) { return 0; }
        
        int pos = 0;
        
        for(int i=0; i<A.length; i++)
        {
            
            if(A[i] != elem)
            {
                A[pos] = A[i];
                pos++;
            }
            
        }
        
        return pos;
        
    }
}
