public class Solution {
    public static String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
      int x, y;
    	boolean palindrome;
    	int maxSize = -1;
    	String maxPalindrome = "";
    	
    	for(int i=0; i<s.length(); i++)
    	{
    		for(int j=i; j<s.length(); j++)
    		{
    			palindrome = true;
    			x = i;
    			y = j;
    		
	    		while(x <= y)
	    		{
	    			if(s.charAt(x) != s.charAt(y))
	    			{
	    				palindrome = false;
	    				break;
	    			}

	    			x++;
	    			y--;
	    		}
	    		
	    		if(palindrome)
	    		{
	    			if((j-i) > maxSize)
	    			{
	    				maxSize = (j-i);
	    				maxPalindrome = s.substring(i,j+1);
	    				
	    			}
	    		}
	    		
	    		
    		}
    	}
        return maxPalindrome;
    }
	
}
