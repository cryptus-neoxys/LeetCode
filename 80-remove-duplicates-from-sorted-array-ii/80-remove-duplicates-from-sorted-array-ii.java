class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;
        int unique = 2;
        int k = 2;
        
        for(int i = 2; i < nums.length; ++i) {
            if(nums[unique-k] != nums[i]) nums[unique++] = nums[i];
        }
        
        return unique;
    }
}