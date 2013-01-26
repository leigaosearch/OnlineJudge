public class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int max = 999;
        int current = 0;
        String maxPrefix = "";
        
        if(strs.length == 1) {return strs[0];}
        
        for(int i=0; i<strs.length; i++)
        {
            current = 0;
            for(int j=i+1; j<strs.length; j++)
            {
                while((current < strs[i].length()) && (current < strs[j].length()) && (strs[i].charAt(current) == strs[j].charAt(current)))
                {
                    current++;
                }
                
                if(current < max) {
                    max = current;
                    maxPrefix = strs[i].substring(0,current);
                    
                }
            }
        }
        return maxPrefix;
    }
}
