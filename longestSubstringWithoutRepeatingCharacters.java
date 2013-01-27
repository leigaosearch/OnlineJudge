public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int[] alphabet = new int[26];
      int start = 0;
    	int end = 0;
    	int current = 0;
        int max = 0;
     
        
        for(int i=0; i<s.length(); i++)
        {
        	while(alphabet[s.charAt(i)-'a'] > 0)
        	{
        		alphabet[s.charAt(start)-'a']--;
        		start++;
        		current--;
        	}
        	
        	
        		alphabet[s.charAt(i)-'a']++;
        		current++;
        		end++;
        	
        	
        	if(current > max) { max = current; }
        }
        
        if(current > max) { max = current; }
        return max;
        
    }

}
