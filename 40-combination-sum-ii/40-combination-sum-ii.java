class Solution {
    
    private List<List<Integer>> res;
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        this.res = new ArrayList<>();
        helper(new ArrayList<>(), candidates, target, 0);
        return this.res;
    }
    
    private void helper(List<Integer> temp, int[] nums, int target, int idx) {
        if(target < 0) return;
        else if(target == 0) this.res.add(new ArrayList(temp));
        else 
            for(int i = idx; i < nums.length; ++i) {
                if(i > idx && nums[i] == nums[i-1]) continue;
                temp.add(nums[i]);
                helper(temp, nums, target - nums[i], i+1);
                temp.remove(temp.size() - 1);
            }
    }
}