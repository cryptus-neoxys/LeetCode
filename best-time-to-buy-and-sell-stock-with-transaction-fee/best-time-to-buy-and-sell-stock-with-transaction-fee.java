class Solution {
    public int maxProfit(int[] prices, int fee) {
        int b = -prices[0], s = 0;
        for(int i = 1; i < prices.length; ++i) {
            int newB = Math.max(s - prices[i], b);
            int newS = Math.max(s, b + prices[i] - fee);
            
            b = newB;
            s = newS;
        }
        
        return Math.max(b, s);
    }
}