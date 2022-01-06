class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr = new int[10001];
        int rem = 0;
        for(int[] trip: trips) {
            arr[trip[1]] += trip[0];
            arr[trip[2]] -= trip[0];
        }
        // // _debug
        // int i = 0;
        // for(int x: arr) 
        //     if(x != 0)
        //         System.out.println(i++ + " " + x);
        for(int x: arr) {
            rem += x;
            if(rem > capacity) return false;
        }
        return true;
    }
}