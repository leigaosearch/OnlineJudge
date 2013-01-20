public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        Stack<Character> brackets = new Stack<Character>();
        
      int  roundCount = 0;
        int curlyCount = 0;
        int squareCount = 0;
        
        for(int i=0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                brackets.push('(');
                roundCount++;
            }
            else if(s.charAt(i) == '{')
            {    
                brackets.push('{');
                curlyCount++;
            }
            else if(s.charAt(i) == '[')
            {
               brackets.push('[');
                squareCount++;
            }
            else if(s.charAt(i) == ')')
            {
                roundCount--;
                if((roundCount < 0) || (brackets.pop() != '(')) { return false; }
            }
            else if(s.charAt(i) == '}')
            {    
                curlyCount--;
                if((curlyCount < 0) || (brackets.pop() != '{')) { return false; }
            }
            else if(s.charAt(i) == ']')
            {
                squareCount--;
                if((squareCount < 0) || (brackets.pop() != '[')) { return false; }
            }
        }
        
        
        if((curlyCount == 0) && (roundCount == 0) && (squareCount == 0)) { return true; }
        else { return false; }
        
    }
}
