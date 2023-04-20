class Solution {
    
    private boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); ++i) {
            if(n % i == 0) return false;
        }
        return true;
    }
    
    public int diagonalPrime(int[][] nums) {
        int N = nums.length;
        int res = 0;
        for(int i = 0; i < N; ++i) {
            if(isPrime(nums[i][i])) res = Math.max(res, nums[i][i]);
            if(isPrime(nums[i][N - i - 1])) res = Math.max(res, nums[i][N - i - 1]);
        }
        
        return res;
    }
}