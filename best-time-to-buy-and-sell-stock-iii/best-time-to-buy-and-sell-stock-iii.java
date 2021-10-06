class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProf = 0;
        int minP = prices[0];
        int[] dpMPSold = new int[n];
        
        for(int i = 0; i < n; ++i) {
            minP = Math.min(minP, prices[i]);
            maxProf = Math.max(maxProf, prices[i] - minP);
            dpMPSold[i] = maxProf;
        }
        
        maxProf = 0;
        int maxP = prices[n-1];
        int[] dpMPBought = new int[n];
        
        for(int i = n-1; i >= 0; --i) {
            maxP = Math.max(maxP, prices[i]);
            maxProf = Math.max(maxProf, maxP - prices[i]);
            dpMPBought[i] = maxProf;
        }
        
        maxProf = 0;
        for(int i = 0; i < n; ++i) {
            maxProf = Math.max(maxProf, dpMPSold[i] + dpMPBought[i]);
        }
        
        return (maxProf);
    }
}