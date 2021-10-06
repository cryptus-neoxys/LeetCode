class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if(n <= 0) return 0;
        int[][] dp = new int[k+1][n];
        
        // for(int j = 0; j < n; ++j) dp[0][j] = 0;
        // for(int i = 0; i < k; ++i) dp[i][0] = 0;
        
        
        for(int i = 1; i <= k; ++i) {
            int maxPrev = -prices[0];
            for(int j = 1; j < n; ++j) {
                maxPrev = Math.max(maxPrev, dp[i-1][j-1] - prices[j-1]);
                dp[i][j] = Math.max(dp[i][j-1], maxPrev + prices[j]);
                
                // _DEBUG
                {
                // System.out.println("Max Prev = " + maxPrev);
                // for(int x = 0; x <= k; ++x) {
                //     for(int y = 0; y < n; ++y) {
                //         System.out.print(dp[x][y] + "\t");
                //     } System.out.println();
                // }
                // System.out.println();
                }
            }
        }
        
        
        return (dp[k][n-1]);

    }
}