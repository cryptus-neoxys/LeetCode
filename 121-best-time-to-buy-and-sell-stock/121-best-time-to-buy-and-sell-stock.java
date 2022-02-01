class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0], res = 0;
        
        for(int price: prices) {
            if(price < minPrice) minPrice = price;
            res = Math.max(res, price - minPrice);
        }
        
        return res;
    }
}