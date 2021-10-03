class Solution {
    public int change(int x, int[] coins) {
        int[] dp = new int[x+1];
        dp[0] = 1;
        for(int i = 0; i < coins.length; ++i) {
            for(int j = coins[i]; j <= x; ++j) {
                dp[j] += dp[j - coins[i]];
            }
            // _DEBUG
            // for (int j = 0; j <= x; ++j) System.out.print(dp[j]);
            // System.out.println();
        }
        
        return dp[x];
        
    }
}