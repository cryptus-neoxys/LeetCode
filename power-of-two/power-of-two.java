class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 1) return false;
        while(n > 1) {
            int r = n % 2;
            int q = n / 2;
            
            if(r == 1) return false;
            
            n = q;
        }
        
        return true;
    }
}