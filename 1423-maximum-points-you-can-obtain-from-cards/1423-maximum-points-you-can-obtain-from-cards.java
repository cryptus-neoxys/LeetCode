class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int s = IntStream.of(arr).sum();
        int ks = IntStream.range(0, n-k).map(i -> arr[i]).sum();
        
        // System.out.println(s + " " + ks);
        int is = ks, i = n-k;
        while(i < n) {
            ks = ks + arr[i] - arr[i-n+k];
            // System.out.println(i + "->" + ks);
            is = Math.min(is, ks);
            i++;
        }
        
        return s-is;
    }
}