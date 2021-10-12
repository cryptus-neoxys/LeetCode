class Solution {
    private void solveQueens(char[][] chess, List<List<String>> res, int row) {
        if(row == chess.length) {
            res.add(build(chess));
            return;
        }
        
        for(int j = 0; j < chess[0].length; ++j) {
            if(isSafe(chess, row, j)) {
                chess[row][j] = 'Q';
                solveQueens(chess, res, row+1);
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
    
    private List<String> build(char[][] chess) {
        List<String> p = new ArrayList<>();
        for(int i = 0; i < chess.length; ++i) p.add(new String(chess[i]));
        return p;
    }
    
    public List<List<String>> solveNQueens(int n) {
        char[][] chess = new char[n][n];
        List<List<String>> res = new ArrayList<>();
        
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)
                chess[i][j] = '.';
        
        solveQueens(chess, res, 0);
        return res;
    }
}