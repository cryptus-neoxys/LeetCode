class Solution {
    private int res;
    public int countSubstrings(String s) {
        res = 0;
        for(int i = 0; i < s.length(); ++i) {
            extendPal(s, i, i);
            extendPal(s, i, i + 1);
        }
        return res;
    }
    
    private void extendPal(String s, int l, int r) {
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            res++; l--; r++;
        }
    }
}