class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3) return 0;
        int res = 0, len = 0;
        for(int i = 1; i < nums.length - 1; ++i) {
            while(i < nums.length - 1 && nums[i] - nums[i-1] == nums[i+1] - nums[i]) {
                i++; len++;
            }
            res += (len * (len + 1)) / 2;
            len = 0;
        }
        
        return res;
    }
}