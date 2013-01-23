public class Solution {
    public boolean isNumber(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        s = s.trim(); // trim spaces
        
        boolean eFlag = false;
        boolean periodFlag = false;
        boolean numFlag = false;
        
        for(int i=0; i<s.length(); i++)
        {
            if((s.charAt(i) >= '0') && (s.charAt(i) <= '9')) { numFlag = true; /*do nothing*/ }
            else if((s.charAt(i) == 'e') && (i != 0))
            {
                if(eFlag) { return false; }
                else if(!numFlag) { return false; }
                else if(i == (s.length()-1)) { return false; }
                else
                {
                    eFlag = true;
                    numFlag = false;
                }
                
            }
            else if(s.charAt(i) == '.')
            {
                if(eFlag) { return false; }

                if(periodFlag) { return false; } 
                else
                {
                    periodFlag = true;
                }  

            }
            else if(((s.charAt(i) == '+') || (s.charAt(i) == '-')) && (i == 0)) { }
            else if(((s.charAt(i) == '+') || (s.charAt(i) == '-')) && (s.charAt(i-1) == 'e')) { }
            else
            {
                return false;
            }
        }
        
        if(numFlag)
        {
            return true;
        }
        else { return false; }
    }
}
