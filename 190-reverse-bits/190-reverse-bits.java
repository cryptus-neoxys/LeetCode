public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        int i = 0;
        while(i < 32) {
            rev = (rev << 1) | (n & 1);
            n >>= 1;
            i++;
        }
        return rev;
    }
}