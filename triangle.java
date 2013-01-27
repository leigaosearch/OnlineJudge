public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        return triangleSearch(triangle, 0, 0);      
    }
    
    
    public int triangleSearch(ArrayList<ArrayList<Integer>> triangle, int position, int level)
    {
      
    	if(level == triangle.size()) { return 0; }
        
        if(position <= level)
    	{
            
    		return (triangle.get(level).get(position) + Math.min(triangleSearch(triangle, position, level+1), triangleSearch(triangle, position+1, level+1)));   		    	
    	}
    	else
    	{
    		return (triangle.get(level).get(position) + triangleSearch(triangle, position, level+1));
    	}
    }
	
}
