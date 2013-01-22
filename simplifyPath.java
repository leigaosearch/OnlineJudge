public class Solution {
    public String simplifyPath(String path) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        Stack<String> pathVars = new Stack<String>();
        
        String[] splitPath = path.split("/");
        
        for(int i=0; i<splitPath.length; i++)
        {
            
            if(splitPath[i].equals(".") || splitPath[i].equals("") || splitPath[i].equals("/")) { }
            else if(splitPath[i].equals("..")) 
            {
                if(!pathVars.isEmpty())
                {
                    pathVars.pop();
                }
            }
            else
            {
                pathVars.push(splitPath[i]);
            }
        }
        
        String toReturn = "";
        String add;
        
        while(!pathVars.isEmpty())
        {
            add = pathVars.pop();
            
            if(!add.equals(""))
            {
            
            toReturn = "/" + add + toReturn;
            
            }
        }
        
        if(toReturn.equals("")) { return "/"; }
        
        
        return toReturn;
    }
}
