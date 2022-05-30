class Solution {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 || dividend == Integer.MIN_VALUE && divisor == -1)
                return Integer.MAX_VALUE;
        int res = 0;
        int sign = (divisor < 0) ^ (dividend < 0) ? -1 : 1;
        
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        
        while(ldivisor <= ldividend) {
            long t = ldivisor, m = 1;
            // System.out.println("o");
            while(ldividend >= t << 1) {
                // System.out.println("\ti");
                t <<= 1; m <<= 1;
            }
            ldividend -= t; res += m;
        }
        return sign == 1 ? res : -res;
    }
}