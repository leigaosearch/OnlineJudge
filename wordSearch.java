public class Solution {
    public boolean exist(char[][] board, String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[i].length; j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    boolean[][] visited = new boolean[board.length][board[i].length];
                    visited[i][j] = true;
                    if(checkForWord(board,visited,i,j,word.substring(1)))
                    {
                        return true;
                    }
                }
            }
        
        }
        return false;
        
    }
    
    public boolean checkForWord(char[][] board, boolean[][] visited, int i, int j, String word)
    {
        if(word.length() == 0) { return true; }
        
        if((i>0) && (board[i-1][j] == word.charAt(0))) 
        { 
            if(!visited[i-1][j])
            {
                visited[i-1][j] = true;
                if(checkForWord(board,visited,i-1,j,word.substring(1))){ return true; }
                visited[i-1][j] = false;
            }
            
        }
        
        if((j>0) && (board[i][j-1] == word.charAt(0))) 
        {
            
            if(!visited[i][j-1])
            {
                visited[i][j-1] = true;
                if(checkForWord(board,visited,i,j-1,word.substring(1))){ return true; }
                visited[i][j-1] = false;
            }
        }
        
        if((i<board.length-1) && (board[i+1][j] == word.charAt(0))) 
        {
            if(!visited[i+1][j])
            {
                visited[i+1][j] = true;
                if(checkForWord(board,visited,i+1,j,word.substring(1))){ return true; }
                visited[i+1][j] = false;
            }
            
        }
        
        if((j<board[0].length-1) && (board[i][j+1] == word.charAt(0))) 
        {
            if(!visited[i][j+1])
            {
                visited[i][j+1] = true;
                if(checkForWord(board,visited,i,j+1,word.substring(1))){ return true; }
                visited[i][j+1] = false;
            }
            
        }
        return false;
    }
}
