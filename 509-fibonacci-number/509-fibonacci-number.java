class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int f0 = 0, f1 = 1;
        while(n--> 1) {
            int t = f1;
            f1 = f0 + f1;
            f0 = t;
        }
        
        return f1;
    }
}