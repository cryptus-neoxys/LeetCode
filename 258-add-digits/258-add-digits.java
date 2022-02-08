class Solution {
    public int addDigits(int num) {
        int res = num % 9;
        if(res == 0) return num == 0 ? 0 : 9;
        return res;
    }
}