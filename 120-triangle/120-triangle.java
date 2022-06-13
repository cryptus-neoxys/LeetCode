class Solution {
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int N = triangle.size();
        int[] dp = new int[N];
        
        for(int i = 0; i < N; ++i) {
            dp[i] = triangle.get(N - 1).get(i);
        }
        for(int i = N - 2; i >= 0; --i) {
            for(int j = 0; j < triangle.get(i).size(); ++j) {
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j+1]);
            }
        }
        
        return dp[0];
    }
    
}