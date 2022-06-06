class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp=new int[n];
        for(int i=n-2;i>=0;i--) {
            dp[i]=n;
            for(int j=1;j<=nums[i]&&i+j<n;j++) 
                dp[i]=Math.min(dp[i],1+dp[i+j]);
        }
        // System.out.println(Arrays.toString(dp));
        return dp[0];
    }
}