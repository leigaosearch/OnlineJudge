public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        ArrayList<String> combinations = new ArrayList<String>();
        
        letterRecurse(digits, combinations, "");
        
        return combinations;
    }
    
    public void letterRecurse(String digits, ArrayList<String> combinations, String current)
    {
        
        String[] mappings = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        if(digits.length() == 0) { combinations.add(current);}
        else
        {
            int num = Character.getNumericValue(digits.charAt(0));
        
             for(int i=0; i<mappings[num].length(); i++)
              {
                letterRecurse(digits.substring(1), combinations, current + mappings[num].charAt(i));
              }
        }
    }
    
}
