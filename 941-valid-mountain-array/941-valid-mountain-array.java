class Solution {
    public boolean validMountainArray(int[] arr) {
        int N = arr.length;
        if(N < 3) return false;
        
        int i = 1;

        while(i < N && arr[i] > arr[i - 1]) i++;
        
        if(i == N || i == 1) return false;
        
        while(i < N) {
            if(arr[i] >= arr[i-1]) return false;
            i++;
        }
        
        return true;
    }
}