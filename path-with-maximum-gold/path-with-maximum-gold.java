class Solution {
    int m, n;
    
    public int dfs(int[][] grid, int i, int j) {
        if(grid[i][j] == 0) return 0;
        
        int res = 0;
        int t = grid[i][j];
        
        grid[i][j] = 0;
        if(j > 0) res = Math.max(res, t + dfs(grid, i, j-1));
        if(i > 0) res = Math.max(res, t + dfs(grid, i - 1, j));
        if(j < m - 1) res = Math.max(res, t + dfs(grid, i, j + 1));
        if(i < n - 1) res = Math.max(res, t + dfs(grid, i + 1, j));
        grid[i][j] = t;
        
        return res;
    }
    
    public int getMaximumGold(int[][] grid) {
        int res = 0;
        n = grid.length;
        m = grid[0].length;
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < m; ++j)
                res = Math.max(res, dfs(grid, i, j));
        
        return res;
    }
}