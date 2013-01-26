public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int j;
        int k;
        int sum;
        ArrayList<ArrayList<Integer>> matchingSums = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> addSum;
        
        if(num.length < 3) { return matchingSums; }
        
        Arrays.sort(num);
        
        for(int i=0; i<num.length; i++)
        {
            
            if(num[i] > 0)
            {
                break;
            }
            
            j=i+1;
            k=num.length-1;
            
            while(j < k)
            {
                sum = num[i]+num[j]+num[k];
                
                if(sum == 0) 
                { //add 
                    addSum = new ArrayList<Integer>();
                    addSum.add(num[i]);
                    addSum.add(num[j]);
                    addSum.add(num[k]);
                    
                    if(!matchingSums.contains(addSum))
                    {
                        matchingSums.add(addSum);
                    }
                    j++;
                    k--;
                }
                else if(sum > 0) { k--; }
                else { j++; }
            }
        }
        
        return matchingSums;
    }
}
