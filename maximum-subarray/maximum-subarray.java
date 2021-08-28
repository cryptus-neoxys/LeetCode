class Solution {
    public int maxSubArray(int[] nums) {
        int M = nums[0], m = nums[0];
        
        for(int i = 1; i < nums.length; ++i) {
            m += nums[i];
            if(m < nums[i]) m = nums[i];
            M = Math.max(M, m);
        }
        
        return M;
    }
}