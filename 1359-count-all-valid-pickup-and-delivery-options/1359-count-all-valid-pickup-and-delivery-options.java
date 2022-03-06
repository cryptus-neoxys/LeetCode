class Solution {
    public int countOrders(int n) {
        long ans = 1;
        int MOD = 1_000_000_007;
        
        for (int i = 1; i <= 2 * n; ++i) {
            ans = ans * i;
            if (i % 2 == 0) {
                ans = ans / 2;
            }
            ans %= MOD;
        }
        return (int)ans;
    }
}