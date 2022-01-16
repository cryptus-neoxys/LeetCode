class Solution {
    public int maxDistToClosest(int[] seats) {
        int res = -1;
        int n = seats.length;
        int[] left = new int[n], right = new int[n];
        Arrays.fill(left, n);
        Arrays.fill(right, n);
        
        
        for(int i = 0; i < n; ++i) {
            if(seats[i] == 1) left[i] = 0;
            else if(i > 0) left[i] = left[i-1] + 1;
        }
        
        int rightClosest = n;
        for(int i = n-1; i >= 0; --i) {
            if(seats[i] == 1) right[i] = 0;
            else if(i < n-1) right[i] = right[i+1] + 1;
        }
        
        for(int i = 0; i < n; ++i) {
            if(seats[i] == 0) res = Math.max(res, Math.min(left[i], right[i]));
        }
        return res;
    }
}