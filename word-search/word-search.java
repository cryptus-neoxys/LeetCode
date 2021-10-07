class Solution {
    public boolean helper(char[][] board, int i, int j, String word) {
        if(word.length() == 0) return true;
        
        if(
            i < 0 || j < 0 || 
            i >= board.length || 
            j >= board[0].length || 
            board[i][j] != word.charAt(0)
          ) return false;
        
        char c = board[i][j];
        String w = word.substring(1);
        board[i][j] = '$';
        boolean res = (
            helper(board, i - 1, j, w) ||
            helper(board, i, j - 1, w) ||
            helper(board, i + 1, j, w) ||
            helper(board, i, j + 1, w)
        );
        board[i][j] = c;
        return res;
        
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; ++i)
            for(int j = 0; j < board[0].length; ++j)
                if(helper(board, i, j, word)) return true;
        return false;
    }
}