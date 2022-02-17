class Solution {
    
    private List<List<Integer>> res;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(new ArrayList<>(), candidates, target, 0);
        return res;
    }
    
    // backtrack
    private void helper(List<Integer> temp, int[] nums, int target, int idx) {
        if(target == 0) this.res.add(new ArrayList(temp));
        else if(target < 0) return;
        for(int i = idx; i < nums.length; ++i) {
            temp.add(nums[i]);
            helper(temp, nums, target - nums[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}