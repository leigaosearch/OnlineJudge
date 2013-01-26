public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int[] twoSum = new int[2];

        for(int i=0; i<numbers.length; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                if((numbers[i]+numbers[j]) == target)
                {
                    twoSum[0] = i+1;
                    twoSum[1] = j+1;
                    
                    return twoSum;
                }
            }
        }
        
        return null;
    }
}
