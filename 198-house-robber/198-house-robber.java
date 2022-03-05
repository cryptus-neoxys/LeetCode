class Solution {
//     private int helper(int[] nums, int i, int amt) {
//         if(i >= nums.length) return amt;
        
//         int leave = helper(nums, i+1, amt);
//         int t = nums[i];
//         if(i == 0 || nums[i-1] != -1) {
//             amt += nums[i]; nums[i] = -1;
//         }
//         int take = helper(nums, i +1, amt);
//         nums[i] = t;
//         // System.out.println(Arrays.toString(nums) + i + " -> " + Math.max(take, leave));
//         return Math.max(take, leave);
//     }
    
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] amt = new int[nums.length];
        amt[0] = nums[0];
        amt[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < nums.length; ++i) {
            amt[i] = Math.max(amt[i - 1], amt[i-2] + nums[i]);
        }
        
        return amt[amt.length - 1];
    }
}