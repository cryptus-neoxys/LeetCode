class Solution {
    
    private Integer[][] cache;
    
    private int helper(int r, int p, List<List<Integer>> triangle) {
        if(r >= triangle.size() - 1) return triangle.get(r).get(p);
        
        if(cache[r][p] != null) return cache[r][p];
        
        cache[r][p] = triangle.get(r).get(p) + Math.min(helper(r + 1, p, triangle), helper(r + 1, p+1, triangle));
        
        return cache[r][p];
    }
    
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size() == 0) return 0;
        cache = new Integer[triangle.size()][triangle.size()];
        return helper(0, 0, triangle);
    }
}