public class Solution {
        public ArrayList<ArrayList<Integer>> generate(int numRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
        
        if(numRows == 0) { return triangle; }
        
        ArrayList<Integer> toAdd = new ArrayList<Integer>();
        toAdd.add(1);
        triangle.add(toAdd);
        
        if(numRows == 1) { return triangle; } 
        
        int level;
        int num;
        
        for(int i=1; i<numRows; i++)
        {
          toAdd = new ArrayList<Integer>();
        	level = i;
            
        	toAdd.add(1);
            for(int j=1; j<level; j++)
            {
            	num = triangle.get(level-1).get(j) + triangle.get(level-1).get(j-1);
            	
                toAdd.add(num);
            }
            toAdd.add(1);
            
            triangle.add(toAdd);
        }
        
        return triangle;
    }
}
