class Solution {
    public int[] runningSum(int[] nums) {
        int N = nums.length;
        int[] res = new int[N];
        res[0] = nums[0];
        for(int i = 1; i < N; ++i) {
            res[i] = res[i-1] + nums[i];
        }
        return res;
    }
}