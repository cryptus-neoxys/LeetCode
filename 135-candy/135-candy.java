class Solution {
    public int candy(int[] R) {
        int[] candies = new int[R.length];
        Arrays.fill(candies, 1);
        for (int i = 1; i < R.length; ++i) {
            if (R[i] > R[i - 1]) candies[i] = candies[i - 1] + 1;
        }
        int res = candies[R.length - 1];
        for (int i = R.length - 2; i >= 0; --i) {
            if (R[i] > R[i + 1]) 
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            res += candies[i];
        }
        return res;
    }
}