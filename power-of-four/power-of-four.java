class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 3 || n == 2 || n <= 0) return false;
        while(n > 1) {
            int r = n % 4;
            int q = n / 4;
            
            if(r != 0) return false;
            
            n = q;
        }
        
        return true;
    }
}