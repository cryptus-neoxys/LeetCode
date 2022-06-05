class Solution {
    private int res;
    private void solveQueens(char[][] chess, int row) {
        if(row == chess.length) {
            res++;
            return;
        }
        
        for(int j = 0; j < chess[0].length; ++j) {
            if(isSafe(chess, row, j)) {
                chess[row][j] = 'Q';
                solveQueens(chess, row+1);
                chess[row][j] = '.';
            }
        }
    }
    
    private boolean isSafe(char[][] chess, int r, int c) {
        // same column
        for(int i = 0; i < r; ++i)
            if(chess[i][c] == 'Q') return false;
        for(int i = r - 1, j = c - 1; i >= 0 && j >= 0; i--, j--)
            if(chess[i][j] == 'Q') return false;
        for(int i = r - 1, j = c + 1; i >= 0 && j < chess.length; i--, j++)
            if(chess[i][j] == 'Q') return false;
        return true;
    }
    
    public int totalNQueens(int n) {
        char[][] chess = new char[n][n];
        res = 0;
        
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)
                chess[i][j] = '.';
        
        solveQueens(chess, 0);
        return res;
    }
}