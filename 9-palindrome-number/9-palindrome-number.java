class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        long r = 0, num = x;
        while(num > 0) {
            r = (r * 10) + num % 10;
            num /= 10;
        }
        // System.out.println(r);
        return r == x;
    }
}