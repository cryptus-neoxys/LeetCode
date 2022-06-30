class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int M = nums[n / 2];
        int res = 0;
        for(int i: nums) {
            res += Math.abs(M - i);
        }
        return res;
    }
}