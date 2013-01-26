public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        for(int i=0; i<A.length; i++)
        {
            if(target <= A[i])
            {
                return i;
            }
        }
        return A.length;
        
    }
}
