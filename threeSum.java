public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int c;
        
        ArrayList<ArrayList<Integer>> triplets = new ArrayList<ArrayList<Integer>>();
        
        if(num.length < 3) { return triplets; }
        
        Arrays.sort(num);
        
        for(int a=0; a<num.length-2; a++)
        {
            for(int b=a+1; b<num.length-1; b++)
            {
                c = num.length-1;
                
                while(((num[a] + num[b] + num[c]) > 0) && (c > b))
                {
                    c--;
                }
                
                if(((num[a] + num[b] + num[c]) == 0) && (c > b))
                {
                    ArrayList<Integer> toAdd = new ArrayList<Integer>();
                    toAdd.add(num[a]);
                    toAdd.add(num[b]);
                    toAdd.add(num[c]);
                    
                    if(!triplets.contains(toAdd))
                    {
                    triplets.add(toAdd);
                    }
                    //add
                    c--;
                }
            }
        }
        return triplets;
    }
}
