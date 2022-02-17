class Solution {
    
    private List<List<Integer>> res; 
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        this.res = new ArrayList<>();
        helper(new ArrayList<>(), n, k, 1);
        return this.res;
    }
    
    private void helper(List<Integer> temp, int n, int k, int idx) {
        if(n < 0) return;
        if(k == 0 && n == 0) this.res.add(new ArrayList(temp));
        else {
            for(int i = idx; i <= 9; ++i) {
                temp.add(i);
                helper(temp, n - i, k-1, i+1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}