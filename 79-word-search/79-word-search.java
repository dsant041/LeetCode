class Solution {
    public boolean exist(char[][] board, String word) {
        
        if (board == null || word == null || board.length == 0 || word.length() == 0)
            return false;

        for (int i=0; i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                
                if (board[i][j] == word.charAt(0)){
                    
                    board[i][j] = '-';
                    
                    if (exists(board,word.substring(1,word.length()),i,j))
                        return true;
                    else
                        board[i][j] = word.charAt(0);
                    
                }
                
            }
        }
                        
        return false;
        
    }
    
    public boolean exists(char[][] board, String word, int i, int j){
        
        if (word.length() == 0)
            return true;
        
        if (i+1 < board.length && board[i+1][j] != '-' && board[i+1][j] == word.charAt(0)){
            board[i+1][j] = '-';
                    
            if (exists(board,word.substring(1,word.length()),i+1,j))
                return true;
            else
                board[i+1][j] = word.charAt(0);
        }
        
        if (i-1 >= 0 && board[i-1][j] != '-' && board[i-1][j] == word.charAt(0)){
            board[i-1][j] = '-';
                    
            if (exists(board,word.substring(1,word.length()),i-1,j))
                return true;
            else
                board[i-1][j] = word.charAt(0);
        }
        
        if (j+1 < board[0].length && board[i][j+1] != '-' && board[i][j+1] == word.charAt(0)){
            board[i][j+1] = '-';
                    
            if (exists(board,word.substring(1,word.length()),i,j+1))
                return true;
            else
                board[i][j+1] = word.charAt(0);
        }
        
        if (j-1 >= 0 && board[i][j-1] != '-' && board[i][j-1] == word.charAt(0)){
            board[i][j-1] = '-';
                    
            if (exists(board,word.substring(1,word.length()),i,j-1))
                return true;
            else
                board[i][j-1] = word.charAt(0);
        }
        
        return false;
        
        
    }
}