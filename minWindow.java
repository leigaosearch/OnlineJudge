public class Solution {
    public String minWindow(String S, String T) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] positions = new int[T.length()];
        int min = -1;
        int[] minPositions = new int[T.length()];
        
        for(int i=0; i<S.length(); i++)
        {
            for(int x=0; x<T.length(); x++)
            {
                if(T.charAt(x) == S.charAt(i))
                {
                    positions[x] = i;
                }
            }
            
            f
        }
        
    }
}
