class Solution {
    public int[] twoSum(int[] arr, int x) {
        int i = 0, j = arr.length - 1;
        int s = 0;
        while(i < j) {
            s = arr[i] + arr[j];
            if(s < x) i++;
            else if (s > x) j--;
            
            else {
                return new int[] {i+1, j+1};
            }
        }
        return new int[0];
    }
}