public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int x;
        
        if(needle.length() == 0) { return haystack; }
        
        for(int i=0; i<haystack.length(); i++)
        {
            x=0;
            while((x < needle.length()) && (x+i < haystack.length()) && (haystack.charAt(i+x) == needle.charAt(x)))
            {
                x++;
            }
            
            if(x == needle.length()) { return haystack.substring(i); }
        }
        
        return null;
    }
}
