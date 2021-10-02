class Solution {
    
    public int dfs(int[][] grid, int i, int j) {
        
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        
        // if((i-1 >= 0 && grid[i-1][j] == 0) && 
        //    (j+1 <= grid[0].length - 1 && grid[i][j + 1] == 0) &&
        //    (i+1 <= grid.length - 1 && grid[i + 1][j] == 0) &&
        //    (j-1 >= 0 && grid[i][j - 1] == 0)) {
        //     return 1;
        // }
        
        grid[i][j] = 0;
        return 1 + dfs(grid, i-1, j) + dfs(grid, i, j+1) + dfs(grid, i+1, j) + dfs(grid, i, j-1);
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; ++i) {
            for(int j = 0; j < grid[0].length; ++j) {
                if(grid[i][j] == 1) res = Math.max(res, dfs(grid, i, j));
            }
        }
        
        return res;
    }
}