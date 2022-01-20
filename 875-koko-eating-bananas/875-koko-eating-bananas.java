class Solution {
    
    private boolean canEat(int[] piles, int h, int k) {
        int hoursToEat = 0;
        
        for(int bananas: piles) {
            hoursToEat += (bananas + k - 1) / k;
        }
        
        return hoursToEat <= h;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(canEat(piles, h, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        
        return l;
    }
}