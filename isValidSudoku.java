public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean[] usedNumbers = new boolean[10];
        
        for(int x=0; x<9; x++)
        {
            Arrays.fill(usedNumbers, Boolean.FALSE);
            for(int y=0; y<9; y++)
            {
                if(!(board[x][y] == '.'))
                {
                    if(usedNumbers[board[x][y]-'1'] == true) { return false; }
                    else { usedNumbers[board[x][y]-'1'] = true; }
                }
            }
        }
        
        for(int y=0; y<9; y++)
        {
            Arrays.fill(usedNumbers, Boolean.FALSE);
            for(int x=0; x<9; x++)
            {
                if(!(board[x][y] == '.'))
                {
                    if(usedNumbers[board[x][y]-'1'] == true) { return false; }
                    else { usedNumbers[board[x][y]-'1'] = true; }
                }
            }
        }
        
        
        for(int yquad=0; yquad<9; yquad=yquad+3)
        {
            for (int xquad=0; xquad<9; xquad=xquad+3)
            {
                 Arrays.fill(usedNumbers, Boolean.FALSE);
                for(int x=0; x<3; x++)
                {
                    for(int y=0; y<3; y++)
                    {
                        if(!(board[x+xquad][y+yquad] == '.'))
                        {
                            if(usedNumbers[board[x+xquad][y+yquad]-'1'] == true) { return false; }
                            else { usedNumbers[board[x+xquad][y+yquad]-'1'] = true; }
                        } 
                    }
                }
            }
        }
        return true;
    }
}
