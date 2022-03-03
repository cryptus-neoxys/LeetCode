class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3) return 0;
        int res = 0, len = 0;
        for(int i = 1; i < nums.length - 1; ++i) {
            if(nums[i] - nums[i-1] == nums[i+1] - nums[i]) {
                len+= 1;
                res += len;
            } else len = 0;
        }
        
        return res;
    }
}