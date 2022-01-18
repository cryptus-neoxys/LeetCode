class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int count = 0;
        
        for(int i = 0; i < len; ++i) {
            if(flowerbed[i] == 1) {
                i++; continue;
            } else if(i == len - 1 || flowerbed[i+1] == 0) {
                flowerbed[i] = 1; count++;
                i++;
            }
            // short circuit
            if(count >= n) return true;
        }
        
        return count >= n;
    }
}