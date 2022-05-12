class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        boolean[] vis = new boolean[nums.length];
        List<Integer> ls = new ArrayList<Integer>();
        Arrays.sort(nums);
        helper(nums, vis, ls, res);
        return res;
    }
    
        public void helper(int[] nums, boolean[] vis, List<Integer> ls, List<List<Integer>> res) {
            if(ls.size() == nums.length) {
                res.add(new ArrayList<Integer>(ls));
                return;
            }
            for(int i = 0; i < nums.length; ++i) {
                if(!vis[i]) {
                    if(i>0 &&nums[i-1]==nums[i] && !vis[i-1]) continue;
                    vis[i] = true;
                    ls.add(nums[i]);
                    helper(nums, vis, ls, res);
                    vis[i] = false;
                    ls.remove(ls.size() - 1);
                }
            }
        }

}