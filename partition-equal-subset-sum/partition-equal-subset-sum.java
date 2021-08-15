class Solution {
    public boolean subsetSum(int[] nums, int sum) {
        int n = nums.length;
        boolean[][] t = new boolean[n+1][sum+1];
        
        for(int i = 0; i <= sum; ++i) t[0][i] = false;
        for(int i = 0; i <= n; ++i) t[i][0] = true;
        
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= sum; ++j)
            {
                if(nums[i-1] > j) {
                    t[i][j] = t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j] || t[i-1][j-nums[i-1]];
                }
            }
        }
        // DEBUG OUT
        // for(int i = 0; i <= n; i++)
        // {
        //     for(int j = 0; j <= sum; ++j)
        //     {
        //         System.out.printf(t[i][j] + "\t");
        //     }
        //     System.out.println();
        // }
        
        return t[n][sum];
    }
    public boolean canPartition(int[] nums) {
        int n = nums.length, s = 0;
        for(int i = 0; i < n; ++i) s += nums[i];
        
        if(s % 2 != 0) return false;
        else return subsetSum(nums, s/2);
    }
}