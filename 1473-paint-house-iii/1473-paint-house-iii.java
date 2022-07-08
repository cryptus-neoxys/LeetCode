class Solution {
    
    private int[][][] dp;
    private int M = 100_000_000;
    
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        // house ID / Remaining T / prev Color
        dp = new int[m+1][target+1][n+1];
        
        int res = helper(houses, cost, 0, target, 0, n);
        
        return res == M ? -1 : res;
    }
    
    private int helper(int[] houses, int[][] cost, int i, int target, int lastColor, int n) {
        if(target < 0  || i >= houses.length) {
            return target == 0 ? target : M;
        }
        
        if(dp[i][target][lastColor] > 0) return dp[i][target][lastColor];
        
        if(houses[i] != 0) {
            if(lastColor != houses[i]) {
                target -= 1;
            }
            return helper(houses, cost, i + 1, target, houses[i], n);
        }
        
        int res = M;
        for(int color = 1; color <= n; color++) {
            res = Math.min(res, cost[i][color-1] + helper(houses, cost, i + 1, target - ((lastColor != color) ? 1 : 0), color, n));
        }
        
        return dp[i][target][lastColor] = res;
        
        // return res;
    }
    
}