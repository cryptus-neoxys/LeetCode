class Solution {
    public int minOperations(int[] nums, int x) {
        int N = nums.length;
        int S  = 0;
        int res = -1;
        for(int n: nums) S += n;
        
        int l = 0, r = 0, winSum = 0;
        
        while(r < N) {
            winSum += nums[r];
            
            while(l <= r && winSum > (S - x)) {
                winSum -= nums[l];
                l++;
            }
            
            if(winSum == S - x) {
                res = Math.max(res, r - l + 1);
            }
            r++;
        }
        
        return res == -1 ? -1 : N - res;
    }
}