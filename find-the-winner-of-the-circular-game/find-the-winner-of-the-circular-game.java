class Solution {
    public int helper(int n, int k) {
        if(n == 1) return 0;
        
        int prev = helper(n-1, k);
        int now  = (prev + k) % n;
        
        return now;
    }
    public int findTheWinner(int n, int k) {
        if(k > n) k %= n;
        return helper(n, k) + 1;
    }
}