class Solution {
    public int maxProfit(int[] prices) {
        int bCost = -prices[0], sCost = 0, cCost = 0;
        for(int i = 1; i < prices.length; ++i) {
            int newBCost = Math.max(cCost - prices[i], bCost);
            int newSCost = Math.max(bCost + prices[i], sCost);
            int newCCost = sCost;
            
            bCost = newBCost;
            sCost = newSCost;
            cCost = newCCost;    
        }
        
        return (Math.max(bCost, Math.max(sCost, cCost)));
    }
}