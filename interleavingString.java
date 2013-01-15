public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int pos1 = 0;
        int pos2 = 0;
        
        for(int i=0; i<s3.length(); i++)
        {
            if((pos1 < s1.length()) && (pos2 < s2.length()) && (s3.charAt(i) == s1.charAt(pos1)) && (s3.charAt(i) == s2.charAt(pos2)))
            {
                return (isInterleave(s1.substring(pos1+1),s2.substring(pos2),s3.substring(i+1)) || isInterleave(s1.substring(pos1),s2.substring(pos2+1),s3.substring(i+1)));  
            }
            else if((pos1 < s1.length()) && (s3.charAt(i) == s1.charAt(pos1))) { pos1++; }
            else if((pos2 < s2.length()) && (s3.charAt(i) == s2.charAt(pos2))) { pos2++; }
            else { return false; }
            
        }

        if((pos1 == s1.length()) && (pos2 == s2.length()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
