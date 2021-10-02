class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 2 || n <= 0) return false;
        while(n > 1) {
            int r = n % 3;
            int q = n / 3;
            
            if(r != 0) return false;
            
            n = q;
        }
        
        return true;
    }
}