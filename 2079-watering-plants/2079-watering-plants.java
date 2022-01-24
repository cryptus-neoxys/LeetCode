class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int N = plants.length;
        int s = capacity;
        int res = 0;
        for(int i = 0; i < N; ++i) {
            if(plants[i] > s) {
                res += 2 * i;
                s = capacity;
            }
            s -= plants[i];
            res++;
        }
        
        return res;
    }
}