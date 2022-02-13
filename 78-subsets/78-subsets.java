class Solution {
    
    private void helper(int[] nums, List<List<Integer>> res, List<Integer> temp, int i) {
        List<Integer> tt = new ArrayList<>(temp);
        if(i == nums.length) {
            res.add(tt);
            return;
        }
        tt.add(nums[i]);
        helper(nums, res, tt, i + 1);
        tt.remove(tt.size() - 1);
        helper(nums, res, tt, i + 1);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(nums, res, temp, 0);
        return res;
    }
}