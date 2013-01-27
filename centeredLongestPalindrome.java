public class Solution {
      public static String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
      char[] word = s.toCharArray();
    	int left, right;
    	int maxSize = -1;
    	String maxPalindrome = "";
        
        if(s.length() == 1) {return s;}
        if((s.length() == 2) && (word[0] == word[1])) { return s; }
    	
	    for(int c=0; c<s.length(); c++)
	    {
	    	left = c-1;
	    	right = c+1;
	    	
	    	while((left >= 0) && (right < s.length()) && (word[left] == word[right]))
	    	{
	    		left--;
	    		right++;
	    	}
	    	
	    	left++;
	    	right--;
	    	
	    	if((right-left) > maxSize)
	    	{
                maxSize = right-left;
	    		maxPalindrome = s.substring(left, right+1);
	    	}
	    	
	    	if(c < s.length()-1)
            {
	    	left = c;
	    	right = c+1;
	    	
	    	while((left >= 0) && (right < s.length()) && (word[left] == word[right]))
	    	{
	    		left--;
	    		right++;
	    	}
            
            left++;
            right--;
	    	
	    	if((right-left) > maxSize)
	    	{
	    		maxSize = right-left;
	    		maxPalindrome = s.substring(left, right+1);
	    	}
            }
	    	
	    }	
	    	return maxPalindrome;
    }
	
}
