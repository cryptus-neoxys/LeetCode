class Solution {
    int[][] arr;
    
    public int dfs(int i, int j) {
        
        if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0) {
            return 0;
        }
        
        arr[i][j] = 0;
        return 1 + dfs(i-1, j) + dfs(i, j+1) + dfs(i+1, j) + dfs(i, j-1);
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        this.arr = grid;
        int res = 0;
        for(int i = 0; i < grid.length; ++i)
            for(int j = 0; j < grid[0].length; ++j)
                if(grid[i][j] == 1)
                    res = Math.max(res, dfs(i, j));
        
        return res;
    }
}