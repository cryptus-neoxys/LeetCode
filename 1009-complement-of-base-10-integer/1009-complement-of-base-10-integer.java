class Solution {
    public int bitwiseComplement(int n) {
        int i = 1, k = 1;
        while(i < n) {
            k = k << 1;
            i += k;
        }
        return n ^ i;
    }
}