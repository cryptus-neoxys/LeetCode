class Solution {
    
    int[][] dp;
    
    private int lis(int[] nums, int idx, int prev_idx) {
        if(idx == nums.length) return 0;
        if(dp[idx][prev_idx + 1] != -1) return dp[idx][prev_idx + 1];
        dp[idx][prev_idx + 1] = lis(nums, idx + 1, prev_idx);
        if(prev_idx == -1 || nums[idx] > nums[prev_idx]) {
             dp[idx][prev_idx + 1] = Math.max(dp[idx][prev_idx + 1], 1 + lis(nums, idx + 1, idx));
        }
        return dp[idx][prev_idx + 1];
    }
    
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        dp = new int[n][n + 1];
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n + 1; ++j)
                dp[i][j] = -1;
        return lis(nums, 0, -1);
    }
}