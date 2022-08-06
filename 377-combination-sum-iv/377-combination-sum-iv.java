class Solution {
    HashMap<Integer, Integer> hm;
    int helper(int[] nums, int cur, int target) {
        if(target < cur) return 0;
        if(target == cur) return 1;
        int ans = 0;
        if(hm.get(cur) != null) return hm.get(cur);
        for(int i = 0; i < nums.length; ++i) {
            ans += helper(nums, cur + nums[i], target);
        }
        hm.put(cur, ans);
        return ans;
    }
    
    public int combinationSum4(int[] nums, int target) {
        hm = new HashMap<>();
        return helper(nums, 0, target);
    }
}