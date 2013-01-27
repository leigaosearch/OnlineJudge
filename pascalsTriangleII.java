public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<Integer> current = new ArrayList<Integer>();
        ArrayList<Integer> previous = new ArrayList<Integer>();
        
        if(rowIndex == 0) { return current; }
        
        current.add(1);
        
        if(rowIndex == 1) { return current; }   
        
        for(int i=1; i<rowIndex; i++)
        {
          previous = new ArrayList<Integer>(current);
        	current.clear();
        	System.out.println(i);
        	current.add(1);
        	for(int x=1; x<i-1; x++)
        	{
        		current.add(previous.get(x) + previous.get(x-1));
        	}
        	current.add(1);
        }
        
        return current;
    }
}
