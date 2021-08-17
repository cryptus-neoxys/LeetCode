class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int r = arr.length - 1, l = 0;
        
        while(l < r)
        {
            int m = l + (r - l) / 2;
            if(arr[m] < arr[m + 1]) l = m + 1;
            else r = m;
        }
        
        return l;
    }
}