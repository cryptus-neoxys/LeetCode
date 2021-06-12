class Solution {
    
    public void reverseArr(int[] arr, int k, int begin, int end) {
		while(begin < end) {
			int temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp;
			begin++; end--;
		}
	}
    
    public void rotate(int[] arr, int k) {
		k %= arr.length;
		reverseArr(arr, k, 0, arr.length - 1);
		reverseArr(arr, k, 0, k-1);
		reverseArr(arr, k, k, arr.length -1);
    }
}