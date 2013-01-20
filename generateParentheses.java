public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> combinations = new ArrayList<String>();
        
        recursiveParentheses(n, "(", combinations, 1);
        
        return combinations;
        
    }
    
    
    public void recursiveParentheses(int n, String str, ArrayList<String> combinations, int openCount)
    {
        
        if(str.length() == (n*2)) { combinations.add(str); }
        else if(((n*2)-str.length()) == openCount) { recursiveParentheses(n, str + ")",combinations,openCount-1); }
        else if(openCount == 0) { recursiveParentheses(n, str + "(",combinations,openCount+1); }
        else{
            
            recursiveParentheses(n, str + ")",combinations,openCount-1);
            recursiveParentheses(n, str + "(",combinations,openCount+1);
        }
        
    }
}
