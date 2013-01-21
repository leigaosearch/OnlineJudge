public class Solution {
    public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length() == 0) { return 0; }
        
        return decodeWays(s);
        
    }
    
    
    public int decodeWays(String s)
    {
        
        if(s.length() == 0) { return 1; }
        else if(s.charAt(0) == '0') { return 0; }
        else if((s.length() > 1) && (s.charAt(0) == '1')) { return decodeWays(s.substring(1)) + decodeWays(s.substring(2)); }
        else if((s.length() > 1) && (s.charAt(0) == '2') && (s.charAt(1) >= '0' && s.charAt(1) < '7')) 
        {
            return decodeWays(s.substring(1)) + decodeWays(s.substring(2));
        }
        else
        {
            return decodeWays(s.substring(1));
        }
    }
}
