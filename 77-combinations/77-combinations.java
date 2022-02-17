class Solution {
    
    private List<List<Integer>> res;
    
    public List<List<Integer>> combine(int n, int k) {
        this.res = new ArrayList<>();
        helper(new ArrayList<>(), n, k, 1);
        return this.res;
    }
    
    private void helper(List<Integer> temp, int n, int k, int idx) {
        if(k == 0) this.res.add(new ArrayList(temp));
        else {
            for(int i = idx; i <= n; ++i) {
                temp.add(i);
                helper(temp, n, k-1, i+1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}