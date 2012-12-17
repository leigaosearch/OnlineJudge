public class Solution {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<ArrayList<Integer>> coms = new ArrayList<ArrayList<Integer>>();
        
        ArrayList<Integer> current = new ArrayList<Integer>();
        
        getCombinations(coms, current, 0, n, k);
        
        return coms;
        
    }
    
    
    public void getCombinations(ArrayList<ArrayList<Integer>> coms, ArrayList<Integer> current, int pos, int n, int k)
    {
        if(current.size() == k) 
        { 
            coms.add(new ArrayList<Integer>(current)); 
            
        }
        else
        {
            for(int i=pos; i < n; i++)
            {
                current.add(i+1);
                
                getCombinations(coms, current, i+1, n, k); 
                
                current.remove(current.size()-1);
            }
        }
        
    }
}